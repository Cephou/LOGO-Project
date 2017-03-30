package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class ClassSelection {

	private JPanel classSelection;
	
	public ClassSelection() {
		classSelection = new JPanel();
		classSelection.setLayout(new GridLayout(1, 0, 0, 0));
		// Boucle qui parcoure la liste des classes et crée les panel des classes et les ajoute
		//for(int i=0; i<3; i++) {
			JPanel ClassItem = new JPanel();
			JLabel lblClass = new JLabel("CLASSE");
			ClassItem.add(lblClass);
			classSelection.add(ClassItem);
			
			JPanel ClassItem2 = new JPanel();
			JLabel lblClass2 = new JLabel("CLASSE");
			ClassItem2.add(lblClass2);
			classSelection.add(ClassItem2);
		//}
	}
	
	public JPanel getClassSelection() {
		return classSelection;
	}
	
	public void createClassItem() {
		JPanel ClassItem = new JPanel();
		classSelection.add(ClassItem);
	}
	
}
