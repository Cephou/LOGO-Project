package View.Login;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Controler.SchoolClassSelection;
import Model.SchoolClass;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/*
 * Cette classe permet d'afficher la liste des classes dans un JPanel
 * Ces classes sont des boutons cliquables qui permettent de sélectioner une classe.
 * Le choix d'une classe déclenche la procédure de création ChildSelection qui prend en paramètre la classe choisie.
 */

public class ClassLoginView {

	private JPanel classSelection;
	
	public ClassLoginView(ArrayList<SchoolClass> schoolClasses) {
		classSelection = new JPanel();
		classSelection.setLayout(new GridLayout(0,3)); // 3 colonnes max, le reste formera des lignes
		// Boucle qui parcoure la liste des classes et crée les panel des classes et les ajoute
		for(SchoolClass schoolClass : schoolClasses) {
			createClassItem(schoolClass);
		}
	}
	
	/**
	 * Crée un item classe et est ajouté à la liste des classes à afficher
	 * @param schoolClass la classe à ajouter
	 */
	public void createClassItem(SchoolClass schoolClass) {
		JPanel ClassItem = new JPanel();
		JButton ClassButton = new JButton(schoolClass.getClassName());
		ClassButton.addActionListener(new SchoolClassSelection());
		ClassItem.add(ClassButton);
		classSelection.add(ClassItem);
	}
	
	/**
	 * @return La liste de classes
	 */
	public JPanel getClassSelection() {
		return classSelection;
	}
	
}
