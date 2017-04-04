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
	        Statement stmt = null;
	 
	        try {
	            Class.forName("org.sqlite.JDBC");
	            c = DriverManager.getConnection("jdbc:sqlite:logo-project.db");
	            System.out.println("Opened database successfully");
	            
	            // Début création de la table
	            stmt = c.createStatement();
	            String sql = "CREATE TABLE COMPANY " +
	                         "(ID INT PRIMARY KEY     NOT NULL," +
	                         " NAME           TEXT    NOT NULL, " + 
	                         " AGE            INT     NOT NULL, " + 
	                         " ADDRESS        CHAR(50), " + 
	                         " SALARY         REAL)"; 
	            stmt.executeUpdate(sql);
	            stmt.close();
	            c.close();

	          } catch ( Exception e ) {
	            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	            System.exit(0);
	          }
	          System.out.println("Table created successfully");          
	          
	    }
	          
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	databaseCreation();
	    }
	} 