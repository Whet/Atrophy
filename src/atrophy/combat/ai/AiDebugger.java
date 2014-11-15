package atrophy.combat.ai;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class AiDebugger {

	private final Ai ai;
	private JFrame frame;
	private JTextArea debugText;
	private JButton updateButton;
	
	@SuppressWarnings("serial")
	public AiDebugger(final int x, final int y, final Ai ai) {
		
		this.ai = ai;
		
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
		JButton lookAtCommander = new JButton("Look At Commander");
		
		lookAtCommander.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new CommanderDebugger(((ThinkingAi) ai).getCommander(), frame.getX(), frame.getY());
			}

		});
		
		final JPanel buttonFrame = new JPanel();
		
		buttonFrame.add(updateButton);
		buttonFrame.add(lookAtCommander);
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				frame = new JFrame("Ai: " + ai.getName());
				frame.setLocation(x, y);
				frame.getContentPane().setLayout(new BorderLayout());
				frame.add(debugText, BorderLayout.CENTER);
				frame.add(buttonFrame, BorderLayout.SOUTH);
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
		
		debugText.append("CS: " + ai.getCombatScore());
		
		debugText.append("Name: " + ai.getName());
		
		if(ai.getTargetAi() != null)
			debugText.append("TargetAi: " + ai.getTargetAi().getName());
		
		if(ai.getAction() != null)
			debugText.append("Action: " + ai.getAction());
		
		debugText.append("ActionTurns: " + ai.getActionTurns());
		
		if(ai instanceof ThinkingAi) {
			
			debugText.append("--- THINKING AI ---");
			
			ThinkingAi ai = (ThinkingAi) this.ai;
			
			debugText.append("Aggression: " + ai.getAggression());
			
			if(ai.getJob() != null) {
				debugText.append("Job: " + ai.getJob().getType().toString());
				debugText.append("In Room: " + (ai.getJob().getJobBlock() == ai.getLevelBlock()));
			}
			
			
		}
	}
	
	
}
