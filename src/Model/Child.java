package src.Model;

import src.Exception.*;

import java.util.ArrayList;

/**
 * @author Groupe 7 Cette classe d�crit l'objet enfant, un �l�ve qui r�alise des
 *         tentatives. Un enfant fait partie d'une classe et peut realiser
 *         plusieur actions: faire une tentative pour un exercice donn�.
 */

public class Child extends User {

	private ArrayList<Assay> assays; // Liste des tentatives de l'enfant
	private SchoolClass schoolClass; // La classe de l'�l�ve.

	/*
	 * Cr�� un enfant. Controle l'age (entre 3 et 12 ans).
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
                 String pPicture) throws EmptyStringException, NegativeIntegerException, StringSizeException {
        super(pFirstName, pLastName, pAge, pPicture);
        assays = new ArrayList<Assay>();
    }

	/**
	 * Cr�e une tentative vide pour un exercice donn�,
	 * Ajoute la tentative dans la liste des tentative
	 * de l'enfant
     *
     * l'exercice
     *            sur lequel faire la tentative, il doit exister
     */

	public void createAssay(Exercise pexercise) {
		Assay newAssay = new Assay(this, pexercise);
		assays.add(newAssay);
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
