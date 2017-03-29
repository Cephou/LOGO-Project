/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * @author grp7
 * Cette classe crée l'object classe définie par un nom, un professeur et une liste d'élève
 *
 */
public class SchoolClass {
	 
	private String className;
	private Teacher teacher;
	private ArrayList<Child> childList;
	private ArrayList<Exercise> exerciseList;
	
	/**
	 * Constructeur
	 * @param newClassName = nom attribué à la classe qui doit etre renseigné à la création
	 * @param newTeacher = objet "Teacher" associé à la classe qui doit etre renseigné lors de la création de la classe	 *
	 */
	public SchoolClass(String newClassName, Teacher newTeacher)
	{
		this.className = newClassName;
		this.teacher = newTeacher;
		this.childList = new ArrayList<Child>();
		this.exerciseList = new ArrayList<Exercise>();
	}
	
	/**s
	 * Getter className
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * Getter teacher
	 */
	public Teacher getTeacher()
	{
		return teacher;
	}
	
	/**
	 * Getter childList
	 */
	public ArrayList<Child> getChildList()
	{
		return childList;
	}
	
	/**
	 * Setter teacher
	 * @param changement de professor
	 */
	public void setTeacher(Teacher newTeacher)
	{
		teacher = newTeacher;
	}
	
	/**
	 * Ajout eleve dans childList et modification de la classe de l'élève dans la classe Child
	 * @param Ajout de l'élève --> pas d'ajout possible de la meme personne 2 fois
	 */
	public void addChild(Child newChild)
	{
		newChild.setSchoolClass(this);
		childList.add(newChild);
		
	}
	
	/**
	 * Remove child in childList
	 * @param eleve que l'on veut ajouter dans la classe --> method possible uniquement si la liste contient au moins 1 élève
	 */
	public void removeChild(Child oldChild) 
	{
		childList.remove(oldChild);
	}
	
	/**
	 * Getter exerciseList
	 */

	public ArrayList<Exercise> getExerciseList()
	{
		return exerciseList;
	}
	
	/**
	 * Add Exercise in exerciseList
	 * @param  exercice que l'on ajoute --> pas d'ajout du meme exercice possible
	 */
	public void addExercice(Exercise exercise)
	{
		exerciseList.add(exercise);
	}
	
	/**
	 * Remove child in childList
	 * @param exercice que l'on veut enlever --> method possible uniquement si la liste contient au moins 1 exercice
	 */
	public void removeChild(Exercise exercise) 
	{
		exerciseList.remove(exercise);
	}
}
