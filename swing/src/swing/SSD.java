package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class SSD {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double in=0;
	//String c="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SSD window = new SSD();
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
	public SSD() {
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
		
		JLabel lblInput = new JLabel("input");
		lblInput.setBounds(75, 38, 46, 14);
		frame.getContentPane().add(lblInput);
		
		textField = new JTextField();
		textField.setBounds(174, 35, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOut = new JLabel("out");
		lblOut.setBounds(75, 213, 46, 14);
		frame.getContentPane().add(lblOut);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 210, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		if(in!=0)
		{
		JRadioButton rdbtnCel = new JRadioButton("cel");
		rdbtnCel.setBounds(35, 139, 109, 23);
		frame.getContentPane().add(rdbtnCel);
		in=1;
		}
	}
}
