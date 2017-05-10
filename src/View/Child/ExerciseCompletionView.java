package View.Child;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.SubMainChild;
import Model.Child;
import Model.Exercise;

/**
 * Affiche la vue completion d'un exercice donn�, permettant de compl�ter l'exercice.
 * @author Groupe 7
 */

public class ExerciseCompletionView {
	
	private JPanel exerciseCompletion;

	public ExerciseCompletionView(Exercise exercise, Child child, SubMainChild subMainChild) {
		exerciseCompletion = new JPanel();
		JLabel notImplemented = new JLabel("Not implemented");
		exerciseCompletion.add(notImplemented);
	}

	/**
	 * R�cup�re le pannel de l'exercice
	 * @return le pannel exercice
	 */
	
	public JPanel getExerciseCompletion() {
		return exerciseCompletion;
	}
}
