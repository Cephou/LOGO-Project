package Main;

import Exception.*;
import Model.*;
import View.Child.ChildHomeView;
import View.Child.ExerciseVisualizationView;
import View.GeneralLayout;
import View.Modules.ExerciseListView;

import javax.swing.*;
import java.util.ArrayList;

public class SubMainChild extends Main {
	/**
	 * Ce main est appele par le layout lorsque l'utilisateuer choisi est un eleve.
	 * Il peut 
	 * Il permet de sauvergarder les varaibles "session" comme l'eleve couant
	 * par exemple.
	 * 
	 */

	private Child child;
	private GeneralLayout layout;
	private ArrayList<SchoolClass> schoolClasses;

	/**
	 * Constructeur de la fenetre, de son remplissage et de l'ajout de ses controlleurs pour l'userAgent Child
	 * @param schoolClasses 
	 * @param layout 
	 * @param Child current child
	 */
	public SubMainChild(Child child, GeneralLayout layout, ArrayList<SchoolClass> schoolClasses) throws AlreadyInListException, tooLongStringException, EmptyStringException, NegativeIntegerException, StringSizeException{
		this.child = child;
		this.layout = layout;
		this.schoolClasses = schoolClasses;

		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildHomeView childHome = new ChildHomeView();
		ExerciseListView exerciseList = new ExerciseListView(child, this);
		JPanel childHomePanel = childHome.getChildHomeView();
		childHomePanel.add(exerciseList);
		// Change le body avec le nouveau panel d'exercices
		layout.changeBodyContent(childHomePanel); 
		changeHeader(child, "Ma liste d'exercices");
		//ajout des listenner
	}
	
	public void changeHeader(User user, String pageTitle) {
		layout.getHeader().setHeader(user, pageTitle);
	}

	/**
	 * G�n�re la vue rapide de l'exercice
	 * @param exercise
	 */
	public void generateExerciseVisualisation(Exercise exercise) {
		// G�n�rer la vue exercice
		ExerciseVisualizationView exerciseVisualisation = new ExerciseVisualizationView(exercise);
		JPanel exerciseVisualisationPanel = exerciseVisualisation.getExerciseVisualisation();
		// Ajoute la vue
		layout.addToBody(exerciseVisualisationPanel);
	}


	public void selectAssay(Assay assay) {

	}

}
