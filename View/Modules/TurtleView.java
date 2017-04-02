package View.Modules;

import javax.swing.JPanel;

import Model.Tortue.Canvas;

/*
 * Cette classe prend en paramètre une tortue et affiche le canvas avec la tortue en 0,0 dans un panel
 */

public class TurtleView {
	
	private JPanel TurtleView;

	public TurtleView() {
        TurtleView = Canvas.getCanvasPanel();		
	}
	
	public JPanel getTurtleView() {
		return TurtleView;
	}
}
