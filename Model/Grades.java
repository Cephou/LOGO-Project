package Model;

public enum Grades {

	  // Objets directement construits

	  NotGraded("Non notés"),
	  InAcquisition("En cours d'acquisition"),
	  Acquired("Acquis"),
	  NotAcquired("Non acquis");
	
	  private String name = "";

	  //Constructeur

	  Grades(String name){
	    this.name = name;
	  }
	  
	  public String toString(){
	    return name;
	  }

}