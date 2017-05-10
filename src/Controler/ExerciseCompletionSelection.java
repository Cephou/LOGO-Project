package Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Main.Main;
import Main.SubMainChild;
import Model.Exercise;

/**
 * Cette classe permet d'appeler la méthode de généreration de la vue de complétion d'exercice lors d'un clic sur un bouton play
 * @author Groupe 7
 *
 */

public class ExerciseCompletionSelection implements MouseListener {

	private Exercise exercise;
	private Main main;
	
	public ExerciseCompletionSelection(Exercise exercise, Main main) {
		this.main = main;
		this.exercise = exercise;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		((SubMainChild) main).generateExerciseCompletion(exercise);	
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
