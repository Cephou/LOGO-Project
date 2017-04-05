package Database;

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import Exception.EmptyStringException;
import Exception.NegativeIntegerException;
import Exception.StringSizeException;
import Model.*;

// Enregistrement dans la base de données 

public class Recorder {

	private DatabaseObj database = new DatabaseObj();
	private ArrayList<Child> childList = new ArrayList<Child>();
	private

	public Recorder() {
		//drop all the tables
		database.sqlQuery("drop table if exists ACTION;"
				+ "drop table if exists ASSAY;"
				+ "drop table if exists CHILD;"
				+ "drop table if exists COMPLETE;"
				+ "drop table if exists EXERCISE;"
				+ "drop table if exists IS_AVAILABLE;"
				+ "drop table if exists RULE;"
				+ "drop table if exists SCHOOLCLASS;"
				+ "drop table if exists TEACHER;");
		
		//insert all the data again.
		
	}

	public static void main(String[] args) throws Exception {
		new Recorder();
	}
}






/*Exemple de syntaxe op�ration UPDATE SQLite/JDBC
 * 
 * import java.sql.*;

	public class SQLiteJDBC
	{
	  public static void main( String args[] )
	  {
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
	      stmt.executeUpdate(sql);
	      c.commit();

	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	         int id = rs.getInt("id");
	         String  name = rs.getString("name");
	         int age  = rs.getInt("age");
	         String  address = rs.getString("address");
	         float salary = rs.getFloat("salary");
	         System.out.println( "ID = " + id );
	         System.out.println( "NAME = " + name );
	         System.out.println( "AGE = " + age );
	         System.out.println( "ADDRESS = " + address );
	         System.out.println( "SALARY = " + salary );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	  }
	}*/
