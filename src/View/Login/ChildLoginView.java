package View.Login;

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
	private GeneralLayout layout;

	/**
	 * Constructeur de la classe ChildLoginView
	 *
	 * @param schoolClass
	 */
	public ChildLoginView(SchoolClass schoolClass, GeneralLayout layout) {
		// Procédure de boucle qui pioche dans la classe choisie pour afficher les enfants.
        setChildrenPanel(schoolClass);
        this.layout = layout;
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
	
//		Icon picture = new ImageIcon((getClass().getResource("/images/" + schoolClass.getChildList().get(i).getPicture())));
//		itemButton[i] = new JButton(picture);
//	    itemButton[i].setEnabled(true);
//	    itemButton[i].setPreferredSize(new Dimension(100, 100));
		JButton childBtn = new JButton(child.getFirstName());
		childBtn.addMouseListener(new ChildLoginSelection(child, this.layout));
		childLogin.add(childBtn);

	}
	
	public JPanel getChildLogin() {
		return childLogin;
	}
}
