import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Bill {

	private JFrame frmBillingSystem;
	private JTextField textFieldCourseName;
	private JTextField textFieldStudentId;
	private JTextField textFieldStudentName;
	private JTextField textFieldAmount;
	private JTextArea textArea;
	
	private JButton btnAdd;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill window = new Bill();
					window.frmBillingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public Bill() {
		initialize();
		BillHeader();
	}
	
	private void BillHeader() {
		textArea.setText("==========================================================="+"\n"+"\t"+"ABCD ACADAMY"+ "\n"+"\t" +"Contact: 456789567"
				+ "\n" +"\t"+"Address:200A, Worcester Rd," + "\n"+"\t" +"Washinton DC"+"\n"
				+ "============================================================"+"\n");
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBillingSystem = new JFrame();
		frmBillingSystem.setTitle("BILLING SYSTEM");
		frmBillingSystem.setBounds(200, 50, 1014, 682);
		frmBillingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBillingSystem.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(377, 577, -364, -531);
		frmBillingSystem.getContentPane().add(layeredPane);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(92, 322, 160, -226);
		frmBillingSystem.getContentPane().add(horizontalStrut);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.BLACK, 2));
		panel.setBounds(38, 46, 461, 563);
		frmBillingSystem.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing System");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(81, 43, 283, 33);
		panel.add(lblNewLabel);
		
		JLabel lblCourseName = new JLabel("Course Name:");
		lblCourseName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCourseName.setBounds(51, 126, 123, 40);
		panel.add(lblCourseName);
		
		JLabel lblStudentId = new JLabel("Student Id:");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentId.setBounds(51, 187, 123, 40);
		panel.add(lblStudentId);
		
		JLabel lblStudentName = new JLabel("Student Name:");
		lblStudentName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStudentName.setBounds(51, 250, 123, 40);
		panel.add(lblStudentName);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAmount.setBounds(52, 324, 107, 26);
		panel.add(lblAmount);
		
		textFieldCourseName = new JTextField();
		textFieldCourseName.setBounds(172, 139, 238, 19);
		panel.add(textFieldCourseName);
		textFieldCourseName.setColumns(10);
		
		textFieldStudentId = new JTextField();
		textFieldStudentId.setColumns(10);
		textFieldStudentId.setBounds(172, 200, 238, 19);
		panel.add(textFieldStudentId);
		
		textFieldStudentName = new JTextField();
		textFieldStudentName.setColumns(10);
		textFieldStudentName.setBounds(172, 263, 238, 19);
		panel.add(textFieldStudentName);
		
		textFieldAmount = new JTextField();
		textFieldAmount.setColumns(10);
		textFieldAmount.setBounds(172, 330, 238, 19);
		panel.add(textFieldAmount);
		
		btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date obj = new Date();
				String date = obj.toString();
				textArea.setText(textArea.getText() + "\n" + date + "\n \n");
				textArea.setText(textArea.getText() + "Course Name: " + "\t" + textFieldCourseName.getText() + "\n");
				textArea.setText(textArea.getText() + "Student ID: " + "\t" + textFieldStudentId.getText() + "\n");
				textArea.setText(textArea.getText() + "Student Name: " + "\t" + textFieldStudentName.getText() + "\n");
				textArea.setText(textArea.getText() + "Amount: " + "\t" + textFieldAmount.getText() + "\n");
				
			}
		});
		btnAdd.setBounds(74, 423, 100, 21);
		panel.add(btnAdd);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldCourseName.setText(null);
				textFieldStudentId.setText(null);
				textFieldStudentName.setText(null);
				textFieldAmount.setText(null);
				textArea.setText(null);
				
			}
		});
		btnClear.setBounds(205, 423, 100, 21);
		panel.add(btnClear);
		
		JButton btnHeader = new JButton("HEADER");
		btnHeader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BillHeader();
			}
		});
		btnHeader.setBounds(333, 423, 100, 21);
		panel.add(btnHeader);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLACK, 2));
		panel_1.setBounds(509, 46, 455, 563);
		frmBillingSystem.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 13));
		textArea.setBounds(10, 10, 435, 543);
		panel_1.add(textArea);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				}catch (Exception e1) {
					
				}
			}
		});
		btnPrint.setBounds(698, 614, 100, 21);
		frmBillingSystem.getContentPane().add(btnPrint);
	}
}
