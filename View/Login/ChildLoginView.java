package View.Login;

import Model.SchoolClass;

import javax.swing.*;
import java.awt.*;

/**
 * Cette classe gère l'aspect graphique de l'affichage de la liste d'élève lors de la sélection d'une classe
 * Elle affiche le nom de la classe choisie ainsi que son professeur
 * Elle nécessite qu'on lui donne une classe pour quelle puisse afficher son contenu dans des boutons cliquables
 * Les boutons permettent à un élève de s'authentifier de d'ouvrir une session.
 */

public class ChildLoginView {

	public ChildLoginView(SchoolClass schoolClass) {
		// Procédure de boucle qui pioche dans la classe choisie pour afficher les enfants.
	}

	/**
	 * Créer un panel contenant des boutons permettant à chaque élève de s'identifier
	 */
	public JPanel setChildrenPanel(SchoolClass schoolClass) {

		JPanel childrenPanel = new JPanel();
		childrenPanel.setLayout(new GridLayout(2, 5)); // Classes de 10 élèves
		JButton itemButton[] = new JButton[schoolClass.getChildList().size()];

		for (int i = 0; i < schoolClass.getChildList().size(); i++) {

			Icon picture = new ImageIcon((getClass().getResource("/images/" + schoolClass.getChildList().get(i).getPicture())));
			itemButton[i] = new JButton(picture);
			itemButton[i].setEnabled(false);
			itemButton[i].setPreferredSize(new Dimension(100, 100));
			childrenPanel.add(itemButton[i]);

		}

		return childrenPanel;
	}
}
