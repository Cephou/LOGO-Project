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
	    public static void databaseCreation(String fileName) {
	 
	        String url = "jdbc:sqlite:" + fileName;
	 
	        try (Connection conn = DriverManager.getConnection(url)) {
	            if (conn != null) {
	                DatabaseMetaData meta = conn.getMetaData();
	                System.out.println("The driver name is " + meta.getDriverName());
	                System.out.println("A new database has been created.");
	            }
	 
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	        System.out.println("Opened database successfully");
	    }
	 
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	    	databaseCreation("logo-project.db");
	    }
	} 