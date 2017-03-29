package Model;

import javax.swing.*;

public class Teacher extends User {

    String password;

    public Teacher(String firstName, String lastName, int age, ImageIcon picture, String pPassword) {
        super(firstName, lastName, age, picture);
        password = pPassword;
    }

}
