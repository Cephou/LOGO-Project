package Main;

import Database.DatabaseObj;
import Database.Loader;
import Database.Recorder;
import Exception.*;
import Model.*;
import View.GeneralLayout;
import View.Login.ChildLoginView;
import View.Login.ClassLoginView;

import javax.swing.*;
import java.util.ArrayList;
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
	//private DatabaseObj databaseCreation; // creation SSI BDD invexistante;

	public Main() throws Exception {
		//loadDatas(); // Charge des donn�es
		databaseLoader = new Loader();
		schoolClasses = databaseLoader.getSchoolClassList();
		
		layout = new GeneralLayout();
		ClassLoginView classSelection = new ClassLoginView(schoolClasses, this); // Cr�e le panel de liste de classes
		layout.changeBodyContent(classSelection.getClassSelection()); // Change le contenu du body et ajoute la liste de classes
	}

	public static void main(String[] args) throws Exception {
		try {
			new Main();
		} catch (EmptyStringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NegativeIntegerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (StringSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (tooLongStringException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlreadyInListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Charge un jeu de donn�es
	 * @throws StringSizeException
	 * @throws NegativeIntegerException
	 * @throws EmptyStringException
	 * @throws tooLongStringException
	 * @throws AlreadyInListException
	 */
	public void loadDatas() throws EmptyStringException, NegativeIntegerException, StringSizeException, tooLongStringException, AlreadyInListException {
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		Child child2 = new Child("Laurent", "L'abricot", 13, null);
		Child child3 = new Child("Severin", "Chargeur", 11, null);

		// Create classes
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
		SchoolClass classe2 = new SchoolClass("CE2", teacher1);
		// add eleve to classes
		classe1.addChild(child1);
		classe1.addChild(child2);
		classe2.addChild(child3);

		// crea exo
		Exercise exercise1 = new Exercise("Exercice1", "Tracer des traits", null, teacher1, null);
		Exercise exercise2 = new Exercise("Exercice2", "Tracer des traits", null, teacher1, null);
		Exercise exercise3 = new Exercise("Exercice2", "Tracer des traits", null, teacher1, null);
		Exercise exercise4 = new Exercise("Exercice2", "Tracer des traits", null, teacher1, null);


		
		child1.createAssay(exercise1);
		child1.createAssay(exercise2);
		child1.createAssay(exercise3);
		child1.createAssay(exercise4);
		

		teacher1.evaluateAssay(child1.getAssays().get(0), "c'est nul tu as fait n'importequoi", Grade.NotAcquired);
		teacher1.evaluateAssay(child1.getAssays().get(2), "c'est ien tu es un bon eleve", Grade.Acquired);
		teacher1.evaluateAssay(child1.getAssays().get(1), "avec de la volont� tu pourrais y arriver", Grade.InAcquisition);
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
	public void loginChild(Child child) throws Exception{
		// Cr�e le submain
		try {
			try {
				new SubMainChild(child, layout, schoolClasses);
			} catch (tooLongStringException | AlreadyInListException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
	}

	public void test() {
		System.out.println("test");
		// TODO Auto-generated method stub

	}

}