package Model;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Teacher is a class extends User class. A teacher is a user who has a password.
 *
 */
public class Teacher extends User {

    private String password; // The password of the teacher
    private ArrayList<SchoolClass> classes; // The list of the classes of the teacher

    /**
     * Constructor of the class Teacher.
     *
     * @param pFirstName The first name of the teacher
     * @param pLastName The last name of the teacher
     * @param pAge The age of the teacher
     * @param pPicture The picture of the teacher
     * @param pPassword The password of the teacher
     */
    public Teacher(String pFirstName, String pLastName, int pAge, ImageIcon pPicture, String pPassword) {
        super(pFirstName, pLastName, pAge, pPicture);
        password = pPassword;
    }

    //////////////////// PASSWORD ////////////////////

    public String getPassword() {
        return password;
    }

    /**
     * setPassword can modify the password of the teacher.
     * Minimum 6 characters.
     *
     * @param password is the new password.
     */
    public void setPassword(String password) {
        this.password = password;
    }


    //////////////////// CLASSES ////////////////////

    /**
     * getClass is a method that returns the teacher's classes list.
     *
     * @return the list classes
     */
    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    /**
     * addClass is a method that add a class to the teacher's classes list.
     * A class cannot be added only one time to the list.
     *
     * @param schoolClass is the added class
     */
    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

}