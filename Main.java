import java.awt.*;

import javax.swing.*;

import Database.DatabaseCreation;
import Database.DatabaseLoader;
import Database.DatabaseRecorder;
import Model.*;
import Model.Action;
import Model.Tortue.*;
import View.Modules.*;
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
	private DatabaseCreation databaseCreation; // creation SSI BDD invexistante; 

	
	// TEST
	private TortueG myTurtle, myColorTurtle, myGraphicTurtle;
    private JButton bAvance, bTourne, bChangeTortue;
    
	public Main() {
//		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
//		Child child1 = new Child("Alexis", "Amiand", 12, null);
//		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
		
        myColorTurtle = new TortueCouleur("RED");
        TurtleView test = new TurtleView();
		JPanel test2 = test.getTurtleView();
		
		Frame frame = new Frame();
		frame.add(test2);
		
        Action action = new Action(PossibleAction.MoveForward, myColorTurtle);
        action.drawTurtle();
        Action action2 = new Action(PossibleAction.ChangeColor, myColorTurtle, "blue");
        action2.drawTurtle();
        Action action3 = new Action(PossibleAction.MoveForward, myColorTurtle);
        action3.drawTurtle();
        
        frame.setVisible(true);
        frame.pack();
        
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
