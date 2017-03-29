package Model;

public enum Grades {

	  // Objets directement construits

	  NN("Non notés"),
	  ECA("En cours d'acquisition"),
	  A("Acquis"),
	  NA("Non acquis");
	
	  private String name = "";

	  //Constructeur

	  Grades(String name){
	    this.name = name;
	  }
	  
	  public String toString(){
	    return name;
	  }

}