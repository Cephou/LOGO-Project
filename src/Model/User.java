package Model;

import java.net.URL;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;

/**
 * User is an abstract class that creates a user with the required information.
 */

public abstract class User {
	protected String firstName; // The first name of the user
	protected String lastName; // The last name of the user
	protected int age; // The age of the user
	protected URL picture; // The icon associated to the user

	/**
	 * Constructor of the class User.
	 *
	 * @param pFirstName
	 *            The first name of the user
	 * @param pLastName
	 *            The last name of the user
	 * @param pAge
	 *            The age of the user >0
	 * @param pPicture
	 *            The picture of the user Controle la taille du pr�nom (entre
	 *            1 et 50 caract�res) Controle la taille du nom (entre 1 et 50
	 *            caract�res)
	 * @throws StringSizeException
	 */
	public User(String pFirstName, String pLastName, int pAge,
				URL pPicture) throws EmptyStringException,
			NegativeIntegerException, StringSizeException {

		this.setFirstName(pFirstName);
		this.setLastName(pLastName);
		this.setAge(pAge);
		picture = pPicture;
	}

	//////////////////// FIRST NAME ////////////////////

	public String getFirstName() {
		return firstName;
	}

	/**
	 * setFirstName can modify the first name of the user. Minimum 1 character,
	 * maximum 50 characters.
	 *
	 * @param firstName
	 *            is the new first name
	 * @throws StringSizeException
	 */
	protected void setFirstName(String firstName)
			throws EmptyStringException, StringSizeException {
		if (firstName.length() >= 1 && firstName.length() <= 50) {
			this.firstName = firstName;
		} else {
			throw new StringSizeException();
		}
	}

	//////////////////// LAST NAME ////////////////////

	public String getLastName() {
		return lastName;
	}

	/**
	 * setLastName can modify the last name of the user. Minimum 1 character,
	 * maximum 50 characters.
	 *
	 * @param lastName
	 *            is the new last name
	 * @throws StringSizeException
	 */
	protected void setLastName(String lastName) throws StringSizeException {
		if (lastName.length() >= 1 && lastName.length() <= 50)
			this.lastName = lastName;
		else {
			throw new StringSizeException();
		}
	}

	//////////////////// AGE ////////////////////

	public int getAge() {
		return age;
	}

	/*
	 * Set age can modify the age of the user
	 * This ge have to be > 0
	 * @param age the age of the user
	 */
	protected void setAge(int age) throws NegativeIntegerException {
		if (age > 0) {
			this.age = age;
		} else {
			throw new NegativeIntegerException();
		}

	}

	//////////////////// PICTURE ////////////////////

	public URL getPicture() {
		return picture;
	}

	/**
	 * TODO CONTRAINTES ??????
	 * @param picture
	 */
	protected void setPicture(URL picture) {
		this.picture = picture;
	}

}