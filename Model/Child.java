package Model;

import java.util.ArrayList;

/**
 * @author Groupe 7
 * Cette classe décrit l'objet enfant, un élève qui réalise des tentatives et complète des exercices
 */

public class Child extends User {
	
	private String firstname;
	private String lastname;
	private int age;
	private String icon; // L'icone de l'enfant
	private ArrayList<Assay> assays; // Liste des tentatives de l'enfant
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the icon
	 */
	public String getIcon() {
		return icon;
	}
	
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	

}
