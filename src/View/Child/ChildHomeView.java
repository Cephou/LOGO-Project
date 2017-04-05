package View.Child;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import Main.Main;
import Main.SubMainChild;
import Model.Child;
import View.Modules.ExerciseListView;

/*
 * Cette classe affiche la liste des exercices de l'élève d'une part, mais aussi la visualisation d'un exercice au clic
 */

public class ChildHomeView {
	
	private JPanel childHomeView, leftPart, centerPart, rightPart;

	public ChildHomeView(Child child, SubMainChild main) {
		childHomeView = new JPanel();
		leftPart = new JPanel();
		centerPart = new JPanel();
		rightPart = new JPanel();
		
		ExerciseListView exerciseList = new ExerciseListView(child, main);
		setLeftPart(exerciseList);
		
		childHomeView.setLayout(new BorderLayout());
		childHomeView.add(leftPart, BorderLayout.WEST);
		childHomeView.add(centerPart, BorderLayout.CENTER);
		childHomeView.add(rightPart, BorderLayout.EAST);
		
	}
	
	/**
	 * @return the leftPart
	 */
	public JPanel getLeftPart() {
		return leftPart;
	}

	/**
	 * @param leftPart the leftPart to set
	 */
	public void setLeftPart(JPanel leftPart) {
		this.leftPart = leftPart;
	}

	/**
	 * @return the centerPart
	 */
	public JPanel getCenterPart() {
		return centerPart;
	}

	/**
	 * @param centerPart the centerPart to set
	 */
	public void setCenterPart(JPanel pcenterPart) {
		centerPart.removeAll();
		centerPart.add(pcenterPart);
	}

	/**
	 * @return the rightPart
	 */
	public JPanel getRightPart() {
		return rightPart;
	}

	/**
	 * @param rightPart the rightPart to set
	 */
	public void setRightPart(JPanel rightPart) {
		this.rightPart = rightPart;
	}

	public JPanel getChildHomeView() {
		return childHomeView;
	}
}
