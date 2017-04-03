package Model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * @author Groupe 7 Cette classe décrit l'objet enfant, un élève qui réalise des
 *         tentatives. Un enfant fait partie d'une classe et peut realiser
 *         plusieur actions: faire une tentative pour un exercice donné.
 */

public class Child extends User {

	private ArrayList<Assay> assays; // Liste des tentatives de l'enfant
	private SchoolClass schoolClass; // La classe de l'élève.

	/*
	 * Créé un enfant. Controle l'age (entre 3 et 12 ans).
	 * 
	 * @param pFirstName prenom
	 * 
	 * @param pLstName nom
	 * 
	 * @param pAge age
	 * 
	 * @param pPicture photo
	 * 
	 */
	public Child(String pFirstName, String pLastName, int pAge,
			ImageIcon pPicture) {
		super(pFirstName, pLastName, pAge, pPicture);
		assays = new ArrayList<Assay>();
	}

	/**
	 * Crée une tentative vide Ajoute la tentative dans la liste des tentative
	 * de l'enfant
	 * 
	 * @param l'exercice
	 *            sur lequel faire la tentative
	 * @return la tentative crée (permet la manipulation future de la tentative
	 *         crée)
	 */

	public Assay createAssay(Exercise pexercise) {
		Assay newAssay = new Assay(this, pexercise);
		assays.add(newAssay);
		return newAssay;
	}

	/**
	 * @return the assays
	 */
	public ArrayList<Assay> getAssays() {
		return assays;
	}

	/**
	 * @return the schoolClass
	 */
	public SchoolClass getSchoolClass() {
		return schoolClass;
	}

	/**
	 * @param schoolClass
	 *            the schoolClass to set
	 */
	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}

}
