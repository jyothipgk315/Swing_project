package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double num1,num2,result;
	String op,ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(10, 10, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(11, 11, 244, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button.getText();
				textField.setText(Number);
			}
		});
		button.setBackground(SystemColor.activeCaption);
		button.setForeground(Color.DARK_GRAY);
		button.setBounds(11, 53, 54, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);

			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setBounds(91, 25, 56, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_1 .getText();
				textField.setText(Number);

			}
		});
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(150, 59, 51, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(211, 59, 42, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBackground(SystemColor.activeCaption);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_3 .getText();
				textField.setText(Number);

			}
		});
		btnNewButton_3.setBounds(11, 87, 54, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_4 .getText();
				textField.setText(Number);

			}
		});
		btnNewButton_4.setBounds(81, 87, 59, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBackground(SystemColor.activeCaption);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_5 .getText();
				textField.setText(Number);

			}
		});
		btnNewButton_5.setBounds(150, 87, 49, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("-");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		btnNewButton_6.setBackground(SystemColor.activeCaption);
		btnNewButton_6.setBounds(211, 93, 42, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.setBackground(SystemColor.activeCaption);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_7.getText();
				textField.setText(Number);

			}
		});
		btnNewButton_7.setBounds(11, 121, 54, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.setBackground(SystemColor.activeCaption);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_8.getText();
				textField.setText(Number);

			}
		});
		btnNewButton_8.setBounds(81, 121, 59, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.setBackground(SystemColor.activeCaption);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_9.getText();
				textField.setText(Number);

			}
		});
		btnNewButton_9.setBounds(150, 121, 51, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("*");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		btnNewButton_10.setBackground(SystemColor.activeCaption);
		btnNewButton_10.setBounds(211, 127, 42, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.setBackground(SystemColor.activeCaption);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_11.getText();
				textField.setText(Number);

			}
		});
		btnNewButton_11.setBounds(81, 155, 59, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton(".");
		btnNewButton_12.setBackground(SystemColor.activeCaption);
		btnNewButton_12.setBounds(150, 155, 51, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setForeground(SystemColor.text);
		btnNewButton_13.setBackground(SystemColor.activeCaptionBorder);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-") {
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*") {
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/") {
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%") {
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				
			}
		});
		btnNewButton_13.setBounds(81, 189, 98, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setBackground(SystemColor.activeCaption);
		btnC.setBounds(11, 155, 54, 23);
		frame.getContentPane().add(btnC);
		
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button_2.setBackground(SystemColor.activeCaption);
		button_2.setBounds(211, 159, 44, 42);
		frame.getContentPane().add(button_2);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					b=strb.toString();
					textField.setText(b);
				}
			}
		});
		btnB.setBackground(SystemColor.activeCaption);
		btnB.setBounds(11, 189, 54, 23);
		frame.getContentPane().add(btnB);
		
		JButton btnNewButton_14 = new JButton("2");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton_14.getText();
				textField.setText(Number);

			}
		});
		btnNewButton_14.setBounds(75, 53, 65, 23);
		frame.getContentPane().add(btnNewButton_14);
	}
}
