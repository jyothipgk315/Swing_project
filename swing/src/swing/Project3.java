package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Project3 {

	private JFrame frame;
	private JLabel lblTicketBooking;
	private JPanel panel_1;
	private JLabel lblName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	int i=2345;
	int j=2341;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
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
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 786, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblTicketBooking = new JLabel("TICKET BOOKING");
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblTicketBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBooking.setBounds(266, 22, 227, 27);
		frame.getContentPane().add(lblTicketBooking);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(250, 11, 257, 50);
		frame.getContentPane().add(panel_1);
		
		lblName = new JLabel("NAME");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(38, 123, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(108, 115, 121, 34);
		
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setBounds(6, 168, 307, 14);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStanderd = new JRadioButton("Standerd");
		rdbtnStanderd.setBounds(6, 189, 109, 23);
		frame.getContentPane().add(rdbtnStanderd);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setBounds(120, 189, 109, 23);
		frame.getContentPane().add(rdbtnSingle);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(237, 189, 86, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First class");
		rdbtnFirstClass.setBounds(6, 225, 86, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(93, 225, 64, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(169, 225, 76, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(250, 225, 64, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"kerala", "karnataka", "gujarat", "madhyapresh"}));
		comboBox.setBounds(10, 274, 74, 20);
		
		frame.getContentPane().add(comboBox);
		
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"kerala", "karnataka", "gujarat", "madhyapresh"}));
		comboBox_1.setBounds(120, 274, 64, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(223, 274, 74, 20);
		frame.getContentPane().add(comboBox_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(6, 316, 307, 14);
		frame.getContentPane().add(separator_1);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(16, 341, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub total");
		lblSubTotal.setBounds(16, 377, 46, 14);
		frame.getContentPane().add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(16, 411, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 338, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(98, 374, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(98, 408, 86, 20);
		frame.getContentPane().add(textField_3);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_11.setText("any");
				String book=String.format("%d",i);
				textField_9.setText(book);
				i++;
				double t=0;
				double m=0;
				double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
				if(rdbtnSingle.isSelected())
				{
					t=t+500;
				}
				else
				{
					t=t+700;
				}
				if(rdbtnSleeper.isSelected())
				{
					t=t+500;
				}
				else
				{
					t=t+300;
				}
				if(rdbtnAc.isSelected())
				{
					t=t+500;
					textField_1.setText("200");
					
				}
				else
				{
					t=t+300;
					textField_1.setText("100");
				}
				m=(m+t)*no;
				String r=String.format("%.2f", m);
				textField_2.setText(r);
				if(rdbtnAc.isSelected())
				{
					String l=String.format("%.2f", m+200);
					textField_3.setText(l);
					textField_10.setText(l);
					
				}
				else
				{
					String l=String.format("%.2f", m+100);
					textField_3.setText(l);	
					textField_10.setText(l);
						
					
				}
				
				String text = textField.getText();
				textField_4.setText(text);
				textField_5.setText(comboBox.getSelectedItem().toString());
				textField_6.setText(comboBox_1.getSelectedItem().toString());
			     Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_8.setText(tTime.format(timer.getTime()));
	                
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
	                textField_7.setText(tdate.format(timer.getTime()));
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTotal.setBounds(16, 449, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnReset.setBounds(120, 449, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnExit.setBounds(223, 449, 89, 23);
		frame.getContentPane().add(btnExit);
		
		table = new JTable();
		table.setBounds(25, 494, 675, 80);
		frame.getContentPane().add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking NO.", "From", "To", "No. of Seats", "Time", "Date", "AC/Non AC", "Price"},
				},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(6, 481, 715, 104);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("NAME");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(439, 143, 46, 14);
		frame.getContentPane().add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(519, 135, 121, 34);
		
		frame.getContentPane().add(textField_4);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrom.setBackground(new Color(240, 240, 240));
		lblFrom.setForeground(new Color(0, 0, 0));
		lblFrom.setHorizontalAlignment(SwingConstants.LEFT);
		lblFrom.setBounds(421, 209, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTo.setForeground(Color.BLACK);
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTo.setBackground(SystemColor.menu);
		lblTo.setBounds(421, 249, 46, 14);
		frame.getContentPane().add(lblTo);
		
		textField_5 = new JTextField();
		textField_5.setBounds(519, 208, 86, 20);		
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(519, 248, 86, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setForeground(Color.BLACK);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBackground(SystemColor.menu);
		lblDate.setBounds(421, 295, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setHorizontalAlignment(SwingConstants.LEFT);
		lblTime.setForeground(Color.BLACK);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBackground(SystemColor.menu);
		lblTime.setBounds(421, 341, 46, 14);
		frame.getContentPane().add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(519, 294, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(519, 338, 86, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblTicketNumber = new JLabel("Ticket Number");
		lblTicketNumber.setBounds(653, 189, 86, 14);
		frame.getContentPane().add(lblTicketNumber);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(653, 208, 86, 20);
		frame.getContentPane().add(textField_9);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(664, 234, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(653, 248, 86, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(653, 310, 86, 20);
		frame.getContentPane().add(textField_11);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setBounds(653, 277, 75, 14);
		frame.getContentPane().add(lblRoute);
		
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String book=String.format("%d",j);
				
				j++;
				String v="";
				if(rdbtnAc.isSelected())
				{
				v="AC";	
				}
				else
				{
					v="non-AC";
				}
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
				textField.getText(),
				textField_9.getText(),
				textField_5.getText(),
				textField_6.getText(),
				book,
				textField_8.getText(),
				textField_7.getText(),
				v,
				textField_10.getText(),
				});
				}
				
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConfirm.setBounds(567, 377, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(6, 436, 307, 14);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(324, 88, 105, 362);
		frame.getContentPane().add(separator_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(378, 88, 382, 337);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTicketBooking_1 = new JLabel("Ticket Booking");
		lblTicketBooking_1.setBounds(537, 66, 86, 27);
		frame.getContentPane().add(lblTicketBooking_1);
	}
}
