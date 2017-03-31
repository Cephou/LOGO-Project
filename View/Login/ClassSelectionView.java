package View.Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*
 * Cette classe permet d'afficher la liste des classes dans un JPanel
 * Ces classes sont des boutons cliquables qui permettent de sélectioner une classe.
 * Le choix d'une classe déclenche la procédure de création ChildSelection qui prend en paramètre la classe choisie.
 */

public class ClassSelectionView {

	private JPanel classSelection;
	
	public ClassSelectionView() {
		classSelection = new JPanel();
		classSelection.setLayout(new GridLayout(0,3));
		// Boucle qui parcoure la liste des classes et crée les panel des classes et les ajoute
		for(int i=0; i<6; i++) { // A IMPLEMENTER (exemple ici avec 6 classes)
			JButton btnClassItem = new JButton();
			JLabel lblClass = new JLabel("CLASSE");
			btnClassItem.add(lblClass);
			classSelection.add(btnClassItem);
		}
	}
	
	public JPanel getClassSelection() {
		return classSelection;
	}
	
	public void createClassItem() {
		JPanel ClassItem = new JPanel();
		classSelection.add(ClassItem);
	}
	
}
