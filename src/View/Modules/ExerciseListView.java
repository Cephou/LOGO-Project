/**
 * 
 */
package View.Modules;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Exception.tooLongStringException;
import Model.Child;
import Model.Exercise;
import Model.SchoolClass;
import Model.Teacher;

import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

/**
 * @author pc
 *
 */
public class ExerciseListView extends JPanel {

	private SchoolClass classe;
	private Child child;
	private ArrayList<Exercise> listExercises;
	private JScrollPane scrollPane;


	/**
	 * 
	 */
	public ExerciseListView(Child child) {
	
		
		this.child = child;
		this.classe = this.child.getSchoolClass();
		listExercises = classe.getExerciseList();
		 setLayout(new BorderLayout(0, 0));
		
		 scrollPane = new JScrollPane();
		add(scrollPane);
	
		JPanel panelView = new JPanel();
		scrollPane.setViewportView(panelView);
		panelView.setLayout(new GridLayout(20, 3, 0, 0));
		
		
		

		for (Exercise exercise : listExercises) {
			System.out.println(exercise.getTitle());
			JButton btnNewButton = new JButton(exercise.getTitle());
			panelView.add(btnNewButton);
			
			
		}
		


	}

	public JScrollPane getExerciseListView() {
		return scrollPane;
	}

	/**
	 * @param args
	 * @throws StringSizeException
	 * @throws NegativeIntegerException
	 * @throws EmptyStringException
	 * @throws tooLongStringException
	 */
	public static void main(String[] args)
			throws EmptyStringException, NegativeIntegerException,
			StringSizeException, tooLongStringException {
		Frame frame = new JFrame();
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		Child child2 = new Child("Laurent", "L'abricot", 13, null);
		Child child3 = new Child("Severin", "Chargeur", 11, null);
		// Create classes
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
		SchoolClass classe2 = new SchoolClass("CE2", teacher1);
		// add eleve to classes
		classe1.addChild(child1);
		classe1.addChild(child2);
		classe2.addChild(child3);
		
		// crea exo
		Exercise exercise1 = new Exercise("Exercice1", "Tracer des traits",
				null, teacher1, null);
		Exercise exercise2 = new Exercise("Exercice2", "Tracer des traits",
				null, teacher1, null);
		
		
		ExerciseListView view = new ExerciseListView(child1);
		frame.add(view);
		frame.setVisible(true);
	}
}
