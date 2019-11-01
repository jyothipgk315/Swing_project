package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Projec2 {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projec2 window = new Projec2();
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
	public Projec2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Student Report");
		frame.getContentPane().setBackground(SystemColor.textHighlight);
		frame.setBounds(100, 100, 828, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 0, 255));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(23, 11, 330, 364);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentid = new JLabel("Student_ID");
		lblStudentid.setForeground(new Color(253, 245, 230));
		lblStudentid.setBackground(new Color(255, 0, 255));
		lblStudentid.setBounds(10, 38, 90, 14);
		panel.add(lblStudentid);
		
		textField = new JTextField();
		textField.setBounds(82, 35, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name");
		lblFirstName.setForeground(new Color(253, 245, 230));
		lblFirstName.setBackground(Color.MAGENTA);
		lblFirstName.setBounds(10, 73, 90, 14);
		panel.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setForeground(new Color(253, 245, 230));
		lblSurname.setBackground(Color.MAGENTA);
		lblSurname.setBounds(10, 102, 90, 14);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setForeground(new Color(253, 245, 230));
		lblCourseCode.setBackground(Color.MAGENTA);
		lblCourseCode.setBounds(10, 127, 90, 14);
		panel.add(lblCourseCode);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 70, 86, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 99, 86, 20);
		panel.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"13040437", "13040348", "13040349", "13040350"}));
		comboBox.setBounds(82, 124, 86, 20);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(10, 162, 158, 3);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTotalscore = new JLabel("Total Score");
		lblTotalscore.setForeground(new Color(253, 245, 230));
		lblTotalscore.setBackground(Color.MAGENTA);
		lblTotalscore.setBounds(10, 180, 90, 14);
		panel.add(lblTotalscore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setForeground(new Color(253, 245, 230));
		lblAverage.setBackground(Color.MAGENTA);
		lblAverage.setBounds(10, 215, 90, 14);
		panel.add(lblAverage);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setForeground(new Color(253, 245, 230));
		lblRank.setBackground(Color.MAGENTA);
		lblRank.setBounds(10, 254, 90, 14);
		panel.add(lblRank);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(82, 177, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(82, 212, 86, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(82, 251, 86, 20);
		panel.add(textField_5);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setForeground(new Color(253, 245, 230));
		lblMalayalam.setBackground(Color.MAGENTA);
		lblMalayalam.setBounds(175, 38, 90, 14);
		panel.add(lblMalayalam);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setForeground(new Color(253, 245, 230));
		lblMaths.setBackground(Color.MAGENTA);
		lblMaths.setBounds(175, 73, 90, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setForeground(new Color(253, 245, 230));
		lblEnglish.setBackground(Color.MAGENTA);
		lblEnglish.setBounds(175, 102, 90, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology");
		lblBiology.setForeground(new Color(253, 245, 230));
		lblBiology.setBackground(Color.MAGENTA);
		lblBiology.setBounds(175, 127, 90, 14);
		panel.add(lblBiology);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setForeground(new Color(253, 245, 230));
		lblComputer.setBackground(Color.MAGENTA);
		lblComputer.setBounds(175, 162, 90, 14);
		panel.add(lblComputer);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setForeground(new Color(253, 245, 230));
		lblPhysics.setBackground(Color.MAGENTA);
		lblPhysics.setBounds(175, 195, 90, 14);
		panel.add(lblPhysics);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setForeground(new Color(253, 245, 230));
		lblChemistry.setBackground(Color.MAGENTA);
		lblChemistry.setBounds(178, 225, 90, 14);
		panel.add(lblChemistry);
		
		JLabel lblSanskrit = new JLabel("Sanskrit");
		lblSanskrit.setForeground(new Color(253, 245, 230));
		lblSanskrit.setBackground(Color.MAGENTA);
		lblSanskrit.setBounds(178, 254, 90, 14);
		panel.add(lblSanskrit);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		
		textField_6.setBounds(234, 35, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(234, 70, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(234, 99, 86, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(234, 124, 86, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(234, 159, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(234, 192, 86, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_12.setColumns(10);
		textField_12.setBounds(234, 222, 86, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))||
						(num==KeyEvent.VK_BACK_SPACE)||
						(num==KeyEvent.VK_DELETE))
				{
					evt.consume();
				}
			}
		});
		textField_13.setColumns(10);
		textField_13.setBounds(234, 251, 86, 20);
		panel.add(textField_13);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_ID", "Course name", "Maths", "English", "Biology", "Computer", "Physics", "Chemistry", "malayalam", "Sanskrit", "Total Score", "Average", "Ranking"},
			},
			new String[] {
				"Student_ID", "Course_Name", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(83);
		table.getColumnModel().getColumn(3).setPreferredWidth(82);
		table.getColumnModel().getColumn(4).setPreferredWidth(81);
		table.getColumnModel().getColumn(5).setPreferredWidth(81);
		table.getColumnModel().getColumn(6).setPreferredWidth(84);
		table.getColumnModel().getColumn(7).setPreferredWidth(87);
		table.getColumnModel().getColumn(8).setPreferredWidth(90);
		table.getColumnModel().getColumn(10).setPreferredWidth(95);
		table.setBounds(10, 423, 802, 80);
		frame.getContentPane().add(table);
		
		JButton btnReport = new JButton("Report");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int math=Integer.parseInt(textField_7.getText());
				int eng=Integer.parseInt(textField_8.getText());
				int com=Integer.parseInt(textField_9.getText());
				int phy=Integer.parseInt(textField_10.getText());
				int che=Integer.parseInt(textField_11.getText());
				int mal=Integer.parseInt(textField_12.getText());
				int san=Integer.parseInt(textField_6.getText());
				int bio=Integer.parseInt(textField_13.getText());
				double total=math+eng+com+phy+che+mal+san+bio;
				double avg=total/8;
				String st=String.format("%.2f",total);
				textField_3.setText(st);
				String a=String.format("%.2f",avg);
				textField_4.setText(a);
				if(total>=600)
				{
					textField_5.setText("1");	
				}
				if(total<=600&&total>=500)
				{
					textField_5.setText("2");	
				}
				if(total<=400&&total>=300)
				{
					textField_5.setText("3");	
				}
				if(total<=200&&total>=100)
				{
					textField_5.setText("4");	
				}
				if(total<100)
				{
					textField_5.setText("failed");	
				}
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						
						textField.getText(),
						(String) comboBox.getSelectedItem(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_6.getText(),
						textField_13.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),


				});
			}
		});
		btnReport.setBackground(new Color(255, 235, 205));
		btnReport.setBounds(47, 536, 89, 23);
		frame.getContentPane().add(btnReport);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(363, 23, 439, 332);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 5, 419, 291);
		panel_1.add(textArea);

		JButton btnShowReport = new JButton("Show report");
		btnShowReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("STUDENT RECORD\n"
						+ "student name:\t\t"+textField_1.getText()+textField_2.getText()
						+"\n-----------------"
						+"\nmalayalam:\t\t"+textField_6.getText()
						+"\nmaths    :\t\t"+textField_7.getText()
						+"\nenglish  :\t\t"+textField_8.getText()
						+"\nbiology  :\t\t"+textField_9.getText()
						+"\ncomputer :\t\t"+textField_10.getText()
						+"\nphysics  :\t\t"+textField_11.getText()
						+"\nchemistry:\t\t"+textField_12.getText()
						+"\nsanskrit :\t\t"+textField_13.getText()
						+"\n--------------------"
						+"\ntoatal   :\t\t"+textField_3.getText()
						+"\naverage  :\t\t"+textField_4.getText()
						+"\nrank     :\t\t"+textField_5.getText()
						);
			}
		});
		btnShowReport.setBounds(173, 536, 142, 23);
		frame.getContentPane().add(btnShowReport);
		
		
		
				
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setBounds(151, 307, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row =table.getSelectedRow();
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.removeRow(row);
			}
		});
		btnDelete.setBounds(343, 536, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnReset = new JButton("reset");
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
				textField_12.setText(null);
				textField_13.setText(null);
				
			}
		});
		btnReset.setBounds(460, 536, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"COnfirm","Exit", JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);
				
				}
			}
		});
		btnExit.setBounds(593, 536, 89, 23);
		frame.getContentPane().add(btnExit);
		
		
	}
}
