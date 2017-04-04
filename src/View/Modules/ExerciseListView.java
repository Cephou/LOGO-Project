/**
 * 
 */
package View.Modules;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.Child;
import Model.Exercise;
import Model.SchoolClass;
import Model.Teacher;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author pc
 *
 */
public class ExerciseListView extends JPanel {

	private SchoolClass classe;
	private ArrayList<Exercise> listExercises;
	private JScrollPane scrollPane;


	/**
	 * Create the panel.
	 */
	/**
	 * @param child
	 */
	public ExerciseListView(Child child) {
		//surround with a scroll pan
		scrollPane = new JScrollPane();
		add(scrollPane);
		//creation of our panel
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(50, 3, 0, 0));
		
		//getting the list of exercise and the status of each exercise for the student
		classe = child.getSchoolClass();
		listExercises = classe.getExerciseList();
	
		
		
		Map<String, String> details = new HashMap<>();
		for (int i = 1; i <101; i++) {
		    if (i<60) {
		        details.put("person" + i, "female");
		    }
		    else {
		        details.put("person" + i, "male");
		    }
		}
		
	
		
//		for (Exercise exercise : listExercises){
//			JButton btn+exercise.getTitle() = new JButton("New button");
//			panel.add(btnExercise);
//		}
		
	
		
	
		

		
		JButton btnExercise = new JButton("New button");
		panel.add(btnExercise);
		

	}
	
	
	public JScrollPane getExerciseListView(){
		return scrollPane;
	}
	
	public static void main(String [] args) throws EmptyStringException, NegativeIntegerException, StringSizeException
	{
		JFrame frame = new JFrame();
		//crea data
		
		Teacher teacher1 = 
		new Teacher("Patrick", "Girard", 25, null, "azerty");;
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		Child child2 = new Child("Laurent", "L'abricot", 13, null);
		Child child3 = new Child("Severin", "Chargeur", 11, null);
		//Create classes
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
		SchoolClass classe2 = new SchoolClass("CE2", teacher1);
		//add eleve to classes
		classe1.addChild(child1);
		classe1.addChild(child2);
		classe2.addChild(child3);;
		ExerciseListView view = new ExerciseListView(child1);
		frame.add(view);
		frame.setVisible(true);
		
	}	

}
