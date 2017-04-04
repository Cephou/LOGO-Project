package View.Login;

import Controler.ChildLoginSelection;
import Main.Main;
import Model.Child;
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
	private Main main;

	/**
	 * Constructeur de la classe ChildLoginView
	 *
	 * @param schoolClass
	 */
	public ChildLoginView(SchoolClass schoolClass, Main main) {
		// Procédure de boucle qui pioche dans la classe choisie pour afficher les enfants.
        setChildrenPanel(schoolClass);
        this.main = main;
	}

	/**
	 * Créer un panel contenant des boutons permettant à chaque élève de s'identifier
	 */
	public void setChildrenPanel(SchoolClass schoolClass) {

		childLogin = new JPanel();
		childLogin.setLayout(new GridLayout(2, 5)); // Classes de 10 élèves

		for(Child child : schoolClass.getChildList()) {
			createChildItem(child);
		}

	}
	
	public void createChildItem(Child child) {

        //Icon picture = new ImageIcon((getClass().getResource("/image/child" + child.getPicture())));
        JButton childBtn = new JButton(child.getFirstName());
        childBtn.addMouseListener(new ChildLoginSelection(child, main));
		childLogin.add(childBtn);

	}
	
	public JPanel getChildLogin() {
		return childLogin;
	}
}