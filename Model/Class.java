/**
 * 
 */
package Model;

/**
 * @author grp7
 * Cette classe crée l'object classe définie par un nom, un professeur et une liste d'élève
 *
 */
public class Class {
	
	private String className;
	private Teacher teacher;
	private ArrayList<Child> childList;
	
	/**
	 * Constructeur
	 * @param newClassName = nom attribué à la classe
	 * @param newTeacher = objet "Teacher" associé à la classe	 *
	 */
	public Classe(String newClassName, Teacher newTeacher)
	{
		className = newClassName;
		teqcher = newTeacher;
		childList = new ArrayList<Child>();		
	}
	
	/**
	 * Getter className
	 */
	public String getClassName()
	{
		return classname;
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
	public Teacher setTeacher(Teacher newTeacher)
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
	 */
	public void removeChild(Child oldChild)
	{
		childList.remove(oldChild);
	}
	
	
	
	

}
