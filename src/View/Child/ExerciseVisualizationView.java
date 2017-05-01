package View.Child;

import javax.swing.JButton;
import javax.swing.JPanel;

import Controler.ExerciseCompletionSelection;
import Controler.SchoolClassSelection;
import Main.SubMainChild;
import Model.Child;
import Model.Exercise;

/**
 * Cette classe permet, après sélection d'un exercice par un enfant, de pouvoir rejouer l'exercice,
 * accéder à la liste des tentatives réalisées, visualiser les tentativées réalisées, visualiser la solution de l'exercice,
 * lire l'appréciation de l'enseignant, visualiser le statut de l'exercice (à faire, en cours de correction, corrigé).
 * Cette classe construit les différents éléments de l'interface à partir d'autres classes.
 */
public class ExerciseVisualizationView {
	
	private JPanel exerciseVisualisation;

    /**
     * Constructeur de la classe ExerciseVisualizationView.
     *
     * @param exercise est l'exercice sélectionné par l'enfant
     */
    public ExerciseVisualizationView(Exercise exercise, Child child, SubMainChild main) {
    	exerciseVisualisation = new JPanel();
    	if(child.hasSuceededExercise(exercise)) {
    		JButton replay = new JButton("Rejouer");
        	exerciseVisualisation.add(replay);
    	} else {
    		JButton play = new JButton("Jouer");
    		play.addMouseListener(new ExerciseCompletionSelection(exercise, main));
    		exerciseVisualisation.add(play);
    	}
    	
    }

	public JPanel getExerciseVisualisation() {
		return exerciseVisualisation;
	}
}