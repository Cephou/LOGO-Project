package Main;

import Exception.*;
import Model.Assay;
import Model.Teacher;

public class SubMainTeacher extends Main {
	private Teacher teacher;

	/**
	 * Constructeur de la fenetre, de son remplissage et de l'ajout de ses controlleurs pour l'userAgent Teacher
	 * @param teacher
	 */

	public SubMainTeacher(Teacher teacher)throws tooLongStringException, AlreadyInListException, EmptyStringException, NegativeIntegerException, StringSizeException{
		this.teacher = teacher;
		//ajout des lsiteners

	}

	public void selectAssay(Assay assay) {

	}
}
