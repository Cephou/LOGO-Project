/**
 * 
 */
package Model;

import java.util.ArrayList;

import Exception.AlreadyInListException;
import Exception.EmptyStringException;
import Exception.StringSizeException;

/**
 * @author grp7 Cette classe crée l'object classe définie par un nom, un
 *         professeur et une liste d'élève
 *
 */
public class SchoolClass {

	private String className;
	private Teacher teacher;
	private ArrayList<Child> childList;
	private ArrayList<Exercise> exerciseList;

	/**
	 * Constructeur
	 * 
	 * @param newClassName
	 *            = nom attribué à la classe qui doit etre renseigné à la
	 *            création
	 * @param newTeacher
	 *            = objet "Teacher" associé à la classe qui doit etre
	 *            renseigné lors de la création de la classe
	 * @throws StringSizeException
	 * @throws EmptyStringException
	 * *
	 */
	public SchoolClass(String newClassName, Teacher newTeacher)
			throws EmptyStringException, StringSizeException {
		this.setClassName(newClassName);
		this.teacher = newTeacher;
		this.childList = new ArrayList<Child>();
		this.exerciseList = new ArrayList<Exercise>();
	}

	/**
	 * @param newClassName
	 *            have to be > 0 and <50
	 * @throws EmptyStringException
	 * @throws StringSizeException
	 */
	private void setClassName(String className)
			throws EmptyStringException, StringSizeException {
		if (className.isEmpty()) {
			throw new EmptyStringException();
		} else if (className.length() > 50) {
			throw new StringSizeException();
		}
		else {
			this.className = className;
		}
	}

	/**
	 * s Getter className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Getter teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * Getter childList
	 */
	public ArrayList<Child> getChildList() {
		return childList;
	}

	/**
	 * Ajout eleve dans childList et modification de la classe de l'élève dans
	 * la classe Child
	 * 
	 * @param Ajout
	 *            de l'élève --> pas d'ajout possible de la meme personne 2
	 *            fois
	 * @throws ObjectAlreadyHereException
	 */
	public void addChild(Child newChild) {

		boolean check = false;

		for (Child child : childList) {
			if (child == newChild)
				check = true;
		}

		if (check) {
			newChild.setSchoolClass(this);
			childList.add(newChild);
		} else {
			// throws new ObjectAlreadyHereException();
		}

	}

	/**
	 * Remove child in childList
	 * 
	 * @param eleve
	 *            que l'on veut supprimer dans la classe --> method possible
	 *            uniquement si l'eleve fait partie de la classe
	 * @throws EmptyListException
	 */
	public void removeChild(Child oldChild) {
		if (childList.contains(oldChild)) {
			childList.remove(oldChild);
		}
	}

	/**
	 * Getter exerciseList
	 */

	public ArrayList<Exercise> getExerciseList() {
		return exerciseList;
	}

	/**
	 * Add Exercise in exerciseList
	 * 
	 * @param exercice
	 *            que l'on ajoute, un exercice ne peut pas etre present 2 fois
	 * @throws AlreadyInListException
	 * @throws ObjectAlreadyHereException
	 */
	public void addExercice(Exercise exercise) throws AlreadyInListException {
		if (exerciseList.contains(exercise)) {
			throw new AlreadyInListException();
		} else
			exerciseList.add(exercise);
	}

	/**
	 * Remove child in childList
	 * 
	 * @param exercice
	 *            que l'on veut enlever --> method possible uniquement si la
	 *            liste contient au moins 1 exercice
	 * @throws EmptyListException
	 */
	public void removeChild(Exercise exercise) {
		if (exerciseList.contains(exercise))
			exerciseList.remove(exercise);
	}
}
