package View;
import View.Login.ClassLoginView;
import View.Modules.Header;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GeneralLayout {

	private JFrame frame;
	private Header header;
	private JPanel body, footer;
	private ClassLoginView classSelection;

	/**
	 * Create the application.
	 */
	public GeneralLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setVisible(true);
		
		header = new Header();
		frame.getContentPane().add(header.getHeader(), BorderLayout.NORTH);
		
		body = new JPanel();		
		frame.getContentPane().add(body, BorderLayout.CENTER);
		body.setLayout(new BorderLayout(0, 0));
		
		footer = new JPanel();
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
	}
	
	public void changeBodyContent(JPanel object) {
		body.add(object, BorderLayout.CENTER);	
	}
}
