package View.Modules;

import Controler.AssaysListSelection;
import Main.Main;
import Model.Assay;
import Model.Child;

import javax.swing.*;
import java.awt.*;

/**
 * Cette classe permet de créer une liste de tentatives d'un exercice particulier pour un enfant particulier.
 * Les données concernant les tentatives sont récupérées à partir d'une base de données.
 */
public class AssaysListView {

    JPanel AssaysPanel;
    private Main main;

    /**
     * Constructeur de la classe AssaysListView.
     *
     * @param child est l'enfant qui sélectionne l'exercice
     */
    public AssaysListView(Child child, Main main) {
        this.main = main;
        setAssaysPanel(child);
    }

    public void setAssaysPanel(Child child) {
        int i = 1;
        AssaysPanel = new JPanel();
        AssaysPanel.setLayout(new GridLayout(1, 1));
        AssaysPanel.setSize(50, 200);
        for (Assay assay : child.getAssays()) {
            createAssayButton(assay, i);
            i++;
        }

    }

    public void createAssayButton(Assay assay, int i) {
        JButton assayBtn = new JButton("Tentative " + i);
        assayBtn.addMouseListener(new AssaysListSelection(assay, main));
        AssaysPanel.add(assayBtn);
    }

}