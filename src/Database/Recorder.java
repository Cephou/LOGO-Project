package Database;


/* This class is the recorder.  
 * It is meant to be called only once when the program is closed. 
 * We do not update our program while it is running because it is too complicated. 
 * This class first deletes everything in the database then saves all the data again. 
 */  

public class Recorder {

	private DatabaseObj database = new DatabaseObj();

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
		/*ArrayList<SchoolClass> data = main.getSchoolClasses(); 
		 *for(SchoolClass c : data) { 
		 *	database.sqlQuery("INSERT A BALLE!!"); 
		 *} 
		 */
	}

}
