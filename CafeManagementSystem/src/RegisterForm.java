import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class RegisterForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private OperationDb operationDb;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public RegisterForm() {
		operationDb = OperationDb.getOperationDb();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 772, 447);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(218, 188, 76, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(218, 255, 76, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(321, 188, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton RegisterButton = new JButton("Register");
		RegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = new String(passwordField.getPassword());
				
				operationDb.registerAdmin(username, password);
				setVisible(false);
			}
		});
		RegisterButton.setBounds(318, 323, 89, 23);
		contentPane.add(RegisterButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(321, 252, 86, 20);
		contentPane.add(passwordField);
	}
}
