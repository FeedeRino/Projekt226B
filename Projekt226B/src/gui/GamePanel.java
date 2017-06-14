package gui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dto.Game;

public class GamePanel extends JPanel {

	
	private JLabel titel = new JLabel();
	
	private JButton start = new JButton("Start");
	private JButton bez = new JButton("Beschreibung");
	
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
		this.setBorder(new EmptyBorder(10,10,10,10));
	}
	
}
