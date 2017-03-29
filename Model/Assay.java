/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * Classe tentative
 * Cette classe permet de stocker pour chaque eleve et pour chaque exercice une tentativr
 * Une tentative  comprend une suite d'actions,un commentaire et une appr�ciation.
 *
 */
public class Assay {	
	private ArrayList<Action> listAction; //liste des actions � r�alis�es par l'eleves
	private Child child;				//enfant qui effectue la tentative
	private Exercice exercice;			//exercice associ� � cette tentaive
	private String comment;				//commentaire laisser par le professeur
	private Grade grade;				//appr�cialtion laiss�e par le prpofesseur
 
	/**
	 * Constructeur de la classe Tentative
	 * Lors de la cr�ation d'une tentative, cette derniere prend le statut "non not�"
	 * @param child l'enfant qui effectue la tentative
	 * @param  exercice l'exercice sur le quel la tentative est exerc�e
	 */
	public Assay(Child child,Exercice exercice){
		this.child = child;
		this.exercice = exercice;
		listAction = new ArrayList<Action>();
		this.grade = Grade.NotGraded;
		
	}
	
	/*
	 * Ajouter une action r�alis�e par un �l�ve � une tentive
	 * @param a action r�alis�e par l'�l�ve
	 */
	public void addAction(Action a){
		listAction.add(a);
	}
	
	/**
	 * Evaluer une tentative
	 * Une evaluation de tentive est r�alis�e par un professeur
	 * Il laisse un petit texte, le commentaire et un note (un des 3 smileys disponible).
	 * @param teacher le professeur qui r�lise l'�valuation (on restreint l'avluation d'un eleve a un professeur)
	 * @param c le commentaire � laisser
	 * @param g la note � laisser
	 */
	public void evaluateAssay(Teacher teacher, String comment,Grade grade){
		//Control teacher ? regarder si child.getTeacher() == this.teacher
		this.comment = comment;
		this.grade = grade;
	}
	
}
