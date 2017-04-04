/**
 * 
 */
package View.Modules;

import javax.swing.JPanel;
import javax.swing.JScrollPane;



import Model.Child;
import Model.Exercise;
import Model.SchoolClass;
import Main.Main;

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
	private Main main;

	/**
	 * Create the panel.
	 */
	/**
	 * @param child
	 */
	public ExerciseListView(Main main, Child child) {
		//surround with a scroll pan
		JScrollPane scrollPane = new JScrollPane();
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
	
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		
	}	

}
