/**
 * 
 */
package Model;

/**
 * Classe tentative
 * Cette classe permet de stocker pour chaque eleve et pour chaque exercice une tentativr
 * Une tentative  comprend une suite d'actions,un commentaire et une appréciation.
 *
 */
public class Assay {
	
	private ArrayList<Action> listAction;
	private Child child;
	private Exercice exercice;
	private String comment;
	private Grade grade;

	/**
	 * Constructeur de la classe Tentative
	 * @param child l'enfait qui effectue la tentative
	 * @param  exercice l'exercice sur le quel la tentative est exercée
	 */
	public Assay(child, exercice){
		this.child = child;
		this.exercice = exercice;
		listAction = new ArrayList<Action>();
		
	}
	
	/*
	 * Ajouter une action réalisée par un élève à une tentive
	 * @param a action réalisée par l'élève
	 */
	public void addAction(Action a){
		listAction.add(a)
	}
	
	/**
	 * Evaluer une tentative
	 * Une evaluation de tentive est réalisée par un professeur
	 * Il laisse un petit texte, le commentaire et un note (un des 3 smileys disponible).
	 */
	public void evaluateAssay(String c,Grade g){
		this.comment = comment;
		this.grade = grade;
	}
	
}
