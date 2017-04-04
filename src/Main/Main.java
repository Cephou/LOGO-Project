package Main;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import Database.DatabaseObj;
import Database.Loader;
import Database.Recorder;
import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.*;
import Model.Action;
import Model.Tortue.*;
import View.*;
import View.Child.ChildHomeView;
import View.Login.ChildLoginView;
import View.Login.ClassLoginView;
import View.Modules.*;
/**
 * Main, cette classe gere les reltions  entre toutes les classes de l'application.
 * Elle  instancie layout general et les sous-main. Ce layout est rempli en fonction du type d'utilisateur et de l'action choisit
 * Elle stock le type d'utilisateur actiellement sur l'application, et lance le sous main correspondant
 * Elle assure le chargemment des donn�es � son lancemment
 * Elle assure l'enregistremment des donn�es lorsqu'on quitte l'application.
 *
 */

public class Main {
	private ArrayList<SchoolClass> schoolClasses; // Liste des classes
	private User user; //le type d'utilisateur
	private GeneralLayout layout; // Le layout g�n�ral
	private Loader databaseLoader; //creation de la connexion vers BDD (//TODO deplacer dans les classes
	private Recorder databaseRecorder; //enregistremment des donn�es
	private DatabaseObj databaseCreation; // creation SSI BDD invexistante; 
    
	public Main() throws EmptyStringException, NegativeIntegerException, StringSizeException {
		loadDatas(); // Charge des donn�es
		layout = new GeneralLayout();
		ClassLoginView classSelection = new ClassLoginView(schoolClasses, this); // Cr�e le panel de liste de classes
		layout.changeBodyContent(classSelection.getClassSelection()); // Change le contenu du body et ajoute la liste de classes
	}
	
	/**
	 * Charge un jeu de donn�es
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

	/**
	 * G�n�re le panel de s�lection d'�l�ve, actualise le header
	 * @param schoolClass
	 */
	public void generateChildSelectionContent(SchoolClass schoolClass) {
		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildLoginView childLogin = new ChildLoginView(schoolClass, this);
		JPanel childLoginPanel = childLogin.getChildLogin();
		// Change le body avec le nouveau panel d'�l�ves
		this.layout.changeBodyContent(childLoginPanel);
	}
	
	/**
	 * G�n�re le home de l'�l�ve
	 * @param child
	 */
	public void generateChildExerciseContent(Child child) {
		// Cr�e le submain	
		try {
			new SubMainChild(child);
		} catch (EmptyStringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeIntegerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StringSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Cr�e un nouveau panel d'�l�ve avec la classe
		ChildHomeView childHome = new ChildHomeView();
		JPanel childHomePanel = childHome.getChildHomeView();
		// Change le body avec le nouveau panel d'exercices
		layout.changeBodyContent(childHomePanel);		
	}
	
	public static void main(String[] args) throws EmptyStringException, NegativeIntegerException, StringSizeException {
		new Main();
	}

	public void test() {
		System.out.println("test");
		// TODO Auto-generated method stub
		
	}

}
