package atrophy.combat.mechanics;

import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.SwingUtilities;

import atrophy.combat.ai.Ai;
import atrophy.combat.ai.AiCombatActions;

public class TurnOrderer {

	private volatile int gameTime;
	
	private LinkedList<TurnOrder> turnQueue;
	
	private TurnOrder currentTurn;
	
	private Timer turnTimer;
	
	private TurnProcess turnProcess;
	private TimerTask timerTask;
	
	private long pausedTimerWait;
	private boolean paused;
	
	public TurnOrderer() {
		this.turnQueue = new LinkedList<>();
		turnTimer = new Timer();
		this.paused = true;
		this.gameTime = 0;
	}
	
	public void setTurnProcess(TurnProcess turnProcess) {
		this.turnProcess = turnProcess;
	}

	public void add(Ai ai) {
		this.turnQueue.add(new TurnOrder(ai, new Random().nextInt(4) + 1));
	}

	public void replaceAi(Ai ai, Ai newAi) {
		for(int i = 0; i < turnQueue.size(); i++) {
			if(turnQueue.get(i).getAi() == ai) {
				turnQueue.get(i).setAi(newAi);
				
				if(ai.isDead() && !newAi.isDead())
					turnQueue.get(i).setWaitTime(10);
			}
		}
	}

	public void orderAi() {
		PriorityQueue<TurnOrder> orderedList = new PriorityQueue<TurnOrder>(10, new Comparator<TurnOrder>() {

			@Override
			public int compare(TurnOrder arg0, TurnOrder arg1) {
				
				if(arg0.getWaitTime() > arg1.getWaitTime())
					return 1;
				else if(arg1.getWaitTime() > arg1.getWaitTime())
					return -1;
				
				return 0;
			}
		});
		
		// Add turns into queue to put them in order
		for(TurnOrder order:turnQueue) {
			
			if(currentTurn != null && order.getAi() != currentTurn.getAi() && !order.getAi().isDead())
				order.decreaseWaitTime(currentTurn.getWaitTime());
			
			orderedList.add(order);
		}
		
		// Replace turn queue with the new ordered queue
		turnQueue.clear();
		
		for(TurnOrder order:orderedList) {
			turnQueue.add(order);
		}
		
		currentTurn = turnQueue.peek();
	}

	private void updateWaitTime(TurnOrder turn) {
		switch(turn.getAi().getAction()) {
			case AiCombatActions.AIMING:
				turn.setWaitTime(2);
			break;
			case AiCombatActions.SHOOTING:
				turn.setWaitTime(3);
			break;
			default:
				turn.setWaitTime(1);
			break;
		}
		
		turn.timeIncreased = true;
	}
	
	public void turnOver() {
		updateWaitTime(currentTurn);
		orderAi();
		
		if(currentTurn.getWaitTime() <= 0) {
			turnProcess.endTurn();
			return;
		}
		
		currentTurn = null;
		orderAi();
		for(TurnOrder order:this.turnQueue) {
			order.timeIncreased = false;
			System.out.println(order.getAi().getName() + " waits for " + order.getWaitTime());
		}
		
		// If it doesn't get invoked later errors don't show
		if(!this.isPaused())
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				timerTask = new TimerTask() {
					
					@Override
					public void run() {
						gameTime += currentTurn.waitTime;
						turnProcess.endTurn();
					}
					
				};
				turnTimer.schedule(timerTask, currentTurn.getWaitTime() * getTimeFactor());
			}
		});
		
	}

	public Ai getTopAi() {
		return this.turnQueue.peek().getAi();
	}

	public Ai getNextAiTurn() {
		
		TurnOrder poll = this.turnQueue.poll();
		turnQueue.add(poll);
		
		return poll.getAi();
	}
	
	private static class TurnOrder {
		
		private Ai ai;
		private int waitTime;
		private boolean timeIncreased;
		
		public TurnOrder(Ai ai, int waitTime) {
			this.ai = ai;
			this.waitTime = waitTime;
			timeIncreased = false;
		}

		public void decreaseWaitTime(int time) {
			if(!timeIncreased)
				this.waitTime -= time;
		}
		
		public int getWaitTime() {
			return waitTime;
		}

		public void setWaitTime(int waitTime) {
			this.waitTime = waitTime;
			this.timeIncreased = true;
		}

		public Ai getAi() {
			return ai;
		}

		public void setAi(Ai ai) {
			this.ai = ai;
		}
		
	}
	
	public void togglePaused() {
		if(paused) {
			resume();
		}
		else {
			pause();
		}
	}
	
	public boolean isPaused() {
		return paused;
	}

	public void pause() {
		if(paused)
			return;
		
		pausedTimerWait = timerTask.scheduledExecutionTime() - Calendar.getInstance().getTimeInMillis();
		timerTask.cancel();
		paused = true;
	}
	
	public void resume() {
		paused = false;
		timerTask = new TimerTask() {
			
			@Override
			public void run() {
				turnProcess.endTurn();
				gameTime += currentTurn.waitTime;
			}
			
		};
		turnTimer.schedule(timerTask, pausedTimerWait);
	}

	public int getTimeFactor() {
		return new Random().nextInt(1400) + 800;
	}

	public int getTime() {
		return this.gameTime;
	}

	public void cleanup() {
		this.turnTimer.cancel();
		this.turnTimer.purge();
	}

}
