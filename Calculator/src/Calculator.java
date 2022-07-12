

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnDuplicate;
	private JButton btnClear;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	private JButton btnDivision;
	private JButton btnPercent;
	private JButton btnBackSpace;
	private JButton btnSin;
	private JButton btnCos;
	private JButton btnTan;
	private JButton btnTanh;
	private JButton btnCosh;
	private JButton btnSinh;
	private JButton btnLog;
	private JButton btnExp;
	private JButton btnOneDevidedX;

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
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setBounds(62, 10, 337, 45);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(134, 238, 62, 45);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(201, 238, 62, 45);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(267, 238, 62, 45);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(134, 293, 62, 45);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(201, 293, 62, 45);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(267, 293, 62, 45);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(134, 348, 62, 45);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(201, 348, 62, 45);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(267, 348, 62, 45);
		frame.getContentPane().add(btn3);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(134, 403, 129, 45);
		frame.getContentPane().add(btn0);
		
		//--- This button sumus up numbers---//
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(337, 348, 62, 45);
		frame.getContentPane().add(btnPlus);
		
		//--- This button deducts numbers in between---//
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(337, 293, 62, 45);
		frame.getContentPane().add(btnMinus);
		
		//---This button is to multiplicate numbers---//
		JButton btnDuplicate = new JButton("*");
		btnDuplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnDuplicate.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDuplicate.setBounds(337, 238, 62, 45);
		frame.getContentPane().add(btnDuplicate);
		
		//---This button was made for + and - functions--//
		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPM.setBounds(62, 404, 62, 45);
		frame.getContentPane().add(btnPM);
		
		//--- This button is to put Dot in between numbers--//
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! txtDisplay.getText().contains("."))
		          {
		          txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
		          }
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(267, 403, 62, 45);
		frame.getContentPane().add(btnDot);
		
		//--- This button was made to make results in every function possible---//
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				
				if(operations == "+")
				{
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations =="-")
				{
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*")
				{
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations == "X^Y")
				{
					/*double resultt = 1;
					for(int i=0; i<secondnum; i++);
					{
						resultt = firstnum * resultt;	
					}
					answer = String.format("%.2f", resultt);
					txtDisplay.setText(answer);*/
					result = Math.pow(firstnum, secondnum);
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(337, 403, 62, 45);
		frame.getContentPane().add(btnEqual);
		
		//---This button was made to clean everthing from txtDisplay---//
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(267, 183, 62, 45);
		frame.getContentPane().add(btnClear);
		
		//--- This button was made for Division numbers---//
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivision.setBounds(337, 183, 62, 45);
		frame.getContentPane().add(btnDivision);
		
		//---This number was made for Percentig of the number---//
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(201, 183, 62, 45);
		frame.getContentPane().add(btnPercent);
		
		//---This button was made for backwards---//
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				
				if(txtDisplay.getText().length()> 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 18));
		btnBackSpace.setBounds(134, 183, 62, 45);
		frame.getContentPane().add(btnBackSpace);
		
		// --- This button calculate Sin function from choosen number with Math.sin function--//
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.sin(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
				
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSin.setBounds(337, 65, 62, 45);
		frame.getContentPane().add(btnSin);
		
		// --- This button calculate Cos function from choosen number with Math.cos function--//
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a = Math.cos(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCos.setBounds(267, 65, 62, 45);
		frame.getContentPane().add(btnCos);
		
		// --- This button calculate Tan function from choosen number with Math.tan function--//
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTan.setBounds(201, 65, 62, 45);
		frame.getContentPane().add(btnTan);
		
		// --- This button calculate Tanh function from choosen number with Math.tanh function--//
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTanh.setBounds(201, 117, 62, 45);
		frame.getContentPane().add(btnTanh);
		
		// --- This button calculate Cosh function from choosen number with Math.cosh function--//
		btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCosh.setBounds(267, 117, 62, 45);
		frame.getContentPane().add(btnCosh);
		
		// --- This button calculate Sinh function from choosen number with Math.sinh function--//
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSinh.setBounds(337, 117, 62, 45);
		frame.getContentPane().add(btnSinh);
		
		// --- This button calculate Log function from choosen number with Math.Log function--//
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.setBounds(134, 117, 62, 45);
		frame.getContentPane().add(btnLog);
		
		// --- This button calculate EXP function from choosen number with Math.exp function--//
		
		JButton btnExp = new JButton("e^x");
		btnExp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExp.setBounds(134, 66, 62, 45);
		frame.getContentPane().add(btnExp);
		
		// --- This button calculate 1 devided with x function from choosen number--//
		JButton btnOneDevidedX = new JButton("1/X");
		btnOneDevidedX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() +a);
			}
		});
		btnOneDevidedX.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOneDevidedX.setBounds(62, 117, 62, 45);
		frame.getContentPane().add(btnOneDevidedX);
		
		JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtDisplay.getText());
				double fact = 1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+fact);
			}
		});
		btnN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnN.setBounds(62, 348, 62, 45);
		frame.getContentPane().add(btnN);
		
		//-- This button was made to exponential expressions for power on 2--//
		JButton btnXforTwo = new JButton("X^2");
		btnXforTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText()));
				a=a*a;
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			}
		});
		btnXforTwo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXforTwo.setBounds(62, 293, 62, 45);
		frame.getContentPane().add(btnXforTwo);
		
		//-- This button was made to exponential expressions for power on 3--//
		JButton btnXPoweronThree = new JButton("X^3");
		btnXPoweronThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText()));
				a=a*a*a;
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			
			}
		});
		btnXPoweronThree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXPoweronThree.setBounds(62, 238, 62, 45);
		frame.getContentPane().add(btnXPoweronThree);
		
		//--This button returns the square root of a value of type double passed to it as argument--//
		JButton btnR = new JButton("\u221A");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(txtDisplay.getText()));
				
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText()+a);
			
			}
		});
		btnR.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnR.setBounds(62, 65, 62, 45);
		frame.getContentPane().add(btnR);
		
		//---This button X^Y was made to make this action MathPower X AND Y, formula is located in resut---//
		JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnXy.setBounds(62, 183, 62, 45);
		frame.getContentPane().add(btnXy);
		
	}
}
