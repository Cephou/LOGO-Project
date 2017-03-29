/**
 * 
 */
package Model;

/**
 * @author grp7
 * Cette classe crée l'object classe définie par un nom, un professeur et une liste d'élève
 *
 */
public class schoolClass {
	 
	private String className;
	private Teacher teacher;
	private ArrayList<Child> childList;
	
	/**
	 * Constructeur
	 * @param newClassName = nom attribué à la classe
	 * @param newTeacher = objet "Teacher" associé à la classe	 *
	 */
	public schoolClass(String newClassName, Teacher newTeacher)
	{
		this.className = newClassName;
		this.teqcher = newTeacher;
		this.childList = new ArrayList<Child>();		
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
