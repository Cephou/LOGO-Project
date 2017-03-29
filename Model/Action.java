package Model;

import Model.Tortue.TortueG;

public class Action {
	
	private TortueG turtleType;
	private String command; // La commande de l'action (avancer, tourner etc)
	
	public Action(String pcommand, TortueG pturtle) {
		setCommand(pcommand);
		setTurtleType(pturtle);
	}

	/*
	 * Dessine l'action sur le canvas tortue à l'aide de la commande et le type de tortue
	 */
	public void drawTurtle() {
		
	}
	
	/**
	 * @return the turtleType
	 */
	public TortueG getTurtleType() {
		return turtleType;
	}

	/**
	 * @param turtleType the turtleType to set
	 */
	public void setTurtleType(TortueG turtleType) {
		this.turtleType = turtleType;
	}

	/**
	 * @return the command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * @param command the command to set
	 */
	public void setCommand(String command) {
		this.command = command;
	}

}
