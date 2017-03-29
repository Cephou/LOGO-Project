package Model;

import javax.swing.*;

/**
 * User is an abstract class that creates a user with the required information.
 *
 */

public abstract class User {
    String firstName; // The first name of the user
    String lastName; // The last name of the user
    int age; // The age of the user
    ImageIcon picture; // The icon associated to the user

    public User(String pFirstName, String pLastName, int pAge, ImageIcon pPicture) {
        firstName = pFirstName;
        lastName = pLastName;
        age = pAge;
        picture = pPicture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

}