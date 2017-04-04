package View.Child;

import java.awt.BorderLayout;
import java.awt.GridLayout;

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
		childHomeView.setLayout(new GridLayout(1,3));
	}
	
	public JPanel getChildHomeView() {
		return childHomeView;
	}
}
