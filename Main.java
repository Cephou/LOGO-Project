import javax.swing.ImageIcon;

import Model.*;

public class Main {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Patrick", "Girard", 25, null, "azerty");
		Child child1 = new Child("Alexis", "Amiand", 12, null);
		SchoolClass classe1 = new SchoolClass("CE1", teacher1);
	}

}
