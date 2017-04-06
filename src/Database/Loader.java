package Database;
import Model.*;
import Model.Tortue.TortueG;
import Model.Tortue.*;

import java.applet.Applet;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.ImageIcon;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;

// Chargement des données contenu dans la base de données afin de les utiliser dans l'application

public class Loader{
	
	private DatabaseObj database = new DatabaseObj();
	private ArrayList<SchoolClass> schoolClassList = new ArrayList<SchoolClass>();
	
	public Loader() throws Exception{
		ArrayList<Child> childList = new ArrayList<Child>();
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		ArrayList<Exercise> exerciseList = new ArrayList<Exercise>();
		int compt = 0;int compt2 = 0;
		
		//======================== select child ===========================
		ResultSet rsChild = database.select("SELECT * FROM CHILD");
		while(rsChild.next()){
			Child  child = new Child(rsChild.getString("FIRSTNAME_CHILD"),rsChild.getString("LASTNAME_CHILD"),rsChild.getInt("AGE_CHILD"),new ImageIcon(rsChild.getString("PIC_CHILD")));
			childList.add(child);				
		}
		
		//======================== select teacher ===========================
		ResultSet rsProf = database.select("SELECT * FROM TEACHER");
		while(rsProf.next()){
			Teacher teacher = new Teacher(rsProf.getString("FIRSTNAME_TEACHER"),rsProf.getString("LASTNAME_TEACHER"),rsProf.getInt("AGE_TEACHER"),new ImageIcon(rsProf.getString("PIC_TEACHER")),rsProf.getString("PASS_TEACHER"));
			teacherList.add(teacher);	
		}
		
		
		
		//======================== select exercise ==========================
		ResultSet rsExercise = database.select("SELECT * FROM EXERCISE");
		Exercise exercise;
		while(rsExercise.next()){
			if (rsExercise.getString("TURTLE_EXERCISE") == "normal"){
					exercise = new Exercise(rsExercise.getString("TITLE_EXERCISE"),
						rsExercise.getString("INSTRUCTION_EXERCISE"),new ImageIcon(rsExercise.getString("PIC_EXERCISE")),
						teacherList.get(compt/10),new TortueG());
			}else if(rsExercise.getString("TURTLE_EXERCISE") == "vitesse"){
					exercise = new Exercise(rsExercise.getString("TITLE_EXERCISE"),
						rsExercise.getString("INSTRUCTION_EXERCISE"),new ImageIcon(rsExercise.getString("PIC_EXERCISE")),
						teacherList.get(compt/10),new TortueRapide());
			}else{
				exercise = new Exercise(rsExercise.getString("TITLE_EXERCISE"),
						rsExercise.getString("INSTRUCTION_EXERCISE"),new ImageIcon(rsExercise.getString("PIC_EXERCISE")),
						teacherList.get(compt/10),new TortueCouleur());
			}				
			exerciseList.add(exercise);	
			compt ++;
			
		}
		
		//======================== select schoolclass ========================
		ResultSet rsSchool = database.select("SELECT * FROM SCHOOLCLASS");
		while(rsSchool.next()){
			SchoolClass schoolClass = new SchoolClass(rsSchool.getString("NAME_CLASS"),teacherList.get(compt2));
			compt2++;
			schoolClassList.add(schoolClass);
		}
		System.out.println(childList.size());
		for (int i=0;i<childList.size();i++){
			schoolClassList.get(i/25).addChild(childList.get(i));
		}
	}
	
	// fonction de test
	
	public void displayFunction(){
		for(SchoolClass Sc : schoolClassList)
		{
			System.out.println("CLASSE : " + Sc.getClassName());
			System.out.println("TEACHER : " + Sc.getTeacher().getFirstName());
			System.out.println("ELEVE");
			for (Child c : Sc.getChildList()){
				System.out.println(c.getFirstName());
				System.out.println(c.getLastName());
				System.out.println(c.getAge());
			}
			
		}
	}
	

	/**
	 * @return the schoolClassList
	 */
	public ArrayList<SchoolClass> getSchoolClassList() {
		return schoolClassList;
	}

	/**
	 * @param schoolClassList the schoolClassList to set
	 */
	public void setSchoolClassList(ArrayList<SchoolClass> schoolClassList) {
		this.schoolClassList = schoolClassList;
	}


}


	

