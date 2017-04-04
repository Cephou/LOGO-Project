package Model;
import Model.Tortue.*;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import Exception.AlreadyInListException;
import Exception.EmptyStringException;
import Exception.tooLongStringException;

/**
 * @author Groupe 7 Cette classe décrit l'objet exercice. Un exercice est
 *         forcément créé par un professeur.
 */

public class Exercise {
	private String title;
	private String instruction;
	private TortueG turtle;
	private ImageIcon icon; // L'icône est une miniature du dessin final.
	private Teacher teacher;

	/**
	 * Constructeur pour la classe Exercice.
	 * 
	 * @param title
	 *            est le titre de l'exercice (taille du string inf à 50
	 *            charactères)
	 * @param instruction
	 *            est la consigne de l'exercice (taille du string inf à 3000
	 *            charactères)
	 * @param icon
	 *            est la miniature l'exercice.
	 * @param teacher
	 *            est le professeur auteur de l'exercice. Un exercice est
	 *            toujours associé à l'exercice qu'il a écrit.
	 * @throws EmptyStringException
	 * @throws tooLongStringException
	 */
	public Exercise(String title, String instruction, ImageIcon icon,
			Teacher teacher, TortueG turtle)
			throws EmptyStringException, tooLongStringException {
		this.setTitle(title);
		this.setInstruction(instruction);
		this.turtle = turtle;
		this.icon = icon;
		this.teacher = teacher;
		
		ArrayList<SchoolClass> classes = teacher.getClasses();
		for (SchoolClass classe : classes){
			try {
				classe.addExercice(this);
			} catch (AlreadyInListException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Permet la saisie d'un titre pour un exercice
	 * 
	 * @param title
	 * @throws EmptyStringException
	 */
	private void setTitle(String title) throws EmptyStringException {
		if (title.isEmpty()) {
			throw new EmptyStringException();
		} else
			this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the instruction
	 */
	public String getInstruction() {
		return instruction;
	}

	/**
	 * @param instruction
	 *            the instruction to set
	 * @throws EmptyStringException
	 * @throws tooLongStringException
	 */
	public void setInstruction(String instruction)
			throws EmptyStringException, tooLongStringException {
		if (instruction.isEmpty()) {
			throw new EmptyStringException();
		} else if (instruction.length() > 500) {
			throw new tooLongStringException();
		}
	}

	/**
	 * @return the turtle
	 */
	public TortueG getTurtle() {
		return turtle;
	}

}
