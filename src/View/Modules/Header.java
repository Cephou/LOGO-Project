package View.Modules;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.ExerciseVisualizationSelection;
import Controler.ReturnButtonSelection;
import Main.Main;
import Model.Child;
import Model.User;

public class Header {
	
	private Main main;
	private JPanel header, goBack;
	private JButton btnReturn;
	private JLabel lblLastName, lblFirstName, lblClass, lblPageTitle;
	
	public Header(Main main) {
		header = new JPanel();
		header.setLayout(new BorderLayout(0, 0));
		
		JPanel headerContent = new JPanel();
		header.add(headerContent, BorderLayout.CENTER);
		headerContent.setLayout(new BorderLayout(0, 0));
		
		goBack = new JPanel();
		headerContent.add(goBack, BorderLayout.WEST);
		
		btnReturn = new JButton("RETURN");
		btnReturn.addMouseListener(new ReturnButtonSelection(main));
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
		lblLastName = new JLabel("NAME");
		userLastName.add(lblLastName);
		
		JPanel userFirstName = new JPanel();
		userInformation.add(userFirstName);
		
		/*
		 * Récupère la valeur du prénom de l'utilisateur en cours		
		 */
		lblFirstName = new JLabel("PRENOM");
		userFirstName.add(lblFirstName);
		
		JPanel userClass = new JPanel();
		userInformation.add(userClass);
		
		/*
		 * Récupère la valeur de la classe de l'utilisateur		
		 */
		lblClass = new JLabel("CLASSE");
		userClass.add(lblClass);
		
		JPanel pageTitle = new JPanel();
		headerInformation.add(pageTitle);
		pageTitle.setLayout(new BorderLayout(0, 0));
		
		/*
		 * Récupère la valeur de la page en cours
		 */
		lblPageTitle = new JLabel("PAGE TITLE");
		pageTitle.add(lblPageTitle, BorderLayout.EAST);
		
	}
	
	public JPanel getHeader() {
		return header;
	}
	
	public void setHeader(User user, String pageTitle) {
		lblFirstName.setText(user.getFirstName());
		lblLastName.setText(user.getLastName());
		if(user instanceof Child) {
			lblClass.setText(((Child) user).getSchoolClass().getClassName());
		}
		lblPageTitle.setText(pageTitle);
	}
	
	/**
	 * @return the btnReturn
	 */
	public JButton getBtnReturn() {
		return btnReturn;
	}

	/**
	 * @param btnReturn the btnReturn to set
	 */
	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}

	/**
	 * @return the lblLastName
	 */
	public JLabel getLblLastName() {
		return lblLastName;
	}

	/**
	 * @param lblLastName the lblLastName to set
	 */
	public void setLblLastName(JLabel lblLastName) {
		this.lblLastName = lblLastName;
	}

	/**
	 * @return the lblFirstName
	 */
	public JLabel getLblFirstName() {
		return lblFirstName;
	}

	/**
	 * @param lblFirstName the lblFirstName to set
	 */
	public void setLblFirstName(JLabel lblFirstName) {
		this.lblFirstName = lblFirstName;
	}

	/**
	 * @return the lblClass
	 */
	public JLabel getLblClass() {
		return lblClass;
	}

	/**
	 * @param lblClass the lblClass to set
	 */
	public void setLblClass(JLabel lblClass) {
		this.lblClass = lblClass;
	}

	/**
	 * @return the lblPageTitle
	 */
	public JLabel getLblPageTitle() {
		return lblPageTitle;
	}

	/**
	 * @param lblPageTitle the lblPageTitle to set
	 */
	public void setLblPageTitle(JLabel lblPageTitle) {
		this.lblPageTitle = lblPageTitle;
	}
}
