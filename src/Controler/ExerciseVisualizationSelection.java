package Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Main.Main;
import Main.SubMainChild;
import Model.Exercise;

/**
 * Created by wassim on 31/03/2017.
 */
public class ExerciseVisualizationSelection implements MouseListener {

	private Main main;
	private Exercise exercise;
	
	
	public ExerciseVisualizationSelection(Exercise exercise, Main main) {
		this.main = main;
		this.exercise = exercise;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		((SubMainChild) main).generateExerciseVisualisation(exercise);	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
