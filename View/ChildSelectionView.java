package View;

import javax.swing.JPanel;

import Model.SchoolClass;

/*
 * Cette classe gère l'aspect graphique de l'affichage de la liste d'élève lors de la sélection d'une classe
 * Elle affiche le nom de la classe choisie ainsi que son professeur
 * Elle nécessite qu'on lui donne une classe pour quelle puisse afficher son contenu dans des boutons cliquables
 * Les boutons permettent à un élève de s'authentifier de d'ouvrir une session.
 */

public class ChildSelectionView {

	public ChildSelectionView(SchoolClass pclass) {
		// Procédure de boucle qui pioche dans la classe choisie pour afficher les enfants.		
	}
	
	/*
	 * Crée un bouton qui permet à un enfant de s'authentifier
	 */
	public JPanel createChildItem() {
		return null;
	}
}
