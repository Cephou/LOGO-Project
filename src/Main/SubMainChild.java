package Main;
import java.util.ArrayList;

import javax.swing.JPanel;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.Child;
import Model.SchoolClass;
import Model.User;
import View.GeneralLayout;
import View.Child.ChildHomeView;
import View.Modules.ExerciseListView;

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
	public SubMainChild(Child child, GeneralLayout layout, ArrayList<SchoolClass> schoolClasses) throws EmptyStringException, NegativeIntegerException, StringSizeException{
		this.child = child;
		this.layout = layout;
		this.schoolClasses = schoolClasses;

		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildHomeView childHome = new ChildHomeView();
		ExerciseListView exerciseList = new ExerciseListView(child);
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

}
