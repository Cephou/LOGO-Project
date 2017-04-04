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
	}
	
	public static void main(String[] args){
		new Creation();
	}

}
