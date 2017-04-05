package Database;

public class Creation {

	private DatabaseObj database = new DatabaseObj();

	public Creation(){
		
		// Creation of table ACTION
		database.sqlQuery("drop table if exists ACTION; create table ACTION ( "
				+ "ID_ACTION            INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "ID_ASSAY             int not null, "
				+ "COMMAND_ACTION       varchar(50) not null,"
				+ "D_ACTION             varchar(50) not null,"
				+ "SPEED_ACTION         varchar(50) not null,"
				+ "TURTLE_ACTION        varchar(50) not null,"
				+ "FOREIGN KEY(ID_ASSAY) REFERENCES ASSAY(ID_ASSAY));");
		
		// Creation of table ASSAY
		database.sqlQuery("drop table if exists ASSAY;create table ASSAY("
				+ "ID_ASSAY             INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "ID_CHILD             int not null,"
				+ "COMMENT_ASSAY        int not null,"
				+ "GRADE_ASSAY          varchar(300) not null,"
				+ "FOREIGN KEY(ID_CHILD) REFERENCES CHILD(ID_CHILD));");
		
		// Creation of table CHILD
		database.sqlQuery("drop table if exists CHILD;create table CHILD("
				+ "ID_CHILD             INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ "NAME_CLASS           varchar(50),"
				+ "FIRSTNAME_CHILD      varchar(50) not null,"
				+ "LASTNAME_CHILD       varchar(50) not null,"
				+ "AGE_CHILD            int not null,"
				+ "PIC_CHILD            longblob not null,"
				+ "FOREIGN KEY(NAME_CLASS) REFERENCES SCHOOLCLASS(NAME_CLASS));");
		
		// Creation of table COMPLETE
		database.sqlQuery("drop table if exists COMPLETE;create table COMPLETE("
				+ "ID_EXERCISE          int not null,"
				+ "ID_CHILD             int not null,"
				+ "AVAILABLE_EXERCISE   bool not null,"
				+ "primary key (ID_EXERCISE, ID_CHILD),"
				+ "FOREIGN KEY(ID_EXERCISE) REFERENCES EXERCISE(ID_EXERCISE),"
				+ "FOREIGN KEY(ID_CHILD) REFERENCES CHILD(ID_CHILD));");
		
		// Creation of table EXERCISE
		database.sqlQuery("drop table if exists EXERCISE;create table EXERCISE("
				+ "ID_EXERCISE          INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "TITLE_EXERCISE       varchar(300) not null,"
				+ "INSTRUCTION_EXERCISE varchar(500) not null,"
				+ "PIC_EXERCISE         longblob not null,"
				+ "TURTLE_EXERCISE      varchar(50) not null);");
		
		// Creation of table IS_AVAILABLE
		database.sqlQuery("drop table if exists IS_AVAILABLE;create table IS_AVAILABLE("
				+ "NAME_CLASS           varchar(50) not null,"
				+ "ID_EXERCISE          int not null,"
				+ "primary key (NAME_CLASS, ID_EXERCISE),"
				+ "FOREIGN KEY(NAME_CLASS) REFERENCES SCHOOLCLASS(NAME_CLASS),"
				+ "FOREIGN KEY(ID_EXERCISE) REFERENCES EXERCISE(ID_EXERCISE));");
		
		// Creation of table RULE
		database.sqlQuery("drop table if exists RULE;create table RULE("
				+ "ID_TEACHER           int not null,"
				+ "NAME_CLASS           varchar(50) not null,"
				+ "primary key (ID_TEACHER, NAME_CLASS),"
				+ "FOREIGN KEY(ID_TEACHER) REFERENCES TEACHER(ID_TEACHER),"
				+ "FOREIGN KEY(NAME_CLASS) REFERENCES SCHOOLCLASS(NAME_CLASS));");
		
		// Creation of table SCHOOLCLASS
		database.sqlQuery("drop table if exists SCHOOLCLASS;create table SCHOOLCLASS("
				+ "NAME_CLASS           varchar(50) not null,"
				+ "primary key (NAME_CLASS));");
		
		// Creation of table TEACHER
		database.sqlQuery("drop table if exists TEACHER;create table TEACHER("
				+ "ID_TEACHER           INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "FIRSTNAME_TEACHER    varchar(50) not null,"
				+ "LASTNAME_TEACHER     varchar(50) not null,"
				+ "AGE_TEACHER          int not null,"
				+ "PASS_TEACHER         varchar(80) not null,"
				+ "PIC_TEACHER          longblob not null);");
		
		// INSERT CHILD
		
		database.insertChild("pierre", "Jouanet", 20, "http://java.sun.com/FAQ.html");
		database.insertChild("Laurent", "Noyon", 22, "http://java.sun/FAQ.html");
		database.insertChild("Alexis", "Amiand", 21, "http://java.sun/FAQ.html");
		database.insertChild("Wassim", "Kerkri", 20, "http://java.sun/FAQ.html");
	}
		
		
	
	public static void main(String[] args){
		new Creation();
	}

}
