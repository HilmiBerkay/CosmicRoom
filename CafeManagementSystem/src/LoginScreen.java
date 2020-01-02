import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.management.openmbean.OpenDataException;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;
import javax.swing.JTree;
import java.awt.Font;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;  
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
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
	public LoginScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		OperationDb operationDb = OperationDb.getOperationDb();
		
		passwordField = new JPasswordField();
		passwordField.setBounds(356, 259, 154, 20);
		contentPane.add(passwordField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(356, 194, 154, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField_1.getText();
				String password = new String(passwordField.getPassword());
				
				if(operationDb.isLogin(username, password)) {
					
					MainMenu m = new MainMenu();
					m.setVisible(true);
					setVisible(false);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Username or password wrong!");
				}
			}
		});
		btnNewButton.setBounds(220, 330, 127, 23);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("PassWord");
		lblNewLabel.setBounds(220, 262, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(220, 197, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		JButton btnNewButton_1 = new JButton("Register\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegisterForm rgfscr = new RegisterForm();
				rgfscr.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(401, 330, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Login screen\r\n");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 50));
		lblNewLabel_2.setBounds(220, 111, 314, 58);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblCafeManagementSystem = new JLabel("Cafe Management System");
		lblCafeManagementSystem.setFont(new Font("Vladimir Script", Font.PLAIN, 34));
		lblCafeManagementSystem.setBounds(220, 26, 314, 40);
		contentPane.add(lblCafeManagementSystem);
		
		
	}
}
