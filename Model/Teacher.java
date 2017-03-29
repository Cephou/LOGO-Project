package Model;

import javax.swing.*;

/**
 * Teacher is a class extends User class. A teacher is a user who has a password.
 */
public class Teacher extends User {

    String password;

    public Teacher(String firstName, String lastName, int age, ImageIcon picture, String pPassword) {
        super(firstName, lastName, age, picture);
        password = pPassword;
    }

}