package Controler;

import Main.Main;
import Main.SubMainChild;
import Main.SubMainTeacher;
import Model.Assay;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AssaysListSelection implements MouseListener {

    private Assay assay;
    private Main main;
    private SubMainChild subMainChild;
    private SubMainTeacher subMainTeacher;

    public AssaysListSelection(Assay assay, Main main) {
        this.assay = assay;
        this.main = main;
    }

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