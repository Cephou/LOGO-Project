package Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.Child;
import View.GeneralLayout;
import View.Child.ChildHomeView;
import View.Login.ChildLoginView;
import Main.Main;
import Main.SubMainChild;

/*
 * Cette classe est le controleur des boutons issus de ChildSelectionView.
 * Elle permet de choisir l'enfant et instancie la procédure du main de génération de la vue de sélection d'exercice, en lui donnant l'enfant.
 */

public class ChildLoginSelection implements MouseListener {

	private Child child; // L'enfant loggé
	private Main main; // Lien avec le main
	
	public ChildLoginSelection(Child child, Main main) {
		this.child = child;
		this.main = main;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		try {
			main.loginChild(child);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
