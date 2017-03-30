package View;

import javax.swing.JPanel;

import Model.SchoolClass;

/*
 * Cette classe g�re l'aspect graphique de l'affichage de la liste d'�l�ve lors de la s�lection d'une classe
 * Elle affiche le nom de la classe choisie ainsi que son professeur
 * Elle n�cessite qu'on lui donne une classe pour quelle puisse afficher son contenu dans des boutons cliquables
 * Les boutons permettent � un �l�ve de s'authentifier de d'ouvrir une session.
 */

public class ChildSelectionView {

	public ChildSelectionView(SchoolClass pclass) {
		// Proc�dure de boucle qui pioche dans la classe choisie pour afficher les enfants.		
	}
	
	/*
	 * Cr�e un bouton qui permet � un enfant de s'authentifier
	 */
	public JPanel createChildItem() {
		return null;
	}
}
