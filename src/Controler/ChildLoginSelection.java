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
import Main.SubMainChild;

/*
 * Cette classe est le controleur des boutons issus de ChildSelectionView.
 * Elle permet de choisir l'enfant et instancie la g�n�ration de ExerciceSelectionView, en lui donnant l'enfant.
 */
public class ChildLoginSelection implements MouseListener {

	private Child child;
	private GeneralLayout layout;
	
	public ChildLoginSelection(Child child, GeneralLayout layout) {
		this.child = child;
		this.layout = layout;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// Cr�e le submain	
		try {
			new SubMainChild(child);
		} catch (EmptyStringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeIntegerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StringSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildHomeView childHome = new ChildHomeView();
		JPanel childHomePanel = childHome.getChildHomeView();
		// Change le body avec le nouveau panel d'exercices
		this.layout.changeBodyContent(childHomePanel);
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
