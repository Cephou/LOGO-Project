package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ClassSelection {

	private JPanel classSelection;
	
	public ClassSelection() {
		classSelection = new JPanel();
		classSelection.setLayout(new GridLayout(0,3));
		// Boucle qui parcoure la liste des classes et crée les panel des classes et les ajoute
		for(int i=0; i<6; i++) {
			JPanel ClassItem = new JPanel();
			JLabel lblClass = new JLabel("CLASSE");
			ClassItem.add(lblClass);
			classSelection.add(ClassItem);
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
