/**
 * 
 */
package Model;

/**
 * Classe tentative
 * Cette classe permet de stocker pour chaque eleve et pour chaque exercice une tentativr
 * Une tentative  comprend une suite d'actions,un commentaire et une appr�ciation.
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
	 * @param  exercice l'exercice sur le quel la tentative est exerc�e
	 */
	public Assay(child, exercice){
		this.child = child;
		this.exercice = exercice;
		listAction = new ArrayList<Action>();
		
	}
	
	/*
	 * Ajouter une action r�alis�e par un �l�ve � une tentive
	 * @param a action r�alis�e par l'�l�ve
	 */
	public void addAction(Action a){
		listAction.add(a)
	}
	
	/**
	 * Evaluer une tentative
	 * Une evaluation de tentive est r�alis�e par un professeur
	 * Il laisse un petit texte, le commentaire et un note (un des 3 smileys disponible).
	 */
	public void evaluateAssay(String c,Grade g){
		this.comment = comment;
		this.grade = grade;
	}
	
}
