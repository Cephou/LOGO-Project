package Controler;
import View.*;
import View.Login.*;
import Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/*
 * Cette classe permet de controler le choix de la classe lors d'un clic sur un bouton issu de la classe ClassSelection
 * Elle permet d'instancier la classe ChildSelectionView qui affiche la liste d'�l�ve disponible pour la classe choisie.
 */
public class SchoolClassSelection implements MouseListener {
	
	private SchoolClass schoolClass; // R�cup�re la classe cliqu�e
	private GeneralLayout layout; // Le body a changer

	public SchoolClassSelection(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildLoginView childLogin = new ChildLoginView(schoolClass);
		JPanel childLoginPanel = childLogin.getChildLogin();
		// Change le body avec le nouveau panel d'�l�ves
		layout.changeBodyContent(childLoginPanel);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
