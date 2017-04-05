/**
 * 
 */
package View.Modules;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Controler.ExerciseVisualizationSelection;
import Exception.AlreadyInListException;
import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Exception.WrongGradeException;
import Exception.WrongTeacherException;
import Exception.tooLongStringException;
import Main.Main;
import Model.Assay;
import Model.Child;
import Model.Exercise;
import Model.Grade;
import Model.SchoolClass;
import Model.Teacher;

import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

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
	public ExerciseListView(Child child, Main main) {

		this.child = child;
		this.classe = this.child.getSchoolClass();
		listExercises = classe.getExerciseList();
		ArrayList<Assay> assays = child.getAssays();
		setLayout(new BorderLayout(0, 0));

		scrollPane = new JScrollPane();
		add(scrollPane);

		JPanel panelView = new JPanel();
		scrollPane.setViewportView(panelView);
		panelView.setLayout(new GridLayout(20, 3, 0, 0));

		// remplissage : 1 bouton par exercice
		if (listExercises.isEmpty()) {
			JLabel label = new JLabel("Pas d'exercice disponible.");
			panelView.add(label);
		} else {// Il y a des exos, on se charge de les afficher

			// creation des boutons, et ajout de leur nom
			for (Exercise exercise : listExercises) {
				System.out.println(exercise.getTitle());
				JButton btnNewButton = new JButton(exercise.getTitle());
				btnNewButton.addMouseListener(new ExerciseVisualizationSelection(exercise, main));

				// coloration en fonction de la tentative eleve
				for (Assay assay : assays) {

					// on compare si la tentative correspond ben a cet exercice
					if (assay.getExercise().equals(exercise)) {

						// on change la couleur du bouton en focntion du grade
						System.out.println(assay.getGrade());
						switch (assay.getGrade()) {

						case Acquired:
							System.out.println();
							btnNewButton.setBackground(Color.GREEN);
							btnNewButton.setForeground(Color.WHITE);
							break;
						case InAcquisition:
							btnNewButton.setBackground(Color.YELLOW);
							btnNewButton.setForeground(Color.WHITE);

							break;
						case NotAcquired:
							btnNewButton.setBackground(Color.RED);
							btnNewButton.setForeground(Color.WHITE);
							break;
						case NotGraded:
							btnNewButton.setBackground(Color.CYAN);

							break;
						default:
							break;
						}
					} else {
						System.out.println("pas le meme exo");
					}
					;
				}

				panelView.add(btnNewButton);
			}
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
	 * @throws AlreadyInListException
	 */
	public static void main(String[] args) throws EmptyStringException, NegativeIntegerException, StringSizeException,
			tooLongStringException, AlreadyInListException {

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
		Exercise exercise1 = new Exercise("Exercice1", "Tracer des traits", null, teacher1, null);
		Exercise exercise2 = new Exercise("Exercice2", "Tracer des traits", null, teacher1, null);

		//
		child1.createAssay(exercise1);

		Main main = null;
		ExerciseListView view = new ExerciseListView(child1, main);
		frame.add(view);
		frame.setVisible(true);
	}
}
