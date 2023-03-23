import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JScrollPane;

public class MathTest extends JFrame {

	private JPanel contentPane;
	private JTextField jtextField_1;
	private JTextField jtextField_2;
	private JTextField jtextField_3;
	private JTextField jtextField_4;
	private JTextField jtextField_6;
	private JTextField jtextField_7;
	private JTextField jtextField_8;
	private JTextField jtextField_5;
	private JTextField jtextField_9;
	private JTextField jtextField_10;
	private JTextField jtextField_11;
	private JTextField jtextField_12;
	private JTextField jtextField_13;
	private JTextField jtextField_14;
	private JTextField jtextField_15;
	private JTextField jtextField_16;
	private JTextField jtextField_17;
	private JTextField jtextField_18;
	private JTextField jtextField_19;
	private JTextField jtextField_20;
	private JTextField jtextField_21;
	private JTextField jtextField_22;
	private JTextField jtextField_23;
	private JTextField jtextField_24;
	private JTextField jtextField_25;
	
	private int stPoizkispov1 = 0;
	private int stPoizkusov2 = 0;
	private int stPoizkusov3 = 0;
	private int stPoizkusov4 = 0;
	private int stPoizkusov5 = 0;
	
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField jtextField_26;
	private JTextField jtextField_29;
	private JTextField jtextField_27;
	private JTextField jtextField_30;
	
	private static JTextField jtextField_28;
	private static JTextField jtextField_31;
	
	private JLabel lblNewLabel_10;
	
	//This method was made to put only math random numbers divisors with jtextField_16
	
	private static List<Integer> getDivisors(int number) {
	    List<Integer> divisors = new ArrayList<>();

	    for (int i=2;i<=number;i++) 
	        if (number%i==0) 
	            divisors.add(i);
	            
	    return divisors;
	 }
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MathTest frame = new MathTest();
					frame.setVisible(true);
					
					frame.addWindowListener(new WindowAdapter() {
						//----- This action was made to show date in the Calculation Salary in PayDate section and EmployeRef Number----//
						public void windowActivated(WindowEvent e) {
							int refs = 1325 + (int)(Math.random()*4238);
							Calendar timer = Calendar.getInstance();
							timer.getTime();
							SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
							tTime.format(timer.getTime());
							SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
							Tdate.format(timer.getTime());
							jtextField_28.setText(Tdate.format(timer.getTime()));
							jtextField_31.setText(tTime.format(timer.getTime()));
						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	public MathTest() {
		
		//initialize();
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Math test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 30, 1304, 741);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMnozenje = new JLabel("Multiplication:");
		lblMnozenje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMnozenje.setBounds(0, 71, 124, 27);
		contentPane.add(lblMnozenje);
		
		jtextField_1 = new JTextField();
		jtextField_1.setEditable(false);
		jtextField_1.setBounds(123, 75, 60, 19);
		contentPane.add(jtextField_1);
		jtextField_1.setColumns(10);
		
		jtextField_2 = new JTextField();
		jtextField_2.setEditable(false);
		jtextField_2.setColumns(10);
		jtextField_2.setBounds(248, 75, 60, 19);
		contentPane.add(jtextField_2);
		
		jtextField_3 = new JTextField();
		jtextField_3.setColumns(10);
		jtextField_3.setBounds(358, 75, 70, 19);
		contentPane.add(jtextField_3);
		
		JLabel lblMultiplication = new JLabel("X");
		lblMultiplication.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMultiplication.setHorizontalAlignment(SwingConstants.CENTER);
		lblMultiplication.setBounds(193, 75, 45, 23);
		contentPane.add(lblMultiplication);
		
		JLabel lblEqual = new JLabel("=");
		lblEqual.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEqual.setBounds(315, 80, 45, 13);
		contentPane.add(lblEqual);
		
		jtextField_4 = new JTextField();
		jtextField_4.setEditable(false);
		jtextField_4.setBounds(473, 75, 96, 19);
		contentPane.add(jtextField_4);
		jtextField_4.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(614, 57, 666, 608);
		contentPane.add(scrollPane);
		
		//--- This TextAreaResults was made for showing all results from the text in JTextArea---//
		JTextArea JTextAreaResults = new JTextArea();
		scrollPane.setViewportView(JTextAreaResults);
		JTextAreaResults.setEditable(false);
		JTextAreaResults.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		// ---- This button put randoms numbers for function Multiplication! ---//
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(stPoizkispov1 < 5) {
					stPoizkispov1++;
					lblNewLabel_1.setText("Stevilo poizkusov: "+ stPoizkispov1);
					
					Random rand = new Random();
					
					int firstNumber;
					int secondNumber;
					
					firstNumber = rand.nextInt(11);
					secondNumber = rand.nextInt(11);
					
					jtextField_1.setText(Integer.toString(firstNumber));
					jtextField_2.setText(Integer.toString(secondNumber));
					
					
					// This was made to clean jtextField 3, 4 and 5, after cliking new button!
					jtextField_3.setText("");
					jtextField_4.setText("");
					jtextField_5.setText("");
				
									}
				
			}
		});
		btnNewButton.setBounds(248, 125, 85, 21);
		contentPane.add(btnNewButton);
		
		
		// ---With this button we get answer if the result written jtext is corecct or wrong for function Multiplication----//
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber;
				String secondNumber;
				int answer;
				String answ1;
				
				firstNumber = jtextField_1.getText();
				secondNumber = jtextField_2.getText();
				
				int fNumber = Integer.parseInt(firstNumber);
				int sNumber = Integer.parseInt(secondNumber);
				
				answer = fNumber * sNumber;
				answ1 = jtextField_3.getText();
				
				int answ2 = Integer.parseInt(answ1);
			
				if(answer == answ2) {
					jtextField_4.setText("Correct");
					jtextField_4.setForeground (Color.green);
					jtextField_5.setText(Integer.toString(answer));
					
				}else {
					jtextField_4.setText("Incorrect");
					jtextField_4.setForeground (Color.red);
					jtextField_5.setText(Integer.toString(answer));
				}
				
				JTextAreaResults.append( "Multiplication: " + jtextField_1.getText() + " X " + jtextField_2.getText() + " = " + jtextField_3.getText() + "    Result: " + jtextField_4.getText() + "    Right answer: " + jtextField_5.getText() + "\n");
			}
			
		});
		btnEnter.setBounds(370, 125, 85, 21);
		contentPane.add(btnEnter);
		
		
		String strlblNewLabel1 = "Number of attempts: "+ stPoizkispov1;
		lblNewLabel_1 = new JLabel("Number of attempts: 0");
		lblNewLabel_1.setBounds(471, 129, 131, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblSestevanje = new JLabel("Addition:");
		lblSestevanje.setBounds(34, 194, 83, 13);
		contentPane.add(lblSestevanje);
		
		jtextField_6 = new JTextField();
		jtextField_6.setEditable(false);
		jtextField_6.setBounds(123, 191, 60, 19);
		contentPane.add(jtextField_6);
		jtextField_6.setColumns(10);
		
		jtextField_7 = new JTextField();
		jtextField_7.setEditable(false);
		jtextField_7.setColumns(10);
		jtextField_7.setBounds(248, 191, 60, 19);
		contentPane.add(jtextField_7);
		
		jtextField_8 = new JTextField();
		jtextField_8.setColumns(10);
		jtextField_8.setBounds(358, 191, 70, 19);
		contentPane.add(jtextField_8);
		
		JLabel lblPravilenOdgovor = new JLabel("Right answer:");
		lblPravilenOdgovor.setBounds(47, 129, 117, 13);
		contentPane.add(lblPravilenOdgovor);
		
		jtextField_5 = new JTextField();
		jtextField_5.setEditable(false);
		jtextField_5.setBounds(168, 126, 70, 19);
		contentPane.add(jtextField_5);
		jtextField_5.setColumns(10);
		
		JLabel lblPlus = new JLabel("+");
		lblPlus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlus.setBounds(193, 186, 45, 23);
		contentPane.add(lblPlus);
		
		JLabel lblEqual2 = new JLabel("=");
		lblEqual2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqual2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEqual2.setBounds(315, 194, 45, 13);
		contentPane.add(lblEqual2);
		
		jtextField_9 = new JTextField();
		jtextField_9.setEditable(false);
		jtextField_9.setColumns(10);
		jtextField_9.setBounds(473, 191, 96, 19);
		contentPane.add(jtextField_9);
		
		JLabel lblPravilenOdgovor_2 = new JLabel("Right answer:");
		lblPravilenOdgovor_2.setBounds(47, 260, 117, 13);
		contentPane.add(lblPravilenOdgovor_2);
		
		jtextField_10 = new JTextField();
		jtextField_10.setEditable(false);
		jtextField_10.setColumns(10);
		jtextField_10.setBounds(168, 257, 70, 19);
		contentPane.add(jtextField_10);
		
		// ---- This buttun put randoms numbers for function PLUS ---//
		
		JButton btnNewButton_2 = new JButton("New");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(stPoizkusov2 < 5) {
					stPoizkusov2++;
					lblNewLabel_2.setText("Number of attempts: "+ stPoizkusov2);
				Random rand = new Random();
				
				int firstNumber;
				int secondNumber;
				
				firstNumber = rand.nextInt(11);
				secondNumber = rand.nextInt(11);
				
				jtextField_6.setText(Integer.toString(firstNumber));
				jtextField_7.setText(Integer.toString(secondNumber));
				
				
				// This was made to clean jtextField 8, 9 and 10, after cliking new button! //
				
				jtextField_8.setText("");
				jtextField_9.setText("");
				jtextField_10.setText("");
				}
			}
		});
		btnNewButton_2.setBounds(248, 256, 85, 21);
		contentPane.add(btnNewButton_2);
		
		// ---With this button we get answer if the result written jtext is corecct or wrong for function PLUS----//
		
		JButton btnEnter_2 = new JButton("Enter");
		btnEnter_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber;
				String secondNumber;
				int answer;
				String answ1;
				
				firstNumber = jtextField_6.getText();
				secondNumber = jtextField_7.getText();
				
				int fNumber = Integer.parseInt(firstNumber);
				int sNumber = Integer.parseInt(secondNumber);
				
				answer = fNumber + sNumber;
				answ1 = jtextField_8.getText();
				
				int answ2 = Integer.parseInt(answ1);
			
				if(answer == answ2) {
					jtextField_9.setText("Correct");
					jtextField_9.setForeground (Color.green);
					jtextField_10.setText(Integer.toString(answer));
					
				}else {
					jtextField_9.setText("Incorrect");
					jtextField_9.setForeground (Color.red);
					jtextField_10.setText(Integer.toString(answer));
				}
				
				JTextAreaResults.append( "Addition: " + jtextField_6.getText() + " + " + jtextField_7.getText() + " = " + jtextField_8.getText() + "    Result: " + jtextField_9.getText() + "    Right answer: " + jtextField_10.getText() + "\n");
			}
		});
		
		String strlblNewLabel_2 ="Number of attempts: " + stPoizkusov2;
		lblNewLabel_2 = new JLabel("Number of attempts: 0");
		lblNewLabel_2.setBounds(473, 263, 131, 13);
		contentPane.add(lblNewLabel_2);
		
		btnEnter_2.setBounds(370, 256, 85, 21);
		contentPane.add(btnEnter_2);
		
		JLabel lblOdtevanje = new JLabel("Countdown:");
		lblOdtevanje.setBounds(34, 336, 83, 13);
		contentPane.add(lblOdtevanje);
		
		jtextField_11 = new JTextField();
		jtextField_11.setEditable(false);
		jtextField_11.setColumns(10);
		jtextField_11.setBounds(123, 333, 60, 19);
		contentPane.add(jtextField_11);
		
		JLabel lblMinus = new JLabel("-");
		lblMinus.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMinus.setBounds(193, 328, 45, 27);
		contentPane.add(lblMinus);
		
		jtextField_12 = new JTextField();
		jtextField_12.setEditable(false);
		jtextField_12.setColumns(10);
		jtextField_12.setBounds(248, 333, 60, 19);
		contentPane.add(jtextField_12);
		
		JLabel lblEqual_3 = new JLabel("=");
		lblEqual_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqual_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEqual_3.setBounds(315, 336, 45, 13);
		contentPane.add(lblEqual_3);
		
		jtextField_13 = new JTextField();
		jtextField_13.setColumns(10);
		jtextField_13.setBounds(358, 333, 70, 19);
		contentPane.add(jtextField_13);
		
		jtextField_14 = new JTextField();
		jtextField_14.setEditable(false);
		jtextField_14.setColumns(10);
		jtextField_14.setBounds(473, 333, 96, 19);
		contentPane.add(jtextField_14);
		
		JLabel lblPravilenOdgovor_3 = new JLabel("Right answer:");
		lblPravilenOdgovor_3.setBounds(47, 402, 117, 13);
		contentPane.add(lblPravilenOdgovor_3);
		
		jtextField_15 = new JTextField();
		jtextField_15.setEditable(false);
		jtextField_15.setColumns(10);
		jtextField_15.setBounds(168, 399, 70, 19);
		contentPane.add(jtextField_15);
		
		// ---- This buttun put randoms numbers for function CountDown ----//
		
		JButton btnNewButton_3 = new JButton("New");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		//-- With this action we limited to 5 times action of possibilites CountDown---//
				if(stPoizkusov3 < 5) {
					stPoizkusov3++;
					lblNewLabel_3.setText("Number of attempts: "+ stPoizkusov3);
					
				Random rand = new Random();
				
				int firstNumber;
				int secondNumber;
				
				firstNumber = rand.nextInt(11);
				secondNumber = rand.nextInt(11);
				
				jtextField_11.setText(Integer.toString(firstNumber));
				jtextField_12.setText(Integer.toString(secondNumber));
				
				
				// This was made to clean jtextField 3, 4 and 5, after cliking new button!//
				
				jtextField_13.setText("");
				jtextField_14.setText("");
				jtextField_15.setText("");
				}
			}
		});
		btnNewButton_3.setBounds(248, 398, 85, 21);
		contentPane.add(btnNewButton_3);
		
		//---With this button we get answer if the result written jtext is corecct or wrong for function CountDown---//
		
		JButton btnEnter_3 = new JButton("Enter");
		btnEnter_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber;
				String secondNumber;
				int answer;
				String answ1;
				
				firstNumber = jtextField_11.getText();
				secondNumber = jtextField_12.getText();
				
				int fNumber = Integer.parseInt(firstNumber);
				int sNumber = Integer.parseInt(secondNumber);
				
				answer = fNumber - sNumber;
				answ1 = jtextField_13.getText();
				
				int answ2 = Integer.parseInt(answ1);
			
				if(answer == answ2) {
					jtextField_14.setText("Correct");
					jtextField_14.setForeground (Color.green);
					jtextField_15.setText(Integer.toString(answer));
					
				}else {
					jtextField_14.setText("Incorrect");
					jtextField_14.setForeground (Color.red);
					jtextField_15.setText(Integer.toString(answer));
				}
				
				JTextAreaResults.append( "Countdown: " + jtextField_11.getText() + " - " + jtextField_12.getText() + " = " + jtextField_13.getText() + "    Result: " + jtextField_14.getText() + "    Right answer: " + jtextField_15.getText() + "\n");
			}
		});
		
		
		//--- With this String label showing how many tryies we done already---//
		
		String strlblNewLabel_3 ="Number of attempts: " + stPoizkusov3;
		lblNewLabel_3 = new JLabel("Number of attempts: 0");
		lblNewLabel_3.setBounds(473, 402, 131, 13);
		contentPane.add(lblNewLabel_3);
		
		btnEnter_3.setBounds(370, 398, 85, 21);
		contentPane.add(btnEnter_3);
		
		JLabel lblDeljenje = new JLabel("Division:");
		lblDeljenje.setBounds(34, 471, 83, 13);
		contentPane.add(lblDeljenje);
		
		jtextField_16 = new JTextField();
		jtextField_16.setEditable(false);
		jtextField_16.setColumns(10);
		jtextField_16.setBounds(123, 468, 60, 19);
		contentPane.add(jtextField_16);
		
		JLabel lblDivision = new JLabel("/");
		lblDivision.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDivision.setBounds(193, 463, 45, 23);
		contentPane.add(lblDivision);
		
		jtextField_17 = new JTextField();
		jtextField_17.setEditable(false);
		jtextField_17.setColumns(10);
		jtextField_17.setBounds(248, 468, 60, 19);
		contentPane.add(jtextField_17);
		
		JLabel lblEqual_4 = new JLabel("=");
		lblEqual_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqual_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEqual_4.setBounds(315, 471, 45, 13);
		contentPane.add(lblEqual_4);
		
		jtextField_18 = new JTextField();
		jtextField_18.setColumns(10);
		jtextField_18.setBounds(358, 468, 70, 19);
		contentPane.add(jtextField_18);
		
		jtextField_19 = new JTextField();
		jtextField_19.setEditable(false);
		jtextField_19.setColumns(10);
		jtextField_19.setBounds(473, 468, 96, 19);
		contentPane.add(jtextField_19);
		
		JLabel lblPravilenOdgovor_4 = new JLabel("Right answer:");
		lblPravilenOdgovor_4.setBounds(47, 537, 117, 13);
		contentPane.add(lblPravilenOdgovor_4);
		
		jtextField_20 = new JTextField();
		jtextField_20.setEditable(false);
		jtextField_20.setColumns(10);
		jtextField_20.setBounds(168, 534, 70, 19);
		contentPane.add(jtextField_20);
		
		// ---- This buttun put randoms numbers for function for division ---//
		
		JButton btnNewButton_4 = new JButton("New");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(stPoizkusov4 < 5) {
					stPoizkusov4++;
					lblNewLabel_4.setText("Stevilo poizkusov: "+ stPoizkusov4);
				
				
				int firstNumber = (int) (Math.random() * 100 + 1);
				List<Integer> firstNumDivisors = getDivisors(firstNumber);
				 
				int divisorsRandIndex = (int) (Math.random() * firstNumDivisors.size());
				int secondNumber = firstNumDivisors.get(divisorsRandIndex);
				
				jtextField_16.setText(Integer.toString(firstNumber));
				jtextField_17.setText(Integer.toString(secondNumber));
				
				// This was made to clean jtextField 18, 19 and 20, after cliking new button! //
				jtextField_18.setText("");
				jtextField_19.setText("");
				jtextField_20.setText("");
			}
			}
		});
		btnNewButton_4.setBounds(248, 533, 85, 21);
		contentPane.add(btnNewButton_4);
		
		//---With this button we get answer if the result written jtext is corecct or wrong for function Division---//
		
		JButton btnEnter_4 = new JButton("Enter");
		btnEnter_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber;
				String secondNumber;
				double rounded;
				String answ1;
				
				firstNumber = jtextField_16.getText();
				secondNumber = jtextField_17.getText();
				
				double fNumber = Double.parseDouble(firstNumber);
				double sNumber = Double.parseDouble(secondNumber);
				
				rounded = fNumber / sNumber;
				double answer = Math.round(rounded*100)/100.0;
				
				//-- Here i put replace function because of reading dot and comma--//
				answ1 = jtextField_18.getText().replace(",", ".");
				
				Double answ2 = Double.parseDouble(answ1);
			
				if(answer == answ2) {
					jtextField_19.setText("Correct");
					jtextField_19.setForeground (Color.green);
					jtextField_20.setText(Double.toString(answer));
					
				}else {
					jtextField_19.setText("Incorrect");
					jtextField_19.setForeground (Color.red);
					jtextField_20.setText(Double.toString(answer));
				}
				
				JTextAreaResults.append( "Division: " + jtextField_16.getText() + " / " + jtextField_17.getText() + " = " + jtextField_18.getText() + "    Result: " + jtextField_19.getText() + "    Right answer: " + jtextField_20.getText() + "\n");
				
			}
		});
		
		//--- With this String label showing how many tryies we done already---//
		String strlblNewLabel_4 ="Number of attempts: " + stPoizkusov4;
		lblNewLabel_4 = new JLabel("Number of attempts: 0");
		lblNewLabel_4.setBounds(473, 537, 131, 13);
		contentPane.add(lblNewLabel_4);
		
		btnEnter_4.setBounds(370, 533, 85, 21);
		contentPane.add(btnEnter_4);
		
		JLabel lblPotenca = new JLabel("Potency:");
		lblPotenca.setBounds(34, 612, 90, 13);
		contentPane.add(lblPotenca);
		
		jtextField_21 = new JTextField();
		jtextField_21.setEditable(false);
		jtextField_21.setColumns(10);
		jtextField_21.setBounds(123, 609, 41, 19);
		contentPane.add(jtextField_21);
		
		jtextField_22 = new JTextField();
		jtextField_22.setEditable(false);
		jtextField_22.setColumns(10);
		jtextField_22.setBounds(168, 589, 41, 19);
		contentPane.add(jtextField_22);
		
		JLabel lblEqual_5 = new JLabel("=");
		lblEqual_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEqual_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEqual_5.setBounds(315, 612, 45, 13);
		contentPane.add(lblEqual_5);
		
		jtextField_23 = new JTextField();
		jtextField_23.setColumns(10);
		jtextField_23.setBounds(358, 609, 70, 19);
		contentPane.add(jtextField_23);
		
		jtextField_24 = new JTextField();
		jtextField_24.setEditable(false);
		jtextField_24.setColumns(10);
		jtextField_24.setBounds(473, 609, 96, 19);
		contentPane.add(jtextField_24);
		
		JLabel lblPravilenOdgovor_5 = new JLabel("Right answer:");
		lblPravilenOdgovor_5.setBounds(47, 652, 117, 13);
		contentPane.add(lblPravilenOdgovor_5);
		
		jtextField_25 = new JTextField();
		jtextField_25.setEditable(false);
		jtextField_25.setColumns(10);
		jtextField_25.setBounds(168, 649, 70, 19);
		contentPane.add(jtextField_25);
		
		JButton btnNewButton_5 = new JButton("New");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(stPoizkusov5 < 5) {
					stPoizkusov5++;
					lblNewLabel_5.setText("Number of attempts: "+ stPoizkusov5);
				
				Random rand = new Random();
				
				int firstNumber;
				int secondNumber;
				
				firstNumber = rand.nextInt(2,10);
				secondNumber = rand.nextInt(2,5);
				
				jtextField_21.setText(Integer.toString(firstNumber));
				jtextField_22.setText(Integer.toString(secondNumber));
				
				
				// This was made to clean jtextField 23, 24 and 25, after cliking new button! //
				jtextField_23.setText("");
				jtextField_24.setText("");
				jtextField_25.setText("");
				}
			}
			
		});
		
		//--- With this String label showing how many tryies we done already---//
		String strlblNewLabel_5 ="Number of attempts: " + stPoizkusov5;
		lblNewLabel_5 = new JLabel("Number of attempts: 0");
		lblNewLabel_5.setBounds(473, 652, 131, 13);
		contentPane.add(lblNewLabel_5);
		
		btnNewButton_5.setBounds(248, 648, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnEnter_5 = new JButton("Enter");
		btnEnter_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstNumber;
				String secondNumber;
				int answer;
				String answ1;
				
				firstNumber = jtextField_21.getText();
				secondNumber = jtextField_22.getText();
				
				int fNumber = Integer.parseInt(firstNumber);
				int sNumber = Integer.parseInt(secondNumber);
				
				answer = (int) Math.pow(fNumber, sNumber);
				answ1 = jtextField_23.getText();
				
				int answ2 = Integer.parseInt(answ1);
			
				if(answer == answ2) {
					jtextField_24.setText("Correct");
					jtextField_24.setForeground (Color.green);
					jtextField_25.setText(Integer.toString(answer));
					
				}else {
					jtextField_24.setText("Incorrect");
					jtextField_24.setForeground (Color.red);
					jtextField_25.setText(Integer.toString(answer));
				}
				
				JTextAreaResults.append( "Potency: " + jtextField_21.getText() + " on " + jtextField_22.getText() + " = " + jtextField_23.getText() + "    Result: " + jtextField_24.getText() + "    Right answer: " + jtextField_25.getText() + "\n");
			}
		});
		btnEnter_5.setBounds(370, 648, 85, 21);
		contentPane.add(btnEnter_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 169, 535, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(34, 304, 535, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(34, 442, 535, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(34, 575, 535, 2);
		contentPane.add(separator_3);	
		
		
		
		//---This button was mad to open a new window and showing results of the test---//
		//Results NewWindow = new Results();
		//NewWindow.setVisible(true);
		
		JButton btnResults = new JButton("Results");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			
				    int wordCount = 0;     
				    //int totalCount = 0;
				    
				    
				    //Creating File instance to reference text file in Java
				  File text = new File("TestFile.txt");
				    
				    //Creating Scanner instnace to read File in Java
				    Scanner s = null;
					try {
						s = new Scanner(text);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				    String[] array = new String[]{"Correct"};
				   
				    for(int i=0; i < array.length; i++)
				     {
				                    System.out.println(array[i]);
				                    wordCount=0;
				                    while (s.hasNext()) 
				                     {
				                         //totalCount++;
				                         if (s.next().equals(array[i])) 
				                         wordCount++;
				                     }
				          
				     
				    int marks = (wordCount*100)/25;		          
				    
				    if(marks<55){  
				    	JTextAreaResults.append("\t===================================================\n");   	
		            	JTextAreaResults.append("Right answer: " + wordCount + "  Percentage: " + marks + "  Grade: insufficient(1)");
				        System.out.println("fail");  
				        if(e.getSource() == btnResults)
					    {
					        try {
					            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
					            JTextAreaResults.getText();
					            JTextAreaResults.write(out);
					            out.println(JTextAreaResults);
					            out.flush();
					            out.close();
					                 
					        } catch (IOException e1) {
					            System.err.println("Error occurred");
					            e1.printStackTrace();
					        }
					    } 
				    }  
				    else if(marks>=55 && marks<63){  
				    	JTextAreaResults.append("\t===================================================\n");
		            	JTextAreaResults.append("Right answer:  " + wordCount + "  Percentage: " + marks + "  Grade: sufficient(2)");
				        System.out.println("2 grade");  
				        if(e.getSource() == btnResults)
					    {
					        try {
					            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
					            JTextAreaResults.getText();
					            JTextAreaResults.write(out);
					            out.println(JTextAreaResults);
					            out.flush();
					            out.close();
					                 
					        } catch (IOException e1) {
					            System.err.println("Error occurred");
					            e1.printStackTrace();
					        }
					    } 
				    }  
				    else if(marks>=63 && marks<75){ 
				    	JTextAreaResults.append("\t===================================================\n");
		            	JTextAreaResults.append("Right answer:  " + wordCount + "  Percentage: " + marks + "  Grade: good(3)");
				        System.out.println("3 grade"); 
				        if(e.getSource() == btnResults)
					    {
					        try {
					            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
					            JTextAreaResults.getText();
					            JTextAreaResults.write(out);
					            out.println(JTextAreaResults);
					            out.flush();
					            out.close();
					                 
					        } catch (IOException e1) {
					            System.err.println("Error occurred");
					            e1.printStackTrace();
					        }
					    } 
				    }  
				    else if(marks>=75 && marks<90){  
				    	JTextAreaResults.append("\t===================================================\n");
		            	JTextAreaResults.append("Right answer:  " + wordCount + "  Percentage: " + marks + "  Grade: very good(4)");
				        System.out.println("4 grade");  
				        if(e.getSource() == btnResults)
					    {
					        try {
					            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
					            JTextAreaResults.getText();
					            JTextAreaResults.write(out);
					            out.println(JTextAreaResults);
					            out.flush();
					            out.close();
					                 
					        } catch (IOException e1) {
					            System.err.println("Error occurred");
					            e1.printStackTrace();
					        }
					    } 
				    }  
				    else if(marks>=90 && marks<100){  
				    	JTextAreaResults.append("\t===================================================\n");
		            	JTextAreaResults.append("Right answer:  " + wordCount + "  Percentage: " + marks + "  Grade: excellent(5)");
				        System.out.println("5 grade");  
				        if(e.getSource() == btnResults)
					    {
					        try {
					            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
					            JTextAreaResults.getText();
					            JTextAreaResults.write(out);
					            out.println(JTextAreaResults);
					            out.flush();
					            out.close();
					                 
					        } catch (IOException e1) {
					            System.err.println("Error occurred");
					            e1.printStackTrace();
					        }
					    } 
				    }else{  
				        System.out.println("Invalid!");  
				    }  
				    
				}  	     
				    
			}	
		});
			
		btnResults.setBounds(719, 675, 85, 21);
		contentPane.add(btnResults);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(34, 59, 535, 2);
		contentPane.add(separator_2_1);
		
		JLabel lblNewLabel = new JLabel("Name and Surname:");
		lblNewLabel.setBounds(34, 10, 117, 13);
		contentPane.add(lblNewLabel);
		
		jtextField_26 = new JTextField();
		jtextField_26.setBounds(178, 10, 115, 19);
		contentPane.add(jtextField_26);
		jtextField_26.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Date of birth:");
		lblNewLabel_6.setBounds(34, 32, 83, 13);
		contentPane.add(lblNewLabel_6);
		
		jtextField_29 = new JTextField();
		jtextField_29.setBounds(178, 32, 115, 19);
		contentPane.add(jtextField_29);
		jtextField_29.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Class: ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setBounds(326, 14, 60, 13);
		contentPane.add(lblNewLabel_7);
		
		jtextField_27 = new JTextField();
		jtextField_27.setBounds(433, 10, 96, 19);
		contentPane.add(jtextField_27);
		jtextField_27.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Student Number:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setBounds(326, 36, 97, 13);
		contentPane.add(lblNewLabel_8);
		
		jtextField_30 = new JTextField();
		jtextField_30.setBounds(433, 32, 96, 19);
		contentPane.add(jtextField_30);
		jtextField_30.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Date:");
		lblNewLabel_9.setBounds(555, 10, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		jtextField_28 = new JTextField();
		jtextField_28.setEditable(false);
		jtextField_28.setBounds(624, 10, 96, 19);
		contentPane.add(jtextField_28);
		jtextField_28.setColumns(10);
		
		// ---Apending INFO DATA to JtextArea from students---//
		
		JButton btnNewButton_1 = new JButton("START");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				JTextAreaResults.append("Name and Surname: " + jtextField_26.getText() + "     Class: " + jtextField_27.getText()+"     Date: " + jtextField_28.getText() +"\n");
				JTextAreaResults.append("Date of birth: " + jtextField_29.getText() + "     Student number: " + jtextField_30.getText()+"     Time: " + jtextField_31.getText() +"\n");
				JTextAreaResults.append("\t=======================================================\n");		
			}
		});
		
		btnNewButton_1.setBounds(759, 28, 85, 21);
		contentPane.add(btnNewButton_1);
		
		jtextField_31 = new JTextField();
		jtextField_31.setEditable(false);
		jtextField_31.setBounds(624, 32, 96, 19);
		contentPane.add(jtextField_31);
		jtextField_31.setColumns(10);
		
		lblNewLabel_10 = new JLabel("Time:");
		lblNewLabel_10.setBounds(555, 36, 45, 13);
		contentPane.add(lblNewLabel_10);
		
		//--- Writing text from JTEXTAREA to text file ----//
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//---With this actions is written all the text into txt file----//
				if(e.getSource() == btnSave)
			    {
			        try {
			            PrintWriter out = new PrintWriter(new FileWriter("TestFile.txt"));
			            JTextAreaResults.getText();
			            JTextAreaResults.write(out);
			            out.println(JTextAreaResults);
			            out.flush();
			            out.close();
			            
			            JOptionPane.showMessageDialog(null,"You have successfully saved, select the Results button option and then press Print", "Save", JOptionPane.PLAIN_MESSAGE);
			            
			        } catch (IOException e1) {
			            System.err.println("Error occurred");
			            e1.printStackTrace();
			        }
			    } 
				
			}
		});	
	
		btnSave.setBounds(624, 675, 85, 21);
		contentPane.add(btnSave);
		
		//--- Printing text from JtextArea ---//
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat ("Printing in Progress");
				MessageFormat footer = new MessageFormat ("Page {0, number, integer}");
				
				try {
					JTextAreaResults.print();
				}catch(java.awt.print.PrinterException ev) {
					System.err.format("No Printer found", ev.getMessage());
				}
			}
		});
		btnPrint.setBounds(814, 675, 85, 21);
		contentPane.add(btnPrint);				
	}
}
