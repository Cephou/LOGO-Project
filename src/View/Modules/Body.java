package View.Modules;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Body {
	
	private JPanel body;
	
	public Body() {
		body = new JPanel();
		body.setLayout(new BorderLayout(0, 0));
	}

	/**
	 * @return the body
	 */
	public JPanel getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(JPanel body) {
		this.body = body;
	}

	public void removeAll() {
		body.removeAll();
	}

	public void add(JPanel object) {
		body.add(object, BorderLayout.CENTER);
		
	}

}
