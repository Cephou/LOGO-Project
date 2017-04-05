/**
 * 
 */
package Model;

import Model.Tortue.TortueG;


import java.util.ArrayList;

import Exception.WrongGradeException;
import Exception.WrongTeacherException;
import Exception.tooLongStringException;

/**
 * Classe tentative Cette classe permet de stocker pour chaque eleve et pour
 * chaque exercice une tentative Une tentative comprend une suite d'actions,un
 * commentaire et une apprï¿½ciation. Une evaluation de tentive est rï¿½alisï¿½e
 * par un professeur Il laisse un petit texte (le commentaire) et une note (un
 * des 3 smileys disponible). Cette action ne peut etre effectuï¿½e qu'une et
 * une seule fois par tentative. La tentative d'un eleve ne peut ï¿½tre
 * ï¿½valuï¿½e que par son professeur. Cette classe propose aussi la fonction
 * replay(). Cette fonction permet de rejouer une tentative.
 *
 */
public  class Assay {
	private ArrayList<Action> listAction; // liste des actions ï¿½ rï¿½alisï¿½es
											// par
											// l'eleves
	private Child child; // enfant qui effectue la tentative
	private Exercise exercise; // exercice associï¿½ ï¿½ cette tentaive
	private String comment; // commentaire laisser par le professeur
	private Grade grade; // apprï¿½cialtion laissï¿½e par le prpofesseur

	/**
	 * Constructeur de la classe Tentative Lors de la crï¿½ation d'une
	 * tentative, cette derniere prend le statut "non notï¿½".
	 * 
	 * @param child
	 *            l'enfant qui effectue la tentative
	 * @param exercice
	 *            l'exercice sur le quel la tentative est exercï¿½e
	 */
	public Assay(Child child, Exercise exercise) {
		this.child = child;
		this.exercise = exercise;
		listAction = new ArrayList<Action>();
		this.grade = Grade.NotGraded;
		this.comment="";

	}

	/*
	 * Ajouter une action rï¿½alisï¿½e par un ï¿½lï¿½ve ï¿½ une tentative Le
	 * nombre d'actions n'est pas bornï¿½.
	 * 
	 * @param a action rï¿½alisï¿½e par l'ï¿½lï¿½ve/le professeur
	 */
	public void addAction(Action a) {
		listAction.add(a);
	}

	

	/**
	 * Methode permettant de rejouer la liste d'actions enregistrï¿½es On
	 * suppose que la position initiale de la tortue est toujours la mï¿½me.
	 * TODO Pas plus de controle sur cette fonction ?
	 * 
	 * @param tortue
	 *            la tortue (G, Rapide, Couleur) utilisï¿½e par l'eleves lors de
	 *            sa tentative
	 */
	public void replay(TortueG tortueG) {
		for (Action a : listAction) {
			a.drawTurtle();
		}
	}

	public Exercise getExercise() {
		return exercise;
		
	}

	public Child getChild() {
		return child;
		
	}

	public Grade getGrade() {
		return grade;
	}

	/*
	 * ecriture d'un comentaire
	 * Un commentaire est un string e taille maximal 400
	 * Un commentaire peut etre vide
	 * 
	 * @param comment le commentaire à écrire
	 */
	public void setComment(String comment) throws tooLongStringException {
		if (comment.length()>400){
			throw new tooLongStringException();
		}
		else{
			this.comment=comment;
		}
		
	}

	/*
	 * Methode pour noter un eleve.
	 * Les seules notes disponibles sont dy type Grade
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
		
	}

}
