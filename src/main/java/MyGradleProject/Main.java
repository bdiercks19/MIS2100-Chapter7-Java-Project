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
		topnumber.setBounds(27, 0, 97, 32);
		frame.getContentPane().add(topnumber);
		
		JLabel bottomnumber = new JLabel("Denominator");
		bottomnumber.setBounds(25, 45, 103, 35);
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
			
	}
}
//