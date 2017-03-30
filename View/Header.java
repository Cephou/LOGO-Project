package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Header {
	
	JPanel header;

	public Header() {
		header = new JPanel();
		header.setLayout(new BorderLayout(0, 0));
		
		JPanel headerContent = new JPanel();
		header.add(headerContent, BorderLayout.CENTER);
		headerContent.setLayout(new BorderLayout(0, 0));
		
		JPanel goBack = new JPanel();
		headerContent.add(goBack, BorderLayout.WEST);
		
		JButton btnReturn = new JButton("RETURN");
		goBack.add(btnReturn);
		
		JPanel headerInformation = new JPanel();
		headerContent.add(headerInformation, BorderLayout.CENTER);
		headerInformation.setLayout(new BorderLayout(0, 0));
		
		JPanel userInformation = new JPanel();
		headerInformation.add(userInformation, BorderLayout.WEST);
		userInformation.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel userIcon = new JPanel();
		userInformation.add(userIcon);
		
		JPanel userLastName = new JPanel();
		userInformation.add(userLastName);
		
		/*
		 * Récupère la valeur du nom de l'utilisateur en cours		
		 */
		JLabel lblLastName = new JLabel("NAME");
		userLastName.add(lblLastName);
		
		JPanel userFirstName = new JPanel();
		userInformation.add(userFirstName);
		
		/*
		 * Récupère la valeur du prénom de l'utilisateur en cours		
		 */
		JLabel lblFirstName = new JLabel("PRENOM");
		userFirstName.add(lblFirstName);
		
		JPanel userClass = new JPanel();
		userInformation.add(userClass);
		
		/*
		 * Récupère la valeur de la classe de l'utilisateur		
		 */
		JLabel lblClass = new JLabel("CLASSE");
		userClass.add(lblClass);
		
		JPanel pageTitle = new JPanel();
		headerInformation.add(pageTitle);
		pageTitle.setLayout(new BorderLayout(0, 0));
		
		/*
		 * Récupère la valeur de la page en cours
		 */
		JLabel lblPageTitle = new JLabel("PAGE TITLE");
		pageTitle.add(lblPageTitle, BorderLayout.EAST);
		
		JPanel help = new JPanel();
		headerInformation.add(help, BorderLayout.EAST);
		
		JButton btnHelp = new JButton("HELP");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		help.add(btnHelp);
	}
	
	public JPanel getHeader() {
		return header;
	}
	
	public void changeIcon() {
		// Change l'icone
	}
	
	public void changeFirstName() {
		// Change le prénom
	}
	
	public void changeLastName() {
		// Change le nom de famille
	}
	
	public void changeClass() {
		// Change la classe
	}
	
	public void changePageTitle() {
		// Change le titre de la page
	}
}
