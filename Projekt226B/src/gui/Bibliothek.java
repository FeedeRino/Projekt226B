package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import java.awt.event.ActionEvent;

public class Bibliothek extends JFrame {

	private JPanel contentPane;

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
		
		JPanel main_c = new JPanel();
		main.add(main_c, BorderLayout.CENTER);
		GridBagLayout gbl_main_c = new GridBagLayout();
		gbl_main_c.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_main_c.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_main_c.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_main_c.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		main_c.setLayout(gbl_main_c);
		
		JLabel lblGame_1 = new JLabel("Agar.io");
		lblGame_1.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblGame_1 = new GridBagConstraints();
		gbc_lblGame_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblGame_1.gridheight = 2;
		gbc_lblGame_1.gridx = 2;
		gbc_lblGame_1.gridy = 1;
		main_c.add(lblGame_1, gbc_lblGame_1);
		
		JLabel lblGame_2 = new JLabel("Forge of Empires");
		lblGame_2.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblGame_2 = new GridBagConstraints();
		gbc_lblGame_2.gridwidth = 5;
		gbc_lblGame_2.gridheight = 2;
		gbc_lblGame_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblGame_2.gridx = 4;
		gbc_lblGame_2.gridy = 1;
		main_c.add(lblGame_2, gbc_lblGame_2);
		
		JLabel lblMahjong = new JLabel("Mahjong");
		lblMahjong.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMahjong = new GridBagConstraints();
		gbc_lblMahjong.gridheight = 2;
		gbc_lblMahjong.insets = new Insets(0, 0, 5, 5);
		gbc_lblMahjong.gridx = 10;
		gbc_lblMahjong.gridy = 1;
		main_c.add(lblMahjong, gbc_lblMahjong);
		
		JLabel lblMinesweeper = new JLabel("Minesweeper");
		lblMinesweeper.setFont(new Font("Arial", Font.PLAIN, 20));
		GridBagConstraints gbc_lblMinesweeper = new GridBagConstraints();
		gbc_lblMinesweeper.gridwidth = 3;
		gbc_lblMinesweeper.gridheight = 2;
		gbc_lblMinesweeper.insets = new Insets(0, 0, 5, 5);
		gbc_lblMinesweeper.gridx = 12;
		gbc_lblMinesweeper.gridy = 1;
		main_c.add(lblMinesweeper, gbc_lblMinesweeper);
		
		JButton btnStart = new JButton("Start");
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.gridx = 2;
		gbc_btnStart.gridy = 3;
		main_c.add(btnStart, gbc_btnStart);
		
		JButton btnStart_1 = new JButton("Start");
		GridBagConstraints gbc_btnStart_1 = new GridBagConstraints();
		gbc_btnStart_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart_1.gridx = 6;
		gbc_btnStart_1.gridy = 3;
		main_c.add(btnStart_1, gbc_btnStart_1);
		
		JButton btnStart_2 = new JButton("Start");
		GridBagConstraints gbc_btnStart_2 = new GridBagConstraints();
		gbc_btnStart_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart_2.gridx = 10;
		gbc_btnStart_2.gridy = 3;
		main_c.add(btnStart_2, gbc_btnStart_2);
		
		JButton btnStart_3 = new JButton("Start");
		btnStart_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnStart_3 = new GridBagConstraints();
		gbc_btnStart_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart_3.gridx = 13;
		gbc_btnStart_3.gridy = 3;
		main_c.add(btnStart_3, gbc_btnStart_3);
		
		JButton btnDetails = new JButton("Details");
		GridBagConstraints gbc_btnDetails = new GridBagConstraints();
		gbc_btnDetails.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetails.gridx = 2;
		gbc_btnDetails.gridy = 4;
		main_c.add(btnDetails, gbc_btnDetails);
		
		JButton button_1 = new JButton("Details");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 6;
		gbc_button_1.gridy = 4;
		main_c.add(button_1, gbc_button_1);
		
		JButton button_3 = new JButton("Details"); 
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 10;
		gbc_button_3.gridy = 4;
		main_c.add(button_3, gbc_button_3);
		
		JButton button_5 = new JButton("Details");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 13;
		gbc_button_5.gridy = 4;
		main_c.add(button_5, gbc_button_5);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.gridx = 18;
		gbc_label.gridy = 10;
		main_c.add(label, gbc_label);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
	}

}
