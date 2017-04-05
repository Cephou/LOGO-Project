package Database;

public class Creation {

	private DatabaseObj database = new DatabaseObj();

	public Creation(){
		
		// Creation of table ACTION
		database.sqlQuery("drop table if exists ACTION; create table ACTION ( "
				+ "ID_ACTION            INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "ID_ASSAY             int not null, "
				+ "COMMAND_ACTION       varchar(50) not null,"
				+ "COLOR_ACTION             varchar(50) not null,"
				+ "SPEED_ACTION         int varchar(50) not null,"
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
		
		// INSERT CHILD	(X100)
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
		// INSERT PROFESSORS (X4)
		database.insertProfessors("Sophia", "Aguirre", 53,"PNJ05VMZ4AK","res/Image/child-drawing.jpg");
		database.insertProfessors("Sasha", "Guerrero", 37,"MIJ36RWS5AL","res/Image/child-drawing.jpg");
		database.insertProfessors("Oren", "Woodward", 29,"VBE00ZCV2KW","res/Image/child-drawing.jpg");
		database.insertProfessors("Whoopi", "Lester", 23,"QPG61FUR7EE","res/Image/child-drawing.jpg");
		
		// INSERT EXERCICE (X40)
		
		database.insertExercise("Exercice1", "mi fringilla mi lacinia mattis. Integer eu lacus. Quisque imperdiet,","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice2", "lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus nisi.","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice3", "In ornare sagittis felis. Donec tempor, est ac mattis semper,","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice4", "nibh dolor, nonummy ac, feugiat non, lobortis quis, pede. Suspendisse","res/Image/child-drawing.jpg", "normal");
		database.insertExercise("Exercice5", "id magna et ipsum cursus vestibulum. Mauris magna. Duis dignissim", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice6", "vulputate mauris sagittis placerat. Cras dictum ultricies ligula. Nullam enim.","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice7", "posuere, enim nisl elementum purus, accumsan interdum libero dui nec", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice8", "convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice9", "mauris sapien, cursus in, hendrerit consectetuer, cursus et, magna. Praesent", "res/Image/child-drawing.jpg","couleur");
		database.insertExercise("Exercice10", "auctor, velit eget laoreet posuere, enim nisl elementum purus, accumsan","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice1", "magna. Praesent interdum ligula eu enim. Etiam imperdiet dictum magna.", "res/Image/child-drawing.jpg","normal");
		database.insertExercise("Exercice2", "mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a,","res/Image/child-drawing.jpg" ,"vitesse");
		database.insertExercise("Exercice3", "mi fringilla mi lacinia mattis. Integer eu lacus. Quisque imperdiet,","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice4", "lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus nisi.","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice5", "In ornare sagittis felis. Donec tempor, est ac mattis semper,","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice6", "nibh dolor, nonummy ac, feugiat non, lobortis quis, pede. Suspendisse","res/Image/child-drawing.jpg", "normal");
		database.insertExercise("Exercice7", "id magna et ipsum cursus vestibulum. Mauris magna. Duis dignissim", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice8", "vulputate mauris sagittis placerat. Cras dictum ultricies ligula. Nullam enim.","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice9", "posuere, enim nisl elementum purus, accumsan interdum libero dui nec", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice10", "convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice1", "mauris sapien, cursus in, hendrerit consectetuer, cursus et, magna. Praesent", "res/Image/child-drawing.jpg","couleur");
		database.insertExercise("Exercice2", "auctor, velit eget laoreet posuere, enim nisl elementum purus, accumsan","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice3", "magna. Praesent interdum ligula eu enim. Etiam imperdiet dictum magna.", "res/Image/child-drawing.jpg","normal");
		database.insertExercise("Exercice4", "mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a,","res/Image/child-drawing.jpg" ,"vitesse");
		database.insertExercise("Exercice5", "mi fringilla mi lacinia mattis. Integer eu lacus. Quisque imperdiet,","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice6", "lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus nisi.","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice7", "In ornare sagittis felis. Donec tempor, est ac mattis semper,","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice8", "nibh dolor, nonummy ac, feugiat non, lobortis quis, pede. Suspendisse","res/Image/child-drawing.jpg", "normal");
		database.insertExercise("Exercice9", "id magna et ipsum cursus vestibulum. Mauris magna. Duis dignissim", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice10", "vulputate mauris sagittis placerat. Cras dictum ultricies ligula. Nullam enim.","res/Image/child-drawing.jpg", "couleur"); 
		database.insertExercise("Exercice1", "posuere, enim nisl elementum purus, accumsan interdum libero dui nec", "res/Image/child-drawing.jpg","vitesse");
		database.insertExercise("Exercice2", "convallis ligula. Donec luctus aliquet odio. Etiam ligula tortor, dictum","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice3", "mauris sapien, cursus in, hendrerit consectetuer, cursus et, magna. Praesent", "res/Image/child-drawing.jpg","couleur");
		database.insertExercise("Exercice4", "auctor, velit eget laoreet posuere, enim nisl elementum purus, accumsan","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice5", "magna. Praesent interdum ligula eu enim. Etiam imperdiet dictum magna.", "res/Image/child-drawing.jpg","normal");
		database.insertExercise("Exercice6", "mauris. Integer sem elit, pharetra ut, pharetra sed, hendrerit a,","res/Image/child-drawing.jpg" ,"vitesse");
		database.insertExercise("Exercice7", "mi fringilla mi lacinia mattis. Integer eu lacus. Quisque imperdiet,","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice8", "lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus nisi.","res/Image/child-drawing.jpg", "vitesse");
		database.insertExercise("Exercice9", "In ornare sagittis felis. Donec tempor, est ac mattis semper,","res/Image/child-drawing.jpg", "couleur");
		database.insertExercise("Exercice10", "nibh dolor, nonummy ac, feugiat non, lobortis quis, pede. Suspendisse","res/Image/child-drawing.jpg", "normal");
		
		// INSERT CLASS
		database.insertSchoolClass("CE1");
		database.insertSchoolClass("CE2");
		database.insertSchoolClass("CM1");
		database.insertSchoolClass("CM2");
		
	}
		
	
		
	
	public static void main(String[] args){
		new Creation();
	}

}
