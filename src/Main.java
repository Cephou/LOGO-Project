package src;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import src.View.Login.*;
import src.Database.*;
import src.Exception.*;
import src.Model.*;
import src.View.*;

/**
 * Main, cette classe gere les reltions  entre toutes les classes de l'application.
 * Elle  instancie layout general et les sous-main. Ce layout est rempli en fonction du type d'utilisateur et de l'action choisit
 * Elle stock le type d'utilisateur actiellement sur l'application, et lance le sous main correspondant
 * Elle assure le chargemment des données à son lancemment
 * Elle assure l'enregistremment des données lorsqu'on quitte l'application.
 *
 */

public class Main {
	private ArrayList<SchoolClass> schoolClasses; // Liste des classes
	private User user; //le type d'utilisateur
	private DatabaseLoader databaseLoader; //creation de la connexion vers BDD (//TODO deplacer dans les classes
	private DatabaseRecorder databaseRecorder; //enregistremment des données
	private DatabaseCreation databaseCreation; // creation SSI BDD invexistante; 
    
	public Main() throws EmptyStringException, NegativeIntegerException, StringSizeException {
		
		loadDatas(); // Charge des données
		GeneralLayout layout = new GeneralLayout();
		ClassLoginView classSelection = new ClassLoginView(schoolClasses, layout); // Crée le panel de liste de classes
		layout.changeBodyContent(classSelection.getClassSelection()); // Change le contenu du body et ajoute la liste de classes
        
	}
	
	/**
	 * Charge un jeu de données
	 * @throws StringSizeException 
	 * @throws NegativeIntegerException 
	 * @throws EmptyStringException 
	 */
	public void loadDatas() throws EmptyStringException, NegativeIntegerException, StringSizeException {
		
		//Generate school
		schoolClasses = new ArrayList<SchoolClass>();
		//Create Prof
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		//create child
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		Child child2 = new Child("Laurent", "L'abricot", 13, null);
		Child child3 = new Child("Severin", "Chargeur", 11, null);
		//Create classes
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
		SchoolClass classe2 = new SchoolClass("CE2", teacher1);
		//add eleve to classes
		classe1.addChild(child1);
		classe1.addChild(child2);
		classe2.addChild(child3);
		
		//add classe tou classes
		schoolClasses.add(classe1);
		schoolClasses.add(classe2);
	}
	
	public static void main(String[] args) throws EmptyStringException, NegativeIntegerException, StringSizeException {
		new Main();
	}

}
