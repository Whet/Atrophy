package atrophy.combat.ai;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import atrophy.combat.level.LevelBlock;

public class CommanderDebugger {

	private final TeamsCommander commander;
	private JTextArea debugText;
	private JButton updateButton;
	private JFrame frame;
	
	@SuppressWarnings("serial")
	public CommanderDebugger(final TeamsCommander commander, final int x, final int y) {
		this.commander = commander;
		
		debugText = new JTextArea() {
			{
				this.setEditable(false);
			}
			
			@Override
			public void append(String str) {
				super.append(str + "\n");
			}
		};
		updateButton = new JButton("Update");
		
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				updateDebugText();
			}

		});
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				frame = new JFrame("Commander: " + commander.getFaction());
				frame.setLocation(x, y);
				frame.getContentPane().setLayout(new BorderLayout());
				JScrollPane scroll = new JScrollPane ( debugText );
			    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
				frame.add(scroll, BorderLayout.CENTER);
				frame.add(updateButton, BorderLayout.SOUTH);
				frame.pack();
				frame.setSize(frame.getWidth() + 100, frame.getHeight() + 100);
				frame.setVisible(true);
				frame.setAlwaysOnTop(true);
			}
		});
		
		updateDebugText();
		
	}
	
	private void updateDebugText() {
		debugText.setText("");
		
		debugText.append("Alliances: ");
		
		for(Faction alliance: commander.getAlliances()) {
			debugText.append(alliance + " ");
		}
		
		debugText.append("\nFriends: ");
		
		for(Ai ai: commander.getFriends()) {
			debugText.append(ai.getName() + " ");
		}
		
		debugText.append("\nHated: ");
		
		for(Ai ai: commander.getHatedAi()) {
			debugText.append(ai.getName() + " ");
		}
		
		debugText.append("\nSuspected: ");
		
		for(Ai ai: commander.getSuspectedAi().keySet()) {
			debugText.append(ai.getName() + " ");
		}
		
		
		debugText.append("\n---- JOBS ----\n");
		
		debugText.append("Open Jobs\n");
		
		for(AiJob job: commander.getJobs()) {
			
			int employed = 0;
			Set<Ai> employees = new HashSet<>();
			
			for(Entry<Ai, AiJob> entry: commander.getJobAssignments().entrySet()) {
				if(entry.getValue().equals(job)) {
					employed++;
					employees.add(entry.getKey());
				}
			}
			
			debugText.append(job.getType().toString() + " in room " + job.getJobBlock().getCode() + " target ai count: " + job.getTargetEmployeeCount() + " has: " + employed + "\n{");
			
			for(Ai ai: employees) {
				debugText.append(ai.getName() + " ");
			}
			
		}
		
		debugText.append("}\n");
		
		debugText.append("---- DEFENCE VALUES ----\n");
		
		for (Entry<LevelBlock, DefenceHeuristic> entry: commander.getDefenceHeuristics().entrySet()) {
			debugText.append(entry.getKey().getCode() + " Def: " + entry.getValue().defenceH + " Dan: " + entry.getValue().dangerH + " Mis: " + entry.getValue().missionH);
		}
	}
	
//	public Set<String> getAlliances() {
//		return alliances;
//	}
//
//	public Set<Ai> getHatedAi() {
//		return hatedAi;
//	}
//
//	public Set<Ai> getFriends() {
//		return friends;
//	}
//
//	public Set<Ai> getInvestigatedAi() {
//		return investigatedAi;
//	}
//
//	public Map<Ai, Integer> getSuspectedAi() {
//		return suspectedAi;
//	}
//
//	public Map<Ai, AiJob> getJobAssignments() {
//		return jobAssignments;
//	}
//
//	public Map<LevelBlock, DefenceHeuristic> getDefenceHeuristics() {
//		return defenceHeuristics;
//	}
//
//	public PriorityQueue<AiJob> getJobs() {
//		return jobs;
	

}
