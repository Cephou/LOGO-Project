package Database;
import java.sql.*;

// Chargement des données contenu dans la base de données afin de les utiliser dans l'application

public class Loader {

	/*
	 * Exemple de syntaxe de connexion de BDD JDBC/SQLite :
	 * 
	 * 
	 */
	  public static void main( String args[] )
	  {
	    Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Opened database successfully");
  }
}

/*public class DatabaseLoader {
	 
	/**
	 *
	 * @author sqlitetutorial.net
	 

	     /**
	     * Connect to a sample database
	     
	    public static void connect() {
	        Connection conn = null;
	        try {
	            // db parameters
	            String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
	            // create a connection to the database
	            conn = DriverManager.getConnection(url);
	            
	            System.out.println("Connection to SQLite has been established.");
	            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
	    }
	    /**
	     * @param args the command line arguments
	     
	    public static void main(String[] args) {
	        connect();
	    }
	    
}*/
	
