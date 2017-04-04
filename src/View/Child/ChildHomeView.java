package View.Child;

import javax.swing.JButton;
import javax.swing.JPanel;

import View.Modules.ExerciseListView;

/*
 * Cette classe affiche la liste des exercices de l'élève d'une part, mais aussi la visualisation d'un exercice au clic
 */

public class ChildHomeView {
	
	private JPanel childHomeView;

	public ChildHomeView() {
		childHomeView = new JPanel();
	}
	
	public JPanel getChildHomeView() {
		return childHomeView;
	}
}
