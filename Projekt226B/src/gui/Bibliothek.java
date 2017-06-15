package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dto.Game;
import logic.startGames;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Bibliothek extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton button_3;

	startGames sg = new startGames();
	ArrayList<Game> ag = sg.getAllGames();
	GamePanel g1, g2, g3, g4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bibliothek frame = new Bibliothek();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bibliothek() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel main = new JPanel();
		contentPane.add(main, BorderLayout.CENTER);
		main.setLayout(new BorderLayout(0, 0));

		JPanel main_n = new JPanel();
		main.add(main_n, BorderLayout.NORTH);
		main_n.setLayout(new GridLayout(1, 0, 0, 0));

		JLabel lblGame = new JLabel("Bibliothek");
		lblGame.setFont(new Font("Tahoma", Font.PLAIN, 32));
		main_n.add(lblGame);

		JPanel panel_4 = new JPanel();
		main.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		button_3 = new JButton("Details");

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);

		g1 = new GamePanel(ag.get(0));
		g2 = new GamePanel(ag.get(1));
		g3 = new GamePanel(ag.get(2));
		g4 = new GamePanel(ag.get(3));

		panel_4.add(g1);
		panel_4.add(g2);
		panel_4.add(g3);
		panel_4.add(g4);

		g1.start.addActionListener(this);
		g2.start.addActionListener(this);
		g3.start.addActionListener(this);
		g4.start.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == g1.start) {

			try {
				sg.startGame(ag.get(0));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == g2.start) {

			try {
				sg.startGame(ag.get(1));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == g3.start) {

			try {
				sg.startGame(ag.get(2));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == g4.start) {

			try {
				sg.startGame(ag.get(3));
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

	}

}
