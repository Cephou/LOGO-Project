package Database;
import java.applet.Applet;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.Child;

// Chargement des données contenu dans la base de données afin de les utiliser dans l'application

public class Loader{
	
	private DatabaseObj database = new DatabaseObj();
	private ArrayList<Child> childList = new ArrayList<Child>();
	
	public Loader() throws Exception{
		ResultSet rs = database.selectChildren();
		while(rs.next()){
			Child  child = new Child(rs.getString("Firstname_Child"),rs.getString("Lastname_Child"),rs.getInt("Age_Child"),new File(rs.getString("Pic_Child")));
			//img = ImageIO.read(url);
			childList.add(child);		
		
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Loader();
		
	}
}


	

