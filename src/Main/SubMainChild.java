package Main;

import Exception.*;
import Model.*;
import View.Child.ChildHomeView;
import View.Child.ExerciseCompletionView;
import View.Child.ExerciseVisualizationView;
import View.GeneralLayout;

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
	private Exercise currentExercise;
	private int currentPage = 1;
	
	// 1 - Liste d'exercice
	// 2 - Exercice jou�

	/**
	 * Constructeur de la fenetre, de son remplissage et de l'ajout de ses controlleurs pour l'userAgent Child
	 * @param schoolClasses
	 * @param layout
	 * @param child current child
	 */
	public SubMainChild(Child child, GeneralLayout layout, ArrayList<SchoolClass> schoolClasses) throws Exception{
		this.child = child;
		this.layout = layout;
		this.schoolClasses = schoolClasses;

		ChildHomeView childHome = new ChildHomeView(child, this);
		layout.loadChildHomeView(childHome);

		changeHeader(child, "Ma liste d'exercices");

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
		ExerciseVisualizationView eV = new ExerciseVisualizationView(exercise, child, this);
		JPanel exerciseVisualisationPanel = eV.getExerciseVisualisation();
		layout.getChildHomeView().setCenterPart(exerciseVisualisationPanel);
		layout.refresh();
	}
	
	public void generateExerciseCompletion(Exercise exercise) {
		ExerciseCompletionView eC = new ExerciseCompletionView(exercise, child, this);
		JPanel exerciseCompletionPanel = eC.getExerciseCompletion();
		layout.changeBodyContent(exerciseCompletionPanel);
		currentPage = 2;
		currentExercise = exercise;
	}

	public void selectAssay(Assay assay) {

	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @return the currentExercise
	 */
	public Exercise getCurrentExercise() {
		return currentExercise;
	}
	
}
