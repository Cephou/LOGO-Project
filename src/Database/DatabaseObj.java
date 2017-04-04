package Database;

import java.net.URL;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sqlite.SQLiteDataSource;

import Model.User;

/**
 * Contient le code permettant de creer la base de donnée et de générer le tables définies par le MPD
 */


public class DatabaseObj {

    private Connection connection;
 
    
    /**
     * Se connecter
     */
    public void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:res/logo-project.db");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
            this.connection = null;
        }
    }
    
    /**
     * Fermer la connexion
     */
    public void close() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Créer une table
     */
    public void createTable(String query) {
        this.connect();
        if (this.connection != null) {
            try {
                String SQL = query;
                Statement stt = this.connection.createStatement();
                stt.executeUpdate(SQL);
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
 
    /**
     * Insérer un eleve dans la table
     * @param firstname String
     * @param lastname String
     * @param int age
     * @param url picture
     */
    public void insert_child(String firstName, String lastName, int age,URL picture) {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL = "INSERT INTO Child VALUES(?,?,?,?);";
            PreparedStatement ins_stmt = connection.prepareStatement(SQL);
 
            ins_stmt.setString(1, firstName);
            ins_stmt.setString(2, lastName);
            ins_stmt.setInt(3, age);
            ins_stmt.setURL(4, picture);          
 
            ins_stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Insérer un professeur dans la table
     * @param firstname String
     * @param lastname String
     * @param age int
     * @param password String
     * @param picture url
     */
    public void insert_professor(String firstName, String lastName, int age, String password, URL picture) {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL = "INSERT INTO Teacher VALUES(?,?,?,?,?);";
            PreparedStatement ins_stmt = connection.prepareStatement(SQL);
 
            ins_stmt.setString(1, firstName);
            ins_stmt.setString(2, lastName);
            ins_stmt.setInt(3, age);
            ins_stmt.setString(4, password);
            ins_stmt.setURL(5, picture);          
 
            ins_stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    /**
     * Sélectionner 
     */
    public void select_Cats() {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL="SELECT * FROM TB_ANIMALS WHERE ANI_KIND=?";
            PreparedStatement stmt = connection.prepareStatement(SQL);
            stmt.setString(1, "chat");
            ResultSet rs = stmt.executeQuery();
 
            System.out.println("Les animaux de race chat:");
            while (rs.next()) {
                System.out.println("nom:"+rs.getString("ANI_NAME")+" age:"+rs.getInt("ANI_AGE"));
            }
 
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }         
	 
} 