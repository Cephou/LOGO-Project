package Database;
import Model.*;

import java.util.ArrayList;

import Main.*;

/* This class is the recorder.  
 * It is meant to be called only once when the program is closed. 
 * We do not update our program while it is running because it is too complicated. 
 * This class first deletes everything in the database then saves all the data again. 
 */  

public class Recorder {

	private DatabaseObj database = new DatabaseObj();
	private ArrayList<SchoolClass> data;

	public Recorder () throws Exception{
		//delete all the tables
		database.sqlQuery("delete from ACTION;"
				+ "delete from ASSAY;"
				+ "delete from CHILD;"
				+ "delete from COMPLETE;"
				+ "delete from EXERCISE;"
				+ "delete from IS_AVAILABLE;"
				+ "delete from RULE;"
				+ "delete from SCHOOLCLASS;"
				+ "delete from TEACHER;");
		
		
		//insert everything again 
		data = main.getSchoolClasses();
		System.out.println(data.size());
		 for(SchoolClass c : data) { 
			 database.insertSchoolClass(c.getClassName());
			 Teacher t = c.getTeacher();
			 database.insertProfessors(t.getFirstName(), t.getLastName(), t.getAge(), t.getPassword(), t.getPicture().getDescription());
			 System.out.println(t.getPicture().getDescription());
		 		for(Child d : c.getChildList()) {
		 			database.sqlQuery("INSERT LES CHILDREN A BALLE!!");
		 		}
		 		database.sqlQuery("INSERT LE PROF A BALLE");
		 	}
		 }
	
	public static void main(String[] args) throws Exception{
		new Recorder();
	}
	}


