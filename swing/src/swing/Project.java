package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Rectangle;

public class Project {

	private JFrame frame;
	private JTextField textField;
	double num1,num2,result,val;
	String op,ans;
	int usa=80;
	int uk=67;
	int korea=70;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project window = new Project();
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
	public Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(new Rectangle(100, 100, 790, 450));
		
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(33, 27, 391, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u2190");
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(33, 99, 54, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
		JButton button_3 = new JButton("+/-");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				if(num1>=0)
				{
					textField.setText(String.valueOf(-num1));	
				}
				else
				{
					textField.setText(String.valueOf(num1));	
				}
			}
		});
		button_3.setBounds(209, 99, 54, 39);
		frame.getContentPane().add(button_3);
		
		JButton button_1 = new JButton("\u221A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
	                num1=Math.sqrt(num1);
	                textField.setText(String.valueOf(num1));
			}
		});
		button_1.setBounds(270, 99, 54, 39);
		frame.getContentPane().add(button_1);
		
		JButton btnLog = new JButton("ln");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
                num1=java.lang.Math.log(num1);
                textField.setText(String.valueOf(num1));	
			}
		});
		btnLog.setBounds(334, 99, 54, 39);
		frame.getContentPane().add(btnLog);
		
		
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                num1=Double.parseDouble(textField.getText());
                num1=Math.sinh(num1);
                textField.setText(String.valueOf(num1));
     
				
			}
		});
		btnSinh.setBounds(464, 99, 54, 39);
		frame.getContentPane().add(btnSinh);
		
		JButton btnMod = new JButton("Mod");
		btnMod.setBounds(528, 99, 54, 39);
		frame.getContentPane().add(btnMod);
		
		JButton btnInx = new JButton("Inx");
		btnInx.setBounds(528, 149, 54, 39);
		frame.getContentPane().add(btnInx);
		
		JButton btnC_1 = new JButton("C");
		btnC_1.setBounds(528, 199, 54, 39);
		frame.getContentPane().add(btnC_1);
		
		JButton btnpi = new JButton("2*\u03C0");
		btnpi.setBounds(528, 251, 54, 39);
		frame.getContentPane().add(btnpi);
		
		JButton btnOsc = new JButton("Oct");
		btnOsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						num1=Double.parseDouble(textField.getText());
						textField.setText(Integer.toOctalString((int)num1));
				
			}
		});
		btnOsc.setBounds(528, 301, 54, 39);
		frame.getContentPane().add(btnOsc);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(33, 149, 54, 39);
		frame.getContentPane().add(button_2);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(33, 199, 54, 39);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(33, 251, 54, 39);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_7.getText();
				textField.setText(Number);
			}
		});
		button_7.setBounds(33, 301, 113, 39);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(92, 149, 54, 39);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("5");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(92, 199, 54, 39);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(92, 251, 54, 39);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("9");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_11.getText();
				textField.setText(Number);
			}
		});
		button_11.setBounds(151, 149, 54, 39);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("6");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(151, 199, 54, 39);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setBounds(151, 251, 54, 39);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_14.setVerticalAlignment(SwingConstants.TOP);
		button_14.setBounds(151, 301, 54, 39);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="/";
			}
		});
		button_15.setBounds(209, 149, 54, 39);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("%");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="%";
			}
		});
		button_16.setBounds(270, 149, 54, 39);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("\u03C0");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(String.valueOf(3.14159265359));
			}
		});
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_17.setBounds(334, 149, 54, 39);
		frame.getContentPane().add(button_17);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                num1=Double.parseDouble(textField.getText());
                num1=Math.cos(num1);
                textField.setText(String.valueOf(num1));
     
				
			}
		});
		btnCos.setBounds(400, 149, 54, 39);
		frame.getContentPane().add(btnCos);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		                num1=Double.parseDouble(textField.getText());
		                num1=Math.cosh(num1);
		                textField.setText(String.valueOf(num1));
		     
				
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCosh.setBounds(464, 149, 54, 39);
		frame.getContentPane().add(btnCosh);
		
		JButton button_18 = new JButton("*");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		button_18.setBounds(209, 199, 54, 39);
		frame.getContentPane().add(button_18);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                num1=Double.parseDouble(textField.getText());
                num1=1/(num1);
                textField.setText(String.valueOf(num1));
     
				
				
			}
		});
		btnx.setBounds(270, 199, 54, 39);
		frame.getContentPane().add(btnx);
		
		JButton btnX = new JButton("X^Y");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());				
				textField.setText("");
				op="x^y";
               
				
			}
		});
		btnX.setBounds(334, 199, 54, 39);
		frame.getContentPane().add(btnX);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
		                num1=Math.tan(num1);
		                textField.setText(String.valueOf(num1));
		     
				
			}
		});
		btnTan.setBounds(400, 199, 54, 39);
		frame.getContentPane().add(btnTan);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 num1=Double.parseDouble(textField.getText());
		                num1=Math.tanh(num1);
		                textField.setText(String.valueOf(num1));
		     
				
			}
		});
		btnTanh.setBounds(464, 199, 54, 39);
		frame.getContentPane().add(btnTanh);
		
		JButton button_19 = new JButton("-");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
							textField.setText("");
							op="-";
							}
		});
		button_19.setBounds(209, 251, 54, 39);
		frame.getContentPane().add(button_19);
		
		JButton btnX_1 = new JButton("X^2");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				num1=java.lang.Math.pow(num1,2);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(334, 251, 54, 39);
		frame.getContentPane().add(btnX_1);
		
		JButton btnCbr = new JButton("Cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="Cbr";
			}
		});
		btnCbr.setBounds(400, 249, 54, 39);
		frame.getContentPane().add(btnCbr);
		
		JButton btnRund = new JButton("Rund");
		btnRund.setBounds(464, 251, 54, 39);
		frame.getContentPane().add(btnRund);
		
		JButton button_24 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(textField.getText());
					textField.setText("");
					op="+";
			}
		});
		button_24.setBounds(209, 301, 54, 39);
		frame.getContentPane().add(button_24);
		
		JButton button_20 = new JButton("=");
		button_20.addActionListener(new ActionListener() {
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
				if(op=="x^y")
				{
					
				result=java.lang.Math.pow(num1,num2);
				ans=String.format("%.2f",result);
				textField.setText(String.valueOf(ans));
				}
				
				if(op=="Cbr")
				{
					
				result=(num1/num2)*100;
				ans=String.format("%.2f",result);
				textField.setText(String.valueOf(ans));
				}
					
				
				
				
			}
		});
		button_20.setBounds(270, 251, 54, 89);
		frame.getContentPane().add(button_20);
		

		JButton button = new JButton("CE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		button.setBounds(92, 99, 54, 39);
		frame.getContentPane().add(button);
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		
		btnC.setBounds(151, 99, 54, 39);
		frame.getContentPane().add(btnC);
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		            
		                num1=Double.parseDouble(textField.getText());
		                num1=Math.sin(num1);
		                textField.setText(String.valueOf(num1));
		     
			}
		});
		btnSin.setBounds(400, 99, 54, 39);
		frame.getContentPane().add(btnSin);
		
		JButton btnX_2 = new JButton("X^3");
		btnX_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				
				num1=java.lang.Math.pow(num1,3);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX_2.setBounds(334, 301, 54, 39);
		frame.getContentPane().add(btnX_2);
		
		JButton btnBin = new JButton("Bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(Integer.toBinaryString((int)num1));
			}
		});
		btnBin.setBounds(400, 301, 54, 39);
		frame.getContentPane().add(btnBin);
		
		JButton btnHex = new JButton("Hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText(Integer.toHexString((int)num1));
			}
		});
		btnHex.setBounds(464, 301, 54, 39);
		frame.getContentPane().add(btnHex);
		
		JPanel panel = new JPanel();
		panel.setBounds(592, 27, 234, 313);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblConversion = new JLabel("currency converter");
		lblConversion.setBounds(10, 11, 192, 29);
		panel.add(lblConversion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"U.S.A", "Korea", "U.K"}));
		comboBox.setBounds(37, 51, 77, 20);
		panel.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 114, 125, 42);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(47, 198, 103, 29);
		panel.add(lblNewLabel);
		
		JButton btnConvert = new JButton("convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("U.S.A"))
				{
					String c=String.format("rs%.2f",bp*usa);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("Korea"))
				{
					String c=String.format("rs%.2f",bp*korea);
					lblNewLabel.setText(c);
				}
				if(comboBox.getSelectedItem().equals("U.K"))
				{
					String c=String.format("rs%.2f",bp*uk);
					lblNewLabel.setText(c);
				}
				
					
				
						
						
						
							}
		});
		btnConvert.setBounds(10, 268, 89, 23);
		panel.add(btnConvert);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(null);
				textField_1.setText(null);
			}
		});
		btnClear.setBounds(122, 268, 89, 23);
		panel.add(btnClear);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standerd");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(new Rectangle(100, 100,338, 400));
				
				
			}
		});
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(new Rectangle(100, 100, 597, 439));
			}
		});
		mnFile.add(mntmScientific);
		
		JMenuItem mntmUnitConvertion = new JMenuItem("Unit convertion");
		mntmUnitConvertion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setBounds(new Rectangle(100, 100, 790, 450));
			}
		});
		mnFile.add(mntmUnitConvertion);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"COnfirm","Exit", JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				
				}
				
			}
		});
		mnFile.add(mntmExit);
	}
}
