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
	
	public void addAction(Action a){
		lsitAction.add(a)
	}
	
	public void evaluateAssay(comment, grade){
		this.comment = comment;
		this.grade = grade;
	}
	
}
