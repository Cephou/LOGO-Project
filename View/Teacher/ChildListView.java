/**
 * 
 */
package View.Teacher;

import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JList;
import javax.swing.JPanel;

import Model.SchoolClass;
import View.GeneralLayout;

/**
 * Vue permettant l'affichage et la selection des enfants d'une classe. La
 * classe est affich�e dans une JList La selection d'un enfant permet au
 * professeur de voir les exercices qu'il a r�alis� dans le panel
 * ExerciseListView
 */
public class ChildListView {

	private JList<String> liste;

	/**
	 * Constructeur de JList d'eleve. Prend unne classe en parametre et genere
	 * une liste Un seul enfant est clickale a la fois un enfant cliqu" est
	 * surgn� en bleu
	 */
	public ChildListView(SchoolClass schoolClass) {
		// Proc�dure de boucle qui pioche dans la classe choisie pour afficher
		// les enfants.
		liste = new JList<String>(schoolClass.getChildList().toArray().toString());
		
		
	}

	public JList<String> getChildListView() {
		return liste;

	}
}