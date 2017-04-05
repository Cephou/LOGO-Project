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
		database.insertChild("Amber","Schultz", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Tarik","Weaver", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Edan","Rios", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Tara","Cochran", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Sybill","Burris", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Nyssa","Pierce", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Reese","Joseph", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Erasmus","Rice", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Kim","Cook", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Raja","Gill", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Miranda","Robinson", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Quinn","Reed", 11, "res/Image/child-drawing.jpg");
		database.insertChild("Diana","Chandler", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Lucius","Ellis", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Nola","Brewer", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Amaya","Waller", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Tyrone","Cook", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Elliott","Hull", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Minerva","Drake", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Genevieve","Schneider", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Austin","Cash", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Kristen","Calhoun", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Grace","Green", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Cynthia","Klein", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Wing","Summers", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Francesca","Byrd", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Jonah","Lowery", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Tiger","Medina", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Dacey","Campos", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Leslie","Duke", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Cassady","Stout", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Elijah","Bonner", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Kelly","Hunt", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Sopoline","Buchanan", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Serina","Farley", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Nissim","Mcfadden", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Hope","Burgess", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Avye","Calhoun", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Henry","Armstrong", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Joel","Grimes", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Wylie","Mann", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Alma","Cooley", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Lee","David", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Gil","Rush", 11, "res/Image/child-drawing.jpg");
		database.insertChild("Carter","Herrera", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Jena","Byers", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Logan","Jordan", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Lara","Stanton", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Casey","Mcgowan", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Amity","Reese", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Jaquelyn","Vaughan", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Aphrodite","Mcfarland", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Mannix","Larson", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Patrick","Roberson", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Quentin","Orr", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Destiny","Valenzuela", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Channing","Peterson", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Ivana","Hatfield", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Shelly","Harding", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Althea","Barnes", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Boris","Fitzpatrick", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Sonya","Collier", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Sebastian","Houston", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Beau","Stephenson", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Jenette","Richards", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Tate","Hooper", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Xena","Christensen", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Wyoming","Robertson", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Herman","Hernandez", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Brendan","Nixon", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Jermaine","Hester", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Raymond","Harmon", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Noel","Tillman", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Bell","Buckner", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Hermione","Rowe", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Lysandra","Mcfadden", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Seth","Battle", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Adrienne","Stevens", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Craig","Lynch", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Amena","Middleton", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Lester","Merritt", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Justin","Shields", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Keaton","Arnold", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Althea","Wood", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Hillary","Combs", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Channing","Howell", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Maite","Luna", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Reagan","Battle", 6, "res/Image/child-drawing.jpg");
		database.insertChild("Alfreda","Bright", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Henry","Roach", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Ruth","Malone", 7, "res/Image/child-drawing.jpg");
		database.insertChild("Malcolm","Roman", 10, "res/Image/child-drawing.jpg");
		database.insertChild("Nolan","Brady", 9, "res/Image/child-drawing.jpg");
		database.insertChild("Carol","Allen", 7, "res/Image/child-drawing.jpg");
		database.insertChild("April","Head", 8, "res/Image/child-drawing.jpg");
		database.insertChild("Cyrus","Schroeder", 11, "res/Image/child-drawing.jpg");
		database.insertChild("Briar","Meyers", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Leo","Durham", 11, "res/Image/child-drawing.jpg");
		database.insertChild("Penelope","Chapman", 12, "res/Image/child-drawing.jpg");
		database.insertChild("Penelope","Jones", 10,"res/Image/child-drawing.jpg");
		
		// INSERT EXERCISE
		database.insertProfessors(firstName, lastName, age, password, picture);
		
	}
		
	
		
	
	public static void main(String[] args){
		new Creation();
	}

}
