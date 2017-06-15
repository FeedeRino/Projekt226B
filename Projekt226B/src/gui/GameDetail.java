package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GameDetail extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameDetail frame = new GameDetail("", "");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GameDetail(String titel, String info) {
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

		JLabel lblGame = new JLabel(titel);
		lblGame.setFont(new Font("Tahoma", Font.PLAIN, 32));
		main_n.add(lblGame);

		JPanel main_w = new JPanel();
		main.add(main_w, BorderLayout.WEST);
		main_w.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("                                         ");
		main_w.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		main_w.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		main_w.add(lblNewLabel_2);

		JPanel main_c = new JPanel();
		main.add(main_c, BorderLayout.CENTER);
		main_c.setLayout(new BorderLayout(0, 0));

		// JLabel Beschreibung = new JLabel(info);
		// Beschreibung.setHorizontalAlignment(SwingConstants.CENTER);
		// Beschreibung.setFont(new Font("Tahoma", Font.PLAIN, 30));
		// main_c.add(Beschreibung);

		JTextArea tA = new JTextArea(info);
		JScrollPane scrollPane = new JScrollPane(tA);
		tA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tA.setLineWrap(true);
		tA.setWrapStyleWord(true);
		tA.setEditable(false);
		main_c.add(tA);

		JLabel lblNewLabel_3 = new JLabel(" ");
		main_c.add(lblNewLabel_3, BorderLayout.NORTH);

		JLabel lblNewLabel_4 = new JLabel("    ");
		main_c.add(lblNewLabel_4, BorderLayout.WEST);

		JLabel lblNewLabel_5 = new JLabel("    ");
		main_c.add(lblNewLabel_5, BorderLayout.EAST);

		JLabel lblNewLabel_6 = new JLabel("    ");
		main_c.add(lblNewLabel_6, BorderLayout.SOUTH);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.NORTH);

		setVisible(true);

	}

}
