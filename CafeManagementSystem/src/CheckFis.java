import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class CheckFis extends JFrame {

	private JPanel contentPane;
	private OperationDb operationDb;

	/**
	 * Create the frame.
	 */
	public CheckFis(String masa_adi) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		operationDb = OperationDb.getOperationDb();
		
		setBounds(100, 100, 862, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList jlist = new JList();
		jlist.setBounds(251, 107, 265, 244);
		contentPane.add(jlist); 
		
		jlist.setModel(operationDb.getIcerik(masa_adi));
		
		JButton btnpay = new JButton("Pay\r\n");
		btnpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				operationDb.payCheck(masa_adi);
				
				
				JOptionPane.showMessageDialog(null, masa_adi + " paid.");
			}
		});
		btnpay.setBounds(251, 380, 265, 29);
		contentPane.add(btnpay);
		
		if(operationDb.getFullPrice(masa_adi) >= 200) {
			
			contentPane.setBackground(Color.RED);
		}
		else if(operationDb.getFullPrice(masa_adi)<=199  && operationDb.getFullPrice(masa_adi)>=100 ) {
			
			contentPane.setBackground(Color.blue);
		}
		else if(operationDb.getFullPrice(masa_adi)<=99   && operationDb.getFullPrice(masa_adi)>=50 ) {
			
			contentPane.setBackground(Color.orange);
		}
		else    if(operationDb.getFullPrice(masa_adi)<=49  && operationDb.getFullPrice(masa_adi)>=20 ) {
		
		contentPane.setBackground(Color.green);
	}
	else {
		contentPane.setBackground(Color.cyan);
	}
		
		JButton btnhm = new JButton("Home Page");
		btnhm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MainMenu mainscr = new MainMenu();
				mainscr.setVisible(true);
				setVisible(false);
			}
		});
		btnhm.setBounds(582, 156, 162, 77);
		contentPane.add(btnhm);
		
		JButton btnback = new JButton("Back\r\n");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TableSelection1 ts1=new TableSelection1();
				ts1.setVisible(true);
				setVisible(false);
				
			}
		});
		btnback.setBounds(582, 286, 162, 65);
		contentPane.add(btnback);
		
		
		
		JLabel lblPayScreen = new JLabel("Pay Screen");
		lblPayScreen.setFont(new Font("Times New Roman", Font.BOLD, 41));
		lblPayScreen.setBounds(289, 51, 227, 45);
		contentPane.add(lblPayScreen);
		
		JLabel lblCafeManagementSystem = new JLabel("Cafe Management System");
		lblCafeManagementSystem.setFont(new Font("Vladimir Script", Font.PLAIN, 34));
		lblCafeManagementSystem.setBounds(251, 11, 309, 43);
		contentPane.add(lblCafeManagementSystem);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(74, 324, 88, 14);
		contentPane.add(lblTotal);
		
		lblTotal.setText("Total: " + operationDb.getFullPrice(masa_adi));
		
		
	//	textArea.setText(getInfoFrom());
	}
}
