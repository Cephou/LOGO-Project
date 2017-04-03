package src.Model;

public enum PossibleAction {

	  /**
	   * Classe PossibleAction (les actions possibles de la tortue)
	   */

	  MoveForward("Avancer"),
	  Turn("Tourner"),
	  Draw("Trace"),
	  UnDraw("Trace pas"),
	  ChangeColor("Change la couleur"),
	  Faster("Accélerer"),
	  Slower("Ralentir"),
	  ChangeSpeed("Changer la vitesse");
	  
	  private String name = "";

	  //Constructeur

	  PossibleAction(String name){
	    this.name = name;
	  }
	  
	  public String toString(){
	    return name;
	  }

}