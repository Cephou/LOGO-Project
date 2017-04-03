package Model;
import Model.Tortue.*;

import javax.swing.ImageIcon;

import Exception.EmptyStringException;


/**
 * @author Groupe 7
 * Cette classe d�crit l'objet exercice.
 * Un exercice est forc�ment cr�� par un professeur.
 */

public class Exercise {
	private String title;
	private String instruction;
	private TortueG turtle;
	private ImageIcon icon; //L'ic�ne est une miniature du dessin final.
	private Teacher teacher;

	/**
	 * Constructeur pour la classe Exercice.
	 * @param title est le titre de l'exercice (taille du string inf � 50 charact�res)
	 * @param instruction est la consigne de l'exercice (taille du string inf � 3000 charact�res)
	 * @param icon est la miniature l'exercice.
	 * @param teacher est le professeur auteur de l'exercice.
	 * Un exercice est toujours associ� � l'exercice qu'il a �crit.
	 */
	public Exercise(String title, String instruction, ImageIcon icon, Teacher teacher, TortueG turtle) {
		this.setTitle(title);
		this.setInstruction(instruction);
		this.setTurtle(turtle);
		this.setIcon(icon);
		this.setTeacher(teacher);
	}

	/**
	 * Permet la saisie d'un titre pour un exercice
	 * @param title2
	 * @throws EmptyStringException 
	 */
	private void setTitle(String title) throws EmptyStringException {
		if (title.isEmpty()){
			throw new EmptyStringException();
		}
		else this.title = title;
		
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
		if (instruction.isEmpty()){
			throw new EmptyStringException();
		}
		else if(instruction.length()>500){
			throw new tooLongStringException();
		}
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
