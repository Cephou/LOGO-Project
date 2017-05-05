package Controler;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Main.Main;
import Main.SubMainChild;

public class ReturnButtonSelection implements MouseListener {

	private Main main;
	
	public ReturnButtonSelection(Main pmain) {
		main = pmain;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(((SubMainChild) main).getCurrentPage() == 1) {
			
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}