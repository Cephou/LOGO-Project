package Model;

import javax.swing.*;

/**
 * Teacher is a class extends User class. A teacher is a user who has a password.
 */
public class Teacher extends User {

    private String password; // The password of the teacher

    public Teacher(String pFirstName, String pLastName, int pAge, ImageIcon pPicture, String pPassword) {
        super(pFirstName, pLastName, pAge, pPicture);
        password = pPassword;
    }

    //////////////////// GETTERS ////////////////////

    public String getPassword() {
        return password;
    }

    //////////////////// SETTERS ////////////////////

    public void setPassword(String password) {
        this.password = password;
    }
}