package Model;
import Model.Tortue.*;

import javax.swing.ImageIcon;


/**
 * @author Groupe 7
 * Cette classe décrit l'objet exercice.
 * Un exercice est forcément créé par un professeur.
 */

public class Exercise {
	private String title;
	private String instruction;
	private TortueG turtle;
	private ImageIcon icon; //L'icône est une miniature du dessin final.
	private Teacher teacher;

	/**
	 * Constructeur pour la classe Exercice.
	 * @param title est le titre de l'exercice (taille du string inf à 50 charactères)
	 * @param instruction est la consigne de l'exercice (taille du string inf à 3000 charactères)
	 * @param icon est la miniature l'exercice.
	 * @param teacher est le professeur auteur de l'exercice.
	 * Un exercice est toujours associé à l'exercice qu'il a écrit.
	 */
	public Exercise(String title, String instruction, ImageIcon icon, Teacher teacher, TortueG turtle) {
		this.title = title;
		this.instruction = instruction;
		this.turtle = turtle;
		this.icon = icon;
		this.teacher = teacher;
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
	 * @param instruction the instruction to set
	 */
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	/**
	 * @return the icon
	 */
	public ImageIcon getIcon() {
		return icon;
	}

	/**
	 * @param icon the icon to set
	 */
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
	/**
	 * @return teacher
	 */
	public Teacher getTeacher() {
		return teacher;
	}

	/**
	 * @return the turtle
	 */
	public TortueG getTurtle() {
		return turtle;
	}

	/**
	 * @param turtle the turtle to set
	 */
	public void setTurtle(TortueG turtle) {
		this.turtle = turtle;
	}
	
}
