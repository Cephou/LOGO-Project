import javax.swing.ImageIcon;

import Model.*;
/**
 * Main, cette classe gere les reltions  entre toutes les classes de l'application.
 * Elle  instancie layout general et les sous-main.
 * Elle stock le type d'utilisateur actiellement sur l'application, et lance le sous main correspondant
 * Elle assure le chargemment des donn�es � son lancemment
 * Elle assure l'enregistremment des donn�es lorsqu'on quitte l'application.
 *
 */

public class Main {
	private Object userAgent;
	private DatabaseLoader databaseLoader; //chargement des donn�es
	private DatabaseRecorder databaseRecorder; //enregistremment de sodn�nes

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
	}

}
