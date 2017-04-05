package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Contient le code permettant de creer la base de données et de générer le tables définies par le MPD
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
            System.out.println("database opened or created");
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
    public void sqlQuery(String query) {
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
     * @param firstName String
     * @param lastName String
     * @param age
     * @param picture
     */
    public void insertChild(String firstName, String lastName, int age,String picture) {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL = "INSERT INTO CHILD(Firstname_Child,Lastname_Child,Age_Child,Pic_Child) VALUES(?,?,?,?);";
            PreparedStatement ins_stmt = connection.prepareStatement(SQL);
 
            ins_stmt.setString(1, firstName);
            ins_stmt.setString(2, lastName);
            ins_stmt.setInt(3, age);
            ins_stmt.setString(4, picture);          
 
            ins_stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Insérer un professeur dans la table
     * @param firstName String
     * @param lastName String
     * @param age int
     * @param password String
     * @param picture url
     */
    public void insertProfessors(String firstName, String lastName, int age, String password, String picture) {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL = "INSERT INTO TEACHER(Fisrtname_Teaher,Lastname_Teacher,Age_Tacher,Pass_Teacher,Pic_teacher) VALUES(?,?,?,?,?);";
            PreparedStatement ins_stmt = connection.prepareStatement(SQL);
 
            ins_stmt.setString(1, firstName);
            ins_stmt.setString(2, lastName);
            ins_stmt.setInt(3, age);
            ins_stmt.setString(4, password);
            ins_stmt.setString(5, picture);          
 
            ins_stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    /**
     * Select children
     */
    public ResultSet selectChildren() {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL="SELECT * FROM CHILD";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    } 
    
    /**
     * Select a professor
     */
    public  ResultSet selectProfessors() {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL="SELECT * FROM TEACHER";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
    } 
    
    /**
     * Select a class
     */
    public ResultSet selectSchoolClass() {
        if (this.connection == null) {
            this.connect();
        }
 
        try {
            String SQL="SELECT * FROM SCHOOLCLASS";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseObj.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
 
    }   
	 
} 