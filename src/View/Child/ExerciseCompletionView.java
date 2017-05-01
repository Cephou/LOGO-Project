package View.Child;

import javax.swing.JLabel;
import javax.swing.JPanel;

import Main.SubMainChild;
import Model.Child;
import Model.Exercise;

/**
 * Prend en paramètre un exercice, click sur bouton valider envoie tout vers database
 */
public class ExerciseCompletionView {
	
	private JPanel exerciseCompletion;

	public ExerciseCompletionView(Exercise exercise, Child child, SubMainChild subMainChild) {
		exerciseCompletion = new JPanel();
		JLabel test = new JLabel("lol");
		exerciseCompletion.add(test);
	}

	public JPanel getExerciseCompletion() {
		return exerciseCompletion;
	}
}
