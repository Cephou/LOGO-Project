package src.Model;

public enum Grade {

	  /**
	   * Classe grade
	   */

	  NotGraded("Non not�s"),
	  InAcquisition("En cours d'acquisition"),
	  Acquired("Acquis"),
	  NotAcquired("Non acquis");
	
	  private String name = "";

	  //Constructeur

	  Grade(String name){
	    this.name = name;
	  }
	  
	  public String toString(){
	    return name;
	  }

}