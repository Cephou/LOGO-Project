package Model;

import javax.swing.*;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;

/**
 * User is an abstract class that creates a user with the required information.
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
     * @param pLastName  The last name of the user
     * @param pAge       The age of the user >0
     * @param pPicture   The picture of the user
     *                   Controle la taille du pr�nom (entre 1 et 50 caract�res)
     *                   Controle la taille du nom (entre 1 et 50 caract�res)
     * @throws EmptyStringException 
     * @throws NegativeIntegerException 
     */
    public User(String pFirstName, String pLastName, int pAge, ImageIcon pPicture) throws EmptyStringException, NegativeIntegerException {
        if (pAge<=0){
        	throw new NegativeIntegerException();
        }
        if (firstName.isEmpty() || lastName.isEmpty()){
        	throw new EmptyStringException();
        }
        
        
    	firstName = pFirstName;
        lastName = pLastName;
        age = pAge;
        picture = pPicture;
    }

    //////////////////// FIRST NAME ////////////////////

    public String getFirstName() {
        return firstName;
    }

    /**
     * setFirstName can modify the first name of the user.
     * Minimum 1 character, maximum 50 characters.
     *
     * @param firstName is the new first name
     */
    protected void setFirstName(String firstName) {
        if (firstName.length() >= 1 && firstName.length() <= 50)
            this.firstName = firstName;
    }

    //////////////////// LAST NAME ////////////////////

    public String getLastName() {
        return lastName;
    }

    /**
     * setLastName can modify the last name of the user.
     * Minimum 1 character, maximum 50 characters.
     *
     * @param lastName is the new last name
     */
    protected void setLastName(String lastName) {
        if (lastName.length() >= 1 && lastName.length() <= 50)
            this.lastName = lastName;
    }

    //////////////////// AGE ////////////////////

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    //////////////////// PICTURE ////////////////////

    public ImageIcon getPicture() {
        return picture;
    }

    protected void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

}