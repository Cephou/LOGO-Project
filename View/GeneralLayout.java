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

	/**
	 * Create the application.
	 */
	public GeneralLayout() {
		initialize(); // Génère le header, body et footer
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		header = new Header();
		frame.getContentPane().add(header.getHeader(), BorderLayout.NORTH);
		
		body = new JPanel();		
		frame.getContentPane().add(body, BorderLayout.CENTER);
		body.setLayout(new BorderLayout(0, 0));
		
		footer = new JPanel();
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	
	/**
	 * Permet de changer dynamiquement le contenu du body
	 * @param object JPanel à ajouter dans le body
	 */
	public void changeBodyContent(JPanel object) {
		body.removeAll(); // Vide le contenu existant
		body.add(object, BorderLayout.CENTER); // Ajoute le nouveau contenu
	}
}
