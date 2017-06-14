package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dto.Game;

public class GamePanel extends JPanel {

	
	private JLabel titel = new JLabel();
	
	private JButton start = new JButton();
	private JButton bez = new JButton();
	
	private Game g;
	
	public GamePanel(Game g) {
		
		this.g = g;
		this.setLayout(new GridLayout(3,1));
		if(this.g != null) {
			titel.setText(this.g.getTitel());
		}
		this.add(titel);
		this.add(start);
		this.add(bez);
		
	}
	
}
