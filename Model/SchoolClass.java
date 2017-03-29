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
	 */
	public void setTeacher(Teacher newTeacher)
	{
		teacher = newTeacher;
	}
	
	/**
	 * Add child in childList
	 */
	public void addChild(Child newChild)
	{
		childList.add(newChild);
	}
	
	/**
	 * Remove child in childList
	 * Method possible uniquement si la liste contient au moins 1 élève
	 */
	public void removeChild(Child oldChild) 
	{
		childList.remove(oldChild);
	}

}
