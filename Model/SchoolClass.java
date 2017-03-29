/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * @author grp7 Cette classe crée l'object classe définie par un nom, un
 *         professeur et une liste d'élève
 *
 */
public class SchoolClass{

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
	 *            = objet "Teacher" associé à la classe qui doit etre renseigné
	 *            lors de la création de la classe *
	 */
	public SchoolClass(String newClassName, Teacher newTeacher) {
		this.className = newClassName;
		this.teacher = newTeacher;
		this.childList = new ArrayList<Child>();
		this.exerciseList = new ArrayList<Exercise>();
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
	 * Setter teacher
	 * 
	 * @param changement
	 *            de professor
	 */
	public void setTeacher(Teacher newTeacher) {
		teacher = newTeacher;
	}

	/**
	 * Ajout eleve dans childList et modification de la classe de l'élève dans
	 * la classe Child
	 * 
	 * @param Ajout de l'élève --> pas d'ajout possible de la meme personne 2 fois
	 * @throws ObjectAlreadyHereException
	 */
	public void addChild(Child newChild) {
		
		boolean check = false;
		
		for (Child child : childList) {
			if (child == newChild) check = true;
		}
		
		if (check){
			newChild.setSchoolClass(this);
			childList.add(newChild);
		}else
		{
			throws new ObjectAlreadyHereException();
		}

	}

	/**
	 * Remove child in childList
	 * 
	 * @param eleve que l'on veut ajouter dans la classe --> method possible uniquement si la liste contient au moins 1 élève	
	 * @throws EmptyListException			
	 */
	public void removeChild(Child oldChild) {
		if (childList.size() > 0) childList.remove(oldChild);
		else throw new EmptyListException();
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
	 * @param exercice que l'on ajoute --> pas d'ajout du meme exercice possible
	 * @throws ObjectAlreadyHereException
	 */
	public void addExercice(Exercise newExercise) {
		boolean check = false;
		
		for (Exercise exercise : exerciseList) {
			if (exercise == newExercise) check = true;
		}
		
		if (check){
			exerciseList.add(newExercise);
		}else
		{
			throw new ObjectAlreadyHereException();
		}
		
	}

	/**
	 * Remove child in childList
	 * 
	 * @param exercice que l'on veut enlever --> method possible uniquement si la liste contient au moins 1 exercice
	 * @throws EmptyListException
	 */
	public void removeChild(Exercise newExercise) {
		if(exerciseList.size()>0) exerciseList.remove(newExercise);
		else throw new EmptyListException();
	}
}
