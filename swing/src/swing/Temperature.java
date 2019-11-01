package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Temperature {

	private JFrame frame;
	private JTextField textField;
	double val;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature window = new Temperature();
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
	public Temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(196, 51, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDegerees = new JLabel("Degrees");
		lblDegerees.setBounds(87, 54, 73, 14);
		frame.getContentPane().add(lblDegerees);
		JLabel label = new JLabel("");
		label.setBounds(157, 134, 106, 20);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("To celsius");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val=Double.parseDouble(textField.getText());
				double c=((val-32)*.555);
				
				String a=String.format("%.1f", c);
				label.setText(" Result= "+a);
			}
		});
		btnNewButton.setBounds(60, 202, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To fahrenhelt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				val=Double.parseDouble(textField.getText());
				double f=(val*1.8)+32;
				String as=String.format("%.1f", f);
				label.setText(" Result= "+as);
			}
		});
		btnNewButton_1.setBounds(230, 202, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}

}
