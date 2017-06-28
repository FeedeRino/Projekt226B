package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dto.Game;

/**
 * JPanel auf dem die Spiele dargestellt werden 
 * @author Jannick Mueller
 *
 */

public class GamePanel extends JPanel {

	private JLabel titel = new JLabel();

	protected JButton start = new JButton("Start");
	protected JButton bez = new JButton("Beschreibung");

	private Game g;

	/** 
	 * stellt die Spiele mit Titel und Butons dar 
	 * @param g
	 */

	public GamePanel(Game g) {

		this.g = g;
		this.setLayout(new GridLayout(3, 1));
		if (this.g != null) {
			titel.setText(this.g.getTitel());
		}
		this.add(titel);
		this.add(start);
		this.add(bez);
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
	}
}
