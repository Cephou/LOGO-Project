package src.Model;

import src.Model.Tortue.*;

/*
 * Cette classe créée des objets actions, contenant la tortue et l'action à réaliser.
 * Elle a pour but de dessiner la tortue sur un canvas.
 */

public class Action {
	
	private TortueG turtle;
	private PossibleAction command; // La commande de l'action (avancer, tourner etc)
	private String color; // La couleur en cas d'action sur le changement de couleur
	private int speed; // La vitesse en cas d'action sur le changement de vitesse
	
	// SURCHARGE DE CONSTRUCTEURS POUR GERER LES PARAMETRES OPTIONNELS
	
	public Action(PossibleAction pcommand, TortueG pturtle) {
		command = pcommand;
		turtle = pturtle;
	}

	public Action(PossibleAction pcommand, TortueG pturtle, String pcolor) {
		command = pcommand;
		turtle = pturtle;
		color = pcolor;
	}
	
	public Action(PossibleAction pcommand, TortueG pturtle, int pspeed) {
		command = pcommand;
		turtle = pturtle;
		speed = pspeed;
	}
	
	/*
	 * Dessine l'action sur le canvas tortue à l'aide de la commande et le type de tortue
	 * Appelle la bonne méthode des classe tortue pour dessiner la tortue.
	 * Ne se soucis pas de la position de la tortue (à voir dans la classe assay).
	 */
	
	public void drawTurtle() {
		switch (command) {
		  case MoveForward:
		    turtle.avancer();
		    break;
		  case Turn:
			turtle.tourner();
		  case Draw:
			turtle.tracer(true);
		  case UnDraw:
			turtle.tracer(false);
		  case ChangeColor:
			if(this.turtle instanceof TortueCouleur) {
				((TortueCouleur) turtle).setCouleur(this.color);
			}
		  case Faster:
			if(this.turtle instanceof TortueRapide) {
				((TortueRapide) turtle).accelerer();
			}
		  case Slower:
			if(this.turtle instanceof TortueRapide) {
				((TortueRapide) turtle).ralentir();
			}
		  case ChangeSpeed:
			if(this.turtle instanceof TortueRapide) {
				((TortueRapide) turtle).setVitesse(this.speed);
			}
		  default:
			// Nothing
		}
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
	public PossibleAction getCommand() {
		return command;
	}

}
