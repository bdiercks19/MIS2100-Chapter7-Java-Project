package MyGradleProject;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frame;
	private JTextField debox;
	private JTextField numbox;
	private JTextField rebox;
	private JTextField num1box;
	private JTextField num2box;
	private JTextField valbox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel topnumber = new JLabel("Numerator");
		topnumber.setHorizontalAlignment(SwingConstants.CENTER);
		topnumber.setBounds(7, 10, 110, 21);
		frame.getContentPane().add(topnumber);
		
		JLabel bottomnumber = new JLabel("Denominator");
		bottomnumber.setHorizontalAlignment(SwingConstants.CENTER);
		bottomnumber.setBounds(14, 45, 103, 35);
		frame.getContentPane().add(bottomnumber);
		
		debox = new JTextField();
		debox.setHorizontalAlignment(SwingConstants.CENTER);
		debox.setBounds(10, 75, 110, 20);
		frame.getContentPane().add(debox);
		debox.setColumns(10);
		
		numbox = new JTextField();
		numbox.setHorizontalAlignment(SwingConstants.CENTER);
		numbox.setBounds(10, 30, 110, 20);
		frame.getContentPane().add(numbox);
		numbox.setColumns(10);
		
		rebox = new JTextField();
		rebox.setHorizontalAlignment(SwingConstants.CENTER);
		rebox.setBounds(150, 55, 110, 20);
		frame.getContentPane().add(rebox);
		rebox.setColumns(10);
		
		JLabel results11 = new JLabel("Result");
		results11.setBounds(185, 40, 45, 13);
		frame.getContentPane().add(results11);
		
		JButton Calculate = new JButton("Calculate");

		Calculate.setBounds(10, 105, 110, 21);
		frame.getContentPane().add(Calculate);
		
		JLabel num1 = new JLabel("Number 1");
		num1.setHorizontalAlignment(SwingConstants.CENTER);
		num1.setBounds(5, 140, 110, 13);
		frame.getContentPane().add(num1);
		
		JLabel num2 = new JLabel("Number 2");
		num2.setHorizontalAlignment(SwingConstants.CENTER);
		num2.setBounds(5, 180, 115, 13);
		frame.getContentPane().add(num2);
		
		num1box = new JTextField();
		num1box.setHorizontalAlignment(SwingConstants.CENTER);
		num1box.setBounds(10, 160, 107, 19);
		frame.getContentPane().add(num1box);
		num1box.setColumns(10);
		
		num2box = new JTextField();
		num2box.setHorizontalAlignment(SwingConstants.CENTER);
		num2box.setBounds(10, 200, 107, 19);
		frame.getContentPane().add(num2box);
		num2box.setColumns(10);
		
		JLabel valuez = new JLabel("Result");
		valuez.setHorizontalAlignment(SwingConstants.CENTER);
		valuez.setBounds(175, 165, 45, 13);
		frame.getContentPane().add(valuez);
		
		valbox = new JTextField();
		valbox.setHorizontalAlignment(SwingConstants.CENTER);
		valbox.setBounds(150, 185, 110, 19);
		frame.getContentPane().add(valbox);
		valbox.setColumns(10);
		
		JButton valbutton = new JButton("Calculate");

		valbutton.setBounds(7, 229, 110, 21);
		frame.getContentPane().add(valbutton);
		
		Calculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			double numerator = Double.parseDouble(numbox.getText());
			double denominator = Double.parseDouble(debox.getText());
			
			SimpleMath result = new SimpleMath();
			
			try { 
				double output = result.divide(numerator, denominator);
				rebox.setText("" + output);
			} catch(ArithmeticException x) {
				rebox.setText("Cannot divide by 0");
				} 
			}
		});
		
		valbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			double number1 = Double.parseDouble(num1box.getText());
			double number2 = Double.parseDouble(num2box.getText());
			
			SimpleMath result2 = new SimpleMath();
			double output = result2.multiply(number1, number2);
			valbox.setText("" + output);
			
			}
		});
		
	}
}
//