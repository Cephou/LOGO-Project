package Database;

import java.sql.*;
import Model.User;

/**
 * Contient le code permettant de creer la base de donnée et de générer le tables définies par le MPD
 */


public class DatabaseCreation {
	   /**
	     * Connect to a sample database
	     *
	     * @param fileName the database file name
	     */
	    public static void databaseCreation() {
	 
	        Connection c = null;
	 
	        try {
	            Class.forName("org.sqlite.JDBC");
	            c = DriverManager.getConnection("jdbc:sqlite:logo-project.db");
	          } catch ( Exception e ) {
	            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	            System.exit(0);
	          }
	          System.out.println("Opened database successfully");
	          
	    }
	          
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	databaseCreation();
	    }
	} 