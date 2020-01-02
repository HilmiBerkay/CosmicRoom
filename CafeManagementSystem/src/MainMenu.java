import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class MainMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton MMchecks = new JButton("Checks");
		MMchecks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TableSelection1 tab1 = new TableSelection1();
				tab1.setVisible(true);
				setVisible(false);
			}
		});
		MMchecks.setBounds(335, 270, 248, 46);
		contentPane.add(MMchecks);
		
		JButton MMtablesection = new JButton("TableSection");
		MMtablesection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TableSelection tableSelection = new TableSelection();
				tableSelection.setVisible(true);
				setVisible(false);
			}
		});
		MMtablesection.setBounds(335, 185, 248, 46);
		contentPane.add(MMtablesection);
		
		JButton MMlogout = new JButton("Log Out");
		MMlogout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		MMlogout.setBounds(335, 351, 248, 46);
		contentPane.add(MMlogout);
		
		JLabel lblCafeManagementSystem = new JLabel("Cafe Management System");
		lblCafeManagementSystem.setFont(new Font("Vladimir Script", Font.PLAIN, 34));
		lblCafeManagementSystem.setBounds(317, 11, 337, 34);
		contentPane.add(lblCafeManagementSystem);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblMainMenu.setBounds(360, 116, 207, 34);
		contentPane.add(lblMainMenu);
		
	
	}
}
