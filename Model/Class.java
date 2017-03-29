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
	 * @param newTeacher = objet "Teacher" associé à la classe
	 *
	 */
	public Classe(String newClassName, Teacher newTeacher)
	{
		className = newClassName;
		teqcher = newTeacher;
		childList = new ArrayList<Child>();		
	}
	
	public String getClassName()
	{
		return classname;
	}
	
	public Teacher getTeacher()
	{
		return teacher;
	}
	
	public ArrayList<Child> getChildList()
	{
		return childList;
	}
	
	public Teacher setTeacher(Teacher newTeacher)
	{
		teacher = newTeacher;
	}
	
	public void addChild(Child newChild)
	{
		childList.add(newChild);
	}
	
	public void removeChild(Child oldChild)
	{
		childList.remove(oldChild);
	}
	

}
