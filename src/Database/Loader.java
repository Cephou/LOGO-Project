package Database;
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

public class Loader {
	
	DatabaseObj database = new DatabaseObj();
	ArrayList<Child> childList = new ArrayList<Child>();
	HashMap<Integer,Integer> indexRecognition = new HashMap<Integer,Integer>();
	
	public Loader() throws SQLException, MalformedURLException, EmptyStringException, NegativeIntegerException, StringSizeException{
		ResultSet rs = database.selectChildren();
		while(rs.next()){
			Child  child = new Child(rs.getString("Firstname_Child"),rs.getString("Lastname_Child"),rs.getInt("Age_Child"),new URL(rs.getString("Pic_Child")));
			childList.add(child);
			indexRecognition.put(childList.indexOf(child), rs.getInt("ID_Child"));			
		}
	}
}


	

