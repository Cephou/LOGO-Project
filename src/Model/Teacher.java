package Model;

import Exception.*;
import Model.Tortue.TortueG;

import javax.swing.*;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

/**
 * Teacher is a class extends User class. A teacher is a user who has a
 * password. He can create an exercise.
 */

public class Teacher extends User {

	private String password; // The password of the teacher
	private ArrayList<SchoolClass> classes; // The list of the classes of the
											// teacher

	/**
	 * Constructor of the class Teacher. The first and last name must be between
	 * 1 and 50 characters. The age must be between 20 and 80 years old. The
	 * password must be at least 6 characters.
	 *
	 * @param pFirstName
	 *            The first name of the teacher
	 * @param pLastName
	 *            The last name of the teacher
	 * @param pAge
	 *            The age of the teacher
	 * @param pPicture
	 *            The picture of the teacher
	 * @param pPassword
	 *            The password of the teacher
	 * @throws StringSizeException
	 * @throws NegativeIntegerException
	 * @throws EmptyStringException
	 */
	public Teacher(String pFirstName, String pLastName, int pAge, ImageIcon pPicture, String pPassword)
			throws EmptyStringException, NegativeIntegerException, StringSizeException {
		super(pFirstName, pLastName, pAge, pPicture);
		this.setAge(pAge);
		this.setPassword(pPassword);
		this.classes = new ArrayList<SchoolClass>();
	}

	//////////////////// SETTERS ////////////////////

	/**
	 * setAge can modify the age of the teacher. The age must be between 20 and
	 * 70.
	 *
	 * @param age
	 *            is the new age
	 */
	@Override
	protected void setAge(int age) {
		if (age >= 20 && age <= 70) {
			this.age = age;
		} else
			System.out.println("Exception : l'�ge doit �tre compris entre 20 et 70 ans.");
	}

	/**
	 * setPassword can modify the password of the teacher. Minimum 6 characters.
	 *
	 * @param password
	 *            is the new password
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
	 * addClass is a method that adds a class to the teacher's classes list. A
	 * class cannot be added only one time to the list.
	 *
	 * @param schoolClass
	 *            is the added class
	 * @throws AlreadyInListException
	 */
	public void addClass(SchoolClass schoolClass) throws AlreadyInListException {
		if (this.classes.contains(schoolClass)) {
			throw new AlreadyInListException();
		} else
			classes.add(schoolClass);
	}

	//////////// EXERCICE ET ASSAYS////////////////////////

	/**
	 * createExercise allows a teacher to add a new exercise. The function will
	 * also add the exercise in the list of exercise of a given class
	 * 
	 * @param schoolClass
	 *            : the class to add the exercise
	 * @param title
	 *            : the title of the exercise
	 * @param instruction
	 *            : instructions of the exercise
	 * @param icon
	 *            : l'icone de l'exercice (image)
	 * @param turtle
	 *            : la tortue choisie (3 choix)
	 * @throws tooLongStringException
	 * @throws EmptyStringException
	 * @throws AlreadyInListException
	 */
	public void createExercise(SchoolClass schoolClass, String title, String instruction, ImageIcon icon,
			TortueG turtle) throws EmptyStringException, tooLongStringException, AlreadyInListException {
		Exercise newExercise = new Exercise(title, instruction, icon, this, turtle);
		schoolClass.addExercice(newExercise);
	}

	/**
	 * Evaluer une tentative Une evaluation de tentive est r�alis�e par un
	 * professeur Il laisse un petit texte (le commentaire) et une note (un des
	 * 3 smileys disponible). Cette action ne peut etre effectu�e qu'une et
	 * une seule fois par tentative. La tentative d'un eleve ne peut �tre
	 * �valu�e que par son professeur.
	 * 
	 * @param teacher
	 *            le professeur qui r�alise l'�valuation (on restreint
	 *            l'avluation d'un eleve a un professeur)
	 * @param c
	 *            le commentaire � laisser, il peut �tre vide.
	 * @param g
	 *            la note � laisser, la note a laisser ne pas etre "�
	 *            �valuer"
	 * @throws WrongGradeException
	 * @throws WrongTeacherException
	 * @throws tooLongStringException
	 */
	public void evaluateAssay(Assay assay, String comment, Grade grade) {
		try {
			if (this == assay.getChild().getSchoolClass().getTeacher()) {
				if (grade != Grade.NotGraded) {
					assay.setComment(comment);
					assay.setGrade(grade);
				} else {
					throw new WrongGradeException();
				}

			} else {
				throw new WrongTeacherException();
			}
			// TODO Else

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

}