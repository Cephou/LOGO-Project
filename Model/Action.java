package Model;

import Model.Tortue.TortueG;

/*
 * Cette classe créée des objets actions, contenant la tortue et l'action à réaliser.
 * Elle a pour but de dessiner la tortue sur un canvas.
 */

public class Action {
	
	private TortueG turtle;
	private String command; // La commande de l'action (avancer, tourner etc)
	
	public Action(String pcommand, TortueG pturtle) {
		command = pcommand;
		turtle = pturtle;
	}

	/*
	 * Dessine l'action sur le canvas tortue à l'aide de la commande et le type de tortue
	 */
	public void drawTurtle() {
		
	}
	
	/**
	 * @return the turtleType
	 */
	public TortueG getTurtle() {
		return turtle;
	}

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

}
