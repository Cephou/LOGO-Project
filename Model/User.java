package Model;

import javax.swing.*;

/**
 * @author Groupe 7
 *
 */

public abstract class User {
    String firstName;
    String lastName;
    int age;
    ImageIcon picture;

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