package Controler;

import Main.Main;
import Main.SubMainChild;
import Main.SubMainTeacher;
import Model.Assay;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Cette classe permet de controler la sélection d'un essai et d'appeler sa procédure de chargement.
 * @author Groupe 7
 */

public class AssaysListSelection implements MouseListener {

    private Assay assay; // L'essai
    private Main main; // Lien avec le main
    private SubMainChild subMainChild; // Lien avec le main child
    private SubMainTeacher subMainTeacher; // Lien avec le main teacher

    // Constructeur
    public AssaysListSelection(Assay assay, Main main) {
        this.assay = assay;
        this.main = main;
    }

    // Permet de sélectionner l'action lors d'un clic.
    @Override
    public void mouseClicked(MouseEvent arg0) {
        if (main instanceof SubMainChild)
            subMainChild.selectAssay(assay);

        else if (main instanceof SubMainTeacher)
            subMainTeacher.selectAssay(assay);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {

    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent arg0) {

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }
}