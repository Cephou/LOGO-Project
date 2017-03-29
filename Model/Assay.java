/**
 * 
 */
package Model;

import java.util.ArrayList;

import Model.Tortue.TortueG;

/**
 * Classe tentative
 * Cette classe permet de stocker pour chaque eleve et pour chaque exercice une tentative
 * Une tentative  comprend une suite d'actions,un commentaire et une appréciation.
 * Une evaluation de tentive est réalisée par un professeur
 * Il laisse un petit texte (le commentaire) et une note (un des 3 smileys disponible).
 * Cette action ne peut etre effectuée qu'une et une seule fois par tentative.
 * La tentative d'un eleve ne peut être évaluée que par son professeur.
 *
 */
public class Assay {	
	private ArrayList<Action> listAction; //liste des actions à réalisées par l'eleves
	private Child child;				//enfant qui effectue la tentative
	private Exercise exercise;			//exercice associé à cette tentaive
	private String comment;				//commentaire laisser par le professeur
	private Grade grade;				//apprécialtion laissée par le prpofesseur
 
	/**
	 * Constructeur de la classe Tentative
	 * Lors de la création d'une tentative, cette derniere prend le statut "non noté".
	 * @param child l'enfant qui effectue la tentative
	 * @param  exercice l'exercice sur le quel la tentative est exercée
	 */
	public Assay(Child child,Exercise exercise){
		this.child = child;
		this.exercise = exercise;
		listAction = new ArrayList<Action>();
		this.grade = Grade.NotGraded;
		
	}
	
	/*
	 * Ajouter une action réalisée par un élève à une tentative
	 * Le nombre d'actions n'est pas borné.
	 * @param a action réalisée par l'élève/le professeur
	 */
	public void addAction(Action a){
		listAction.add(a);
	}
	
	/**
	 * Evaluer une tentative
	 * Une evaluation de tentive est réalisée par un professeur
	 * Il laisse un petit texte (le commentaire) et une note (un des 3 smileys disponible).
	 * Cette action ne peut etre effectuée qu'une et une seule fois par tentative.
	 * La tentative d'un eleve ne peut être évaluée que par son professeur.
	 * 
	 * @param teacher le professeur qui réalise l'évaluation (on restreint l'avluation d'un eleve a un professeur)
	 * @param c le commentaire à laisser, il peut être  vide.
	 * @param g la note à laisser, la note a laisser ne pas etre "à évaluer"
	 */
	public void evaluateAssay(Teacher teacher, String comment,Grade grade){
		//Control teacher ? regarder si child.getTeacher() == this.teacher
		//control valeur grade
		if (teacher == child.getSchoolClass().getTeacher()){
			if(grade != Grade.NotGraded){
				this.comment=comment;
				this.grade = grade;
				
			}
		}
		this.comment = comment;
		this.grade = grade;
	}
	
	/**
	 * Methode permettant de rejouer la liste d'actions enregistrées
	 * On suppose que la position initiale de la tortue est toujours la même.
	 *TODO Pas plus de controle sur cette fonction ?
	 * 
	 * @param tortue la tortue (G, Rapide, Couleur) utilisée par l'eleves lors de sa tentative
	 */
	public void replay(TortueG tortueG){
		
		
	}

	/**
	 * @return the listAction
	 */
	public ArrayList<Action> getListAction() {
		return listAction;
	}

	/**
	 * @return the child
	 */
	public Child getChild() {
		return child;
	}

	/**
	 * @return the exercise
	 */
	public Exercise getExercise() {
		return exercise;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @return the grade
	 */
	public Grade getGrade() {
		return grade;
	}
	
}
