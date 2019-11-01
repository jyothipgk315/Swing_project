package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	double height,weight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI window = new BMI();
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
	public BMI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 365, 666);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 204, 51));
		panel.setBounds(10, 11, 329, 68);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 204, 51));
		panel_1.setBounds(10, 90, 329, 211);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height(m):");
		lblHeight.setBounds(61, 76, 61, 14);
		panel_1.add(lblHeight);
		
		JLabel lblNewLabel = new JLabel("Weight(kg):");
		lblNewLabel.setBounds(62, 113, 77, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(167, 73, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 113, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setBounds(60, 157, 46, 14);
		panel_1.add(lblBmi);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 215, 0));
		textField_2.setBounds(116, 154, 53, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblHgf = new JLabel("");
		lblHgf.setForeground(new Color(255, 215, 0));
		lblHgf.setBackground(new Color(240, 240, 240));
		lblHgf.setBounds(215, 157, 104, 14);
		panel_1.add(lblHgf);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height=Double.parseDouble(textField.getText());
				weight=Double.parseDouble(textField_1.getText());
				double bmi=height/(weight*weight);
				String ans=String.format("%.2f", bmi);
				textField_2.setText(ans);
				if(bmi<18.5)
				{
					lblHgf.setText("under weight");
				}
				if(bmi>=18.5||bmi<=24.9)
				{
					lblHgf.setText("normal weight");
				}
				if(bmi>=25||bmi<=29.9)
				{
					lblHgf.setText("over weight");
				}
				if(bmi>30)
				{
					lblHgf.setText("obese");
				}
				
			}
		});
		btnCalculate.setBounds(50, 185, 89, 23);
		panel_1.add(btnCalculate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText(null);
				
			}
		});
		btnClear.setBounds(149, 185, 68, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(230, 185, 68, 23);
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153, 204, 51));
		panel_2.setBounds(10, 312, 329, 300);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setBounds(101, 118, 1, 1);
		panel_2.add(table);
		
		JLabel label = new JLabel(new ImageIcon("C://Users/USER/Desktop.BMIshutterstock_1085177483.jpg"));
		label.setBounds(101, 118, 152, 60);
		panel_2.add(label);
	}
}
