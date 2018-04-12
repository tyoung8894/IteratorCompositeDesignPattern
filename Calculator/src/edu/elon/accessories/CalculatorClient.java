package edu.elon.accessories;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.JButton;
import javax.naming.Context;
import javax.naming.InitialContext;

//client program that calls remote objects
public class CalculatorClient implements ActionListener {

	private JFrame frame;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btnDiv;
	JButton btn4; 
	JButton btn5; 
	JButton btn6;
	JButton btnMult;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btnSub;
	JButton btn0;
	JButton btnDecimal; 
	JButton btnEquals;
	JButton btnAdd;
	JTextArea textArea;
	static Calculator calc1;
	boolean bool;
	String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorClient window = new CalculatorClient();
					window.frame.setVisible(true);
					String url = "rmi://localhost/";
					if(args.length == 1) {
						url = "rmi://" + args[0] + "/";
					}

					try {
						Context namingContext = new InitialContext();
					    calc1 = (Calculator) namingContext.lookup(url + "one");
						//Calculator calc2 = (Calculator) namingContext.lookup(url + "two");
						
					} catch(Exception ex) {
						ex.printStackTrace();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		textArea = new JTextArea();
		panel.add(textArea);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 5, 5));

		btn7 = new JButton("7");
		btn7.addActionListener(this);
		panel_1.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(this);
		panel_1.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(this);
		panel_1.add(btn9);

	    btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		panel_1.add(btnDiv);

		btn4 = new JButton("4");
		btn4.addActionListener(this);
		panel_1.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(this);
		panel_1.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(this);
		panel_1.add(btn6);

		btnMult = new JButton("*");
		btnMult.addActionListener(this);
		panel_1.add(btnMult);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		panel_1.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		panel_1.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		panel_1.add(btn3);

		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		panel_1.add(btnSub);

		btn0 = new JButton("0");
		btn0.addActionListener(this);
		panel_1.add(btn0);

		btnDecimal = new JButton(".");
		btnDecimal.addActionListener(this);
		panel_1.add(btnDecimal);

		btnEquals = new JButton("=");
		btnEquals.addActionListener(this);
		panel_1.add(btnEquals);

		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		panel_1.add(btnAdd);
	}


	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == btn0) {
			textArea.setText("0");

		}

		if(e.getSource() == btn1) {
			textArea.setText("1");

		}

		if(e.getSource() == btn2) {
			textArea.setText("2");

		}

		if(e.getSource() == btn3) {
			textArea.setText("3");

		}

		if(e.getSource() == btn4) {
			textArea.setText("4");

		}

		if(e.getSource() == btn5) {
			textArea.setText("5");

		}

		if(e.getSource() == btn6) {
			textArea.setText("6");

		}

		if(e.getSource() == btn7) {
			textArea.setText("7");

		}

		if(e.getSource() == btn8) {
			textArea.setText("8");

		}
		
		if(e.getSource() == btn9) {
			textArea.setText("9");

		}

		if(e.getSource() == btnDecimal) {
			textArea.setText(textArea.getText() + ".");

		}

		if(e.getSource() == btnDiv) {
			operator = "/";
			textArea.setText("/");
			bool = true;
			
		}

		if(e.getSource() == btnMult) {
			operator = "*";
			bool = true;
			textArea.setText("*");

		}

		if(e.getSource() == btnAdd) {
			operator = "+";
			bool = true;
			textArea.setText("+");

		}

		if(e.getSource() == btnSub) {
			operator = "-";
			bool = true;
			textArea.setText("-");
			//calc1.subtract(subValue);
		}

		if(e.getSource() == btnEquals) {
			bool = false;
			//String value = "";
			try {
				//value = "" + calc1.enter();
				//calc1.setOperation(op);
				calc1.operation(operator);
				//textArea.setText(value);
			} catch (RemoteException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			

		}

	}
}
