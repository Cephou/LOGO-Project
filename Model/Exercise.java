package Model;

import javax.swing.ImageIcon;

/**
 * @author Groupe 7
 * Cette classe d�crit l'objet exercice.
 * Un exercice est forc�ment cr�� par un professeur.
 */

public class Exercise {
	private String title;
	private String instruction;
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
	public Exercise(String title, String instruction, ImageIcon icon, Teacher teacher) {
		this.title = title;
		this.instruction = instruction;
		this.icon = icon;
		this.teacher = teacher;
	}

	/**
	 * @return the title
	 */
	public String gettitle() {
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
	
}
