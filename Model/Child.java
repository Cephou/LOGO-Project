package Model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * @author Groupe 7
 * Cette classe décrit l'objet enfant, un élève qui réalise des tentatives et complète des exercices
 */

public class Child extends User {

	private ArrayList<Assay> assays; // Liste des tentatives de l'enfant
	
	public Child(String pFirstName, String pLastName, int pAge, ImageIcon pPicture) {
		super(pFirstName, pLastName, pAge, pPicture);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Ajoute une tentative dans l'enfant
	 */
	
	public void addAssay() {
		createAssay();
	}
	
	/**
	 * @params
	 * @params
	 * @params
	 * @params
	 * Ajoute une tentative dans l'enfant
	 */
	
	private void createAssay() {
		
	}
	
	/**
	 * @return the assays
	 */
	public ArrayList<Assay> getAssays() {
		return assays;
	}

	/**
	 * @param assays the assays to set
	 */
	public void setAssays(ArrayList<Assay> assays) {
		this.assays = assays;
	}

}
