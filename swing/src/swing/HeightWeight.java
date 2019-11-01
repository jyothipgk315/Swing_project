package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeightWeight {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	double num1,num2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeightWeight window = new HeightWeight();
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
	public HeightWeight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Height and Weignt Converter v.Beta 0.12.1 ");
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		
		textField = new JTextField();
		textField.setBounds(130, 76, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 130, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Height");
		lblNewLabel.setBounds(46, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight");
		lblNewLabel_1.setBounds(46, 133, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUsMeasurment = new JLabel("U.S Measurment");
		lblUsMeasurment.setBounds(134, 39, 82, 14);
		frame.getContentPane().add(lblUsMeasurment);
		
		JLabel lblMetric = new JLabel("Metric");
		lblMetric.setBounds(274, 39, 46, 14);
		frame.getContentPane().add(lblMetric);
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(46, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(274, 79, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(274, 133, 67, 14);
		frame.getContentPane().add(label);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num2=Double.parseDouble(textField_1.getText());
				double r=num1/3.2808;
				double r2=num2/2.2046;
				String a=String.format("%.2f m",r);
				String a2=String.format("%.2f kg",r2);
				lblNewLabel_2.setText(a);
				label.setText(a2);
			}
		});
		btnOk.setBounds(67, 202, 89, 23);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(194, 202, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		
	}
}
