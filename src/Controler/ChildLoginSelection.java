package src.Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import src.SubMainChild;
import src.Exception.EmptyStringException;
import src.Exception.NegativeIntegerException;
import src.Exception.StringSizeException;
import src.Model.Child;
import src.View.GeneralLayout;
import src.View.Child.ChildHomeView;
import src.View.Login.ChildLoginView;

/*
 * Cette classe est le controleur des boutons issus de ChildSelectionView.
 * Elle permet de choisir l'enfant et instancie la génération de ExerciceSelectionView, en lui donnant l'enfant.
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
		// Crée le submain	
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
		// Crée un nouveau panel d'élève avec la classe
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
