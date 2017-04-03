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
	
	private JPanel childLogin;

	/**
	 * Constructeur de la classe ChildLoginView
	 *
	 * @param schoolClass
	 */
	public ChildLoginView(SchoolClass schoolClass) {
		// Procédure de boucle qui pioche dans la classe choisie pour afficher les enfants.
        setChildrenPanel(schoolClass);
	}

	/**
	 * Créer un panel contenant des boutons permettant à chaque élève de s'identifier
	 */
	public void setChildrenPanel(SchoolClass schoolClass) {

		childLogin = new JPanel();
		childLogin.setLayout(new GridLayout(2, 5)); // Classes de 10 élèves
        JButton itemButton[] = new JButton[schoolClass.getChildList().size()]; // Autant de JButton que d'élèves

		for (int i = 0; i < schoolClass.getChildList().size(); i++) {

			Icon picture = new ImageIcon((getClass().getResource("/images/" + schoolClass.getChildList().get(i).getPicture())));
			itemButton[i] = new JButton(picture);
            itemButton[i].setEnabled(true);
            itemButton[i].setPreferredSize(new Dimension(100, 100));
			childLogin.add(itemButton[i]);

		}
	}
	
	public JPanel getChildLogin() {
		return childLogin;
	}
}
