import javax.swing.ImageIcon;

import Database.DatabaseLoader;
import Database.DatabaseRecorder;
import Model.*;
/**
 * Main, cette classe gere les reltions  entre toutes les classes de l'application.
 * Elle  instancie layout general et les sous-main. Ce layout est rempli en fonction du type d'utilisateur et de l'action choisit
 * Elle stock le type d'utilisateur actiellement sur l'application, et lance le sous main correspondant
 * Elle assure le chargemment des données à son lancemment
 * Elle assure l'enregistremment des données lorsqu'on quitte l'application.
 *
 */

public class Main {
	private User user; //le type d'utilisateur
	private DatabaseLoader databaseLoader; //creation de la connexion vers BDD (//TODO deplacer dans les classes
	private DatabaseRecorder databaseRecorder; //enregistremment des données
	private DatabaseCreation datbaseCreation; // creation SSI BDD invexistante; 

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
	}

}
