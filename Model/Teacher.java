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
     * The first and last name must be between 1 and 50 characters.
     * The age must be between 20 and 80 years old.
     * The password must be at least 6 characters.
     *
     * @param pFirstName The first name of the teacher
     * @param pLastName The last name of the teacher
     * @param pAge The age of the teacher
     * @param pPicture The picture of the teacher
     * @param pPassword The password of the teacher
     */
    public Teacher(String pFirstName, String pLastName, int pAge, ImageIcon pPicture, String pPassword) {
        super(pFirstName, pLastName, pAge, pPicture);
        setAge(pAge);
        setPassword(pPassword);
    }

    //////////////////// SETTERS ////////////////////

    /**
     * setAge can modify the age of the teacher.
     * The age must be between 20 and 70.
     *
     * @param age is the new age
     */
    @Override
    protected void setAge(int age) {
        if (age >= 20 && age <= 70)
            super.setAge(age);
    }

    /**
     * setPassword can modify the password of the teacher.
     * Minimum 6 characters.
     *
     * @param password is the new password
     */
    public void setPassword(String password) {
        if (password.length() > 6)
            this.password = password;
    }

    //////////////////// CLASSES ////////////////////

    /**
     * getClasses is a method that returns the teacher's classes list.
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
        boolean found = false;
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i) == schoolClass)
                found = true;
        }
        if (!found)
            classes.add(schoolClass);
    }

}