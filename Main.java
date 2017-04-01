import java.awt.*;

import javax.swing.*;

import Database.DatabaseCreation;
import Database.DatabaseLoader;
import Database.DatabaseRecorder;
import Model.*;
import Model.Action;
import Model.Tortue.*;
import Model.Tortue.Canvas;
/**
 * Main, cette classe gere les reltions  entre toutes les classes de l'application.
 * Elle  instancie layout general et les sous-main. Ce layout est rempli en fonction du type d'utilisateur et de l'action choisit
 * Elle stock le type d'utilisateur actiellement sur l'application, et lance le sous main correspondant
 * Elle assure le chargemment des données à son lancemment
 * Elle assure l'enregistremment des données lorsqu'on quitte l'application.
 *
 */

public class Main extends JFrame {
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
		myGraphicTurtle = new TortueG();
        myColorTurtle = new TortueCouleur("RED");
        JPanel canv = Canvas.getCanvasPanel();
        this.add(canv, BorderLayout.CENTER);
        
        myTurtle = myGraphicTurtle; // Default
        this.setVisible(true);
        this.pack();
        
        Action action = new Action(PossibleAction.MoveForward, myColorTurtle);
        action.drawTurtle();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
