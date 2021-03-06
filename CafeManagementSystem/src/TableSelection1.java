import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableSelection1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TableSelection1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 520);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Table1 = new JButton("T1");
		Table1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	
				CheckFis checkfis=new CheckFis("T1");
				checkfis.setVisible(true);
				checkfis.setTitle("T1");
				setVisible(false);
				
			}
		});
		Table1.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table1.setForeground(new Color(0, 0, 0));
		Table1.setBackground(new Color(255, 140, 0));
		Table1.setBounds(54, 46, 89, 88);
		contentPane.add(Table1);
		
		JPanel panel = new JPanel();
		panel.setBounds(536, 300, 10, 181);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(536, 0, 10, 181);
		contentPane.add(panel_1);
		
		JButton Table4 = new JButton("T4");
		Table4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				CheckFis checkfis=new CheckFis("T4");
				checkfis.setVisible(true);
				checkfis.setTitle("T4");
				setVisible(false);
				
			}
		});
		Table4.setForeground(Color.BLACK);
		Table4.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table4.setBackground(new Color(255, 140, 0));
		Table4.setBounds(240, 46, 89, 88);
		contentPane.add(Table4);
		
		JButton Table7 = new JButton("T7");
		Table7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T7");
				checkfis.setVisible(true);
				checkfis.setTitle("T7");
				setVisible(false);
				
			}
		});
		Table7.setForeground(Color.BLACK);
		Table7.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table7.setBackground(new Color(255, 140, 0));
		Table7.setBounds(407, 46, 89, 88);
		contentPane.add(Table7);
		
		JButton Table8 = new JButton("T8");
		Table8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T8");
				checkfis.setVisible(true);
				checkfis.setTitle("T8");
				setVisible(false);
			}
		});
		Table8.setForeground(Color.BLACK);
		Table8.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table8.setBackground(new Color(255, 140, 0));
		Table8.setBounds(407, 364, 89, 88);
		contentPane.add(Table8);
		
		JButton Table5 = new JButton("T5");
		Table5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T5");
				checkfis.setVisible(true);
				checkfis.setTitle("T5");
				setVisible(false);
				
			}
		});
		Table5.setForeground(Color.BLACK);
		Table5.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table5.setBackground(new Color(255, 140, 0));
		Table5.setBounds(240, 213, 89, 88);
		contentPane.add(Table5);
		
		JButton Table6 = new JButton("T6");
		Table6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T6");
				checkfis.setVisible(true);
				checkfis.setTitle("T6");
				setVisible(false);
				
			}
		});
		Table6.setForeground(Color.BLACK);
		Table6.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table6.setBackground(new Color(255, 140, 0));
		Table6.setBounds(240, 364, 89, 88);
		contentPane.add(Table6);
		
		JButton Table2 = new JButton("T2");
		Table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckFis checkfis=new CheckFis("T2");
				checkfis.setVisible(true);
				checkfis.setTitle("T2");
				setVisible(false);
				
			}
		});
		Table2.setForeground(Color.BLACK);
		Table2.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table2.setBackground(new Color(255, 140, 0));
		Table2.setBounds(54, 213, 89, 88);
		contentPane.add(Table2);
		
		JButton Table3 = new JButton("T3");
		Table3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T3");
				checkfis.setVisible(true);
				checkfis.setTitle("T3");
				setVisible(false);
				
			}
		});
		Table3.setForeground(Color.BLACK);
		Table3.setFont(new Font("Tahoma", Font.BOLD, 21));
		Table3.setBackground(new Color(255, 140, 0));
		Table3.setBounds(54, 364, 89, 88);
		contentPane.add(Table3);
		
		JButton TableO1 = new JButton("T01");
		TableO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T01");
				checkfis.setVisible(true);
				checkfis.setTitle("T01");
				setVisible(false);
				
			}
		});
		TableO1.setForeground(Color.BLACK);
		TableO1.setFont(new Font("Tahoma", Font.BOLD, 21));
		TableO1.setBackground(new Color(255, 140, 0));
		TableO1.setBounds(605, 46, 89, 88);
		contentPane.add(TableO1);
		
		JButton TableO2 = new JButton("T02");
		TableO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckFis checkfis=new CheckFis("T02");
				checkfis.setVisible(true);
				checkfis.setTitle("T02");
				setVisible(false);
				
			}
		});
		TableO2.setForeground(Color.BLACK);
		TableO2.setFont(new Font("Tahoma", Font.BOLD, 21));
		TableO2.setBackground(new Color(255, 140, 0));
		TableO2.setBounds(605, 364, 89, 88);
		contentPane.add(TableO2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu mm=new MainMenu();
				mm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnNewButton.setBounds(780, 46, 131, 406);
		contentPane.add(btnNewButton);
	}
}
