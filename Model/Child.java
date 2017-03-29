package Model;

import java.util.ArrayList;

/**
 * @author Groupe 7
 * Cette classe d�crit l'objet enfant, un �l�ve qui r�alise des tentatives et compl�te des exercices
 */

public class Child extends User {
	
	private ArrayList<Assay> assays; // Liste des tentatives de l'enfant

	/**
	 * Ajoute une tentative dans l'enfant
	 */
	
	public void addAssay() {
		
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
