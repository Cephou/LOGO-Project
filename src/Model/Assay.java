package src.Model;

import src.Model.Tortue.TortueG;
import src.Exception.*;

import java.util.ArrayList;

/**
 * Classe tentative Cette classe permet de stocker pour chaque eleve et pour
 * chaque exercice une tentative Une tentative comprend une suite d'actions,un
 * commentaire et une appr�ciation. Une evaluation de tentive est r�alis�e
 * par un professeur Il laisse un petit texte (le commentaire) et une note (un
 * des 3 smileys disponible). Cette action ne peut etre effectu�e qu'une et
 * une seule fois par tentative. La tentative d'un eleve ne peut �tre
 * �valu�e que par son professeur. Cette classe propose aussi la fonction
 * replay(). Cette fonction permet de rejouer une tentative.
 *
 */
public class Assay {
	private ArrayList<Action> listAction; // liste des actions � r�alis�es
											// par
											// l'eleves
	private Child child; // enfant qui effectue la tentative
	private Exercise exercise; // exercice associ� � cette tentaive
	private String comment; // commentaire laisser par le professeur
	private Grade grade; // appr�cialtion laiss�e par le prpofesseur

	/**
	 * Constructeur de la classe Tentative Lors de la cr�ation d'une
	 * tentative, cette derniere prend le statut "non not�".
	 * 
	 * @param child
	 *            l'enfant qui effectue la tentative
	 * @param exercice
	 *            l'exercice sur le quel la tentative est exerc�e
	 */
	public Assay(Child child, Exercise exercise) {
		this.child = child;
		this.exercise = exercise;
		listAction = new ArrayList<Action>();
		this.grade = Grade.NotGraded;

	}

	/*
	 * Ajouter une action r�alis�e par un �l�ve � une tentative Le
	 * nombre d'actions n'est pas born�.
	 * 
	 * @param a action r�alis�e par l'�l�ve/le professeur
	 */
	public void addAction(Action a) {
		listAction.add(a);
	}

	/**
	 * Evaluer une tentative Une evaluation de tentive est r�alis�e par un
	 * professeur Il laisse un petit texte (le commentaire) et une note (un des
	 * 3 smileys disponible). Cette action ne peut etre effectu�e qu'une et
	 * une seule fois par tentative. La tentative d'un eleve ne peut �tre
	 * �valu�e que par son professeur.
	 * 
	 * @param teacher
	 *            le professeur qui r�alise l'�valuation (on restreint
	 *            l'avluation d'un eleve a un professeur)
	 * @param c
	 *            le commentaire � laisser, il peut �tre vide.
	 * @param g
	 *            la note � laisser, la note a laisser ne pas etre "�
	 *            �valuer"
	 * @throws WrongGradeException
	 * @throws WrongTeacherException
	 */
	public void evaluateAssay(Teacher teacher, String comment, Grade grade)
			throws WrongGradeException, WrongTeacherException {

		if (teacher == child.getSchoolClass().getTeacher()) {
			if (grade != Grade.NotGraded) {
				this.comment = comment;
				this.grade = grade;
			} else {
				throw new WrongGradeException();
			}

		} else {
			throw new WrongTeacherException();
		}
		// TODO Else
	}

	/**
	 * Methode permettant de rejouer la liste d'actions enregistr�es On
	 * suppose que la position initiale de la tortue est toujours la m�me.
	 * TODO Pas plus de controle sur cette fonction ?
	 * 
	 * @param tortue
	 *            la tortue (G, Rapide, Couleur) utilis�e par l'eleves lors de
	 *            sa tentative
	 */
	public void replay(TortueG tortueG) {
		for (Action a : listAction) {
			a.drawTurtle();
		}
	}

}
