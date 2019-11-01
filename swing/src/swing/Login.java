package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame(" LOGIN");
		frame.getContentPane().setForeground(new Color(238, 232, 170));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(165, 54, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(165, 100, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblUserName = new JLabel("USER NAME");
		lblUserName.setBounds(68, 57, 71, 17);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(68, 103, 71, 20);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxReminder = new JCheckBox("Reminder");
		chckbxReminder.setBounds(179, 155, 97, 23);
		frame.getContentPane().add(chckbxReminder);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(67, 208, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.setBounds(187, 208, 89, 23);
		frame.getContentPane().add(btnSignOut);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLogin.setBounds(147, 11, 97, 20);
		frame.getContentPane().add(lblLogin);
	}
}
