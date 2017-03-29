package Model;

import javax.swing.*;

/**
 * User is an abstract class that creates a user with the required information.
 *
 */
public abstract class User {
    protected String firstName; // The first name of the user
    protected String lastName; // The last name of the user
    protected int age; // The age of the user
    protected ImageIcon picture; // The icon associated to the user

    /**
     * Constructor of the class User.
     *
     * @param pFirstName The first name of the user
     * @param pLastName The last name of the user
     * @param pAge The age of the user
     * @param pPicture The picture of the user
     */
    public User(String pFirstName, String pLastName, int pAge, ImageIcon pPicture) {
        firstName = pFirstName;
        lastName = pLastName;
        age = pAge;
        picture = pPicture;
    }

    //////////////////// FIRST NAME ////////////////////

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    //////////////////// LAST NAME ////////////////////

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //////////////////// AGE ////////////////////

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //////////////////// PICTURE ////////////////////

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

}