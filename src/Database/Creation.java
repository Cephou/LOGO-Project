package Database;

public class Creation {

	private DatabaseObj database = new DatabaseObj();

	public Creation(){
		database.createTable("drop table if exists ACTION; create table ACTION ( "
				+ "ID_ACTION            int not null, "
				+ "ID_ASSAY             int not null, "
				+ "COMMAND_ACTION       varchar(50) not null,"
				+ "D_ACTION             varchar(50) not null,"
				+ "SPEED_ACTION         varchar(50) not null,"
				+ "TURTLE_ACTION        varchar(50) not null,"
				+ "primary key (ID_ACTION));");

		
		database.createTable("drop table if exists ASSAY;create table ASSAY("
				+ "ID_ASSAY             int not null,"
				+ "ID_CHILD             int not null,"
				+ "COMMENT_ASSAY        int not null,"
				+ "GRADE_ASSAY          varchar(300) not null,"
				+ "primary key (ID_ASSAY));");
		database.createTable("drop table if exists CHILD;create table CHILD("
				+ "ID_CHILD             int not null,"
				+ "NAME_CLASS           varchar(50),"
				+ "FIRSTNAME_CHILD      varchar(50) not null,"
				+ "LASTNAME_CHILD       varchar(50) not null,"
				+ "AGE_CHILD            int not null,"
				+ "PIC_CHILD            longblob not null,"
				+ "primary key (ID_CHILD));");
		
		database.insertChild("pierre", "HA", 20, "pierre.jpg");
	}
		
		
	
	public static void main(String[] args){
		new Creation();
	}

}
