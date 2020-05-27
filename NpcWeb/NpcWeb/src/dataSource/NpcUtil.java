package dataSource;
import java.sql.*;

import model.Person;
import utility.RandomInt;


public class NpcUtil {
	
	
	public static Person generateRandom() throws SQLException{
		Person p = new Person();
		// ustalanie ilosci wierszy w kazdej z tabael
		int nameTsize =getRowsOf("Imiona");
		int sexTsize =getRowsOf("Plec");
		int raceTsize =getRowsOf("Rasa");
		int subraceTsize =getRowsOf("Podrasa");
		int surnameTsize =getRowsOf("Nazwiska");
		int jobTsize =getRowsOf("Klasa");
		int appreranceTsize =getRowsOf("Wyglad");
		int ageTsize =getRowsOf("Wiek");
		int skillTsize =getRowsOf("Umiejetnosci");
		int personalityTsize =getRowsOf("Osobowosc");
		int characterTsize =getRowsOf("Charakter");
		
		//ustawianie pobieranie i ustawanie atrubutow dla odpowiednich tabel - losowanie id: od 1 do tabela.size()
		p.setSex(NpcUtil.getDbString("plec","Plec","plecID",RandomInt.rand(1,sexTsize)));				
		p.setRace(NpcUtil.getDbString("rasa","Rasa","rasaID",RandomInt.rand(1,raceTsize)));
		p.setSubrace(NpcUtil.getDbString("podrasa","Podrasa","podrasaID",RandomInt.rand(1,subraceTsize)));
		p.setName(NpcUtil.getDbString("imie","Imiona","imieID",RandomInt.rand(2,nameTsize)));
		p.setSurname(NpcUtil.getDbString("nazwisko","Nazwiska","nazwiskoID",RandomInt.rand(1,surnameTsize)));
		p.setJob(NpcUtil.getDbString("klasa","Klasa","klasaID",RandomInt.rand(1,jobTsize)));
		p.setApperance(NpcUtil.getDbString("wyglad","Wyglad","wygladID",RandomInt.rand(1,appreranceTsize)));
		p.setAge(NpcUtil.getDbString("wiek","Wiek","wiekID",RandomInt.rand(1,ageTsize)));
		p.setSkill(NpcUtil.getDbString("umiejetnosc","Umiejetnosci","umiejetnoscID",RandomInt.rand(1,skillTsize))); //numeracja ID tabeli troche urwana od id 44
		p.setPersonality(NpcUtil.getDbString("cecha","Osobowosc","osobowoscID",RandomInt.rand(1,personalityTsize)));
		p.setCharacter(NpcUtil.getDbString("charakter","Charakter","charakterID",RandomInt.rand(1,characterTsize)));
		
		NpcUtil.setAttr(p,RandomInt.rand(1,20));	//metoda ustalajaca atrybuty
		
		p.printAll();
		
		return p;
	
	}
	
	
	public static void setAttr(Person person, int id) throws SQLException {          //ustawia zestaw atrybutow dla danego id zestawu
		
		String selectQuery = String.format("SELECT *  FROM Atrybuty WHERE atrybutID=%d", id);
		try (Connection conn = NpcConProvider.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery);){

	        	 if (rs.next()) {
	        		 person.setStrength(rs.getInt(2));
	        		 person.setDexterity(rs.getInt(3));
	        		 person.setConstitution(rs.getInt(4));
	        		 person.setIntelligence(rs.getInt(5));
	        		 person.setWisdom(rs.getInt(6));
	        		 person.setCharisma(rs.getInt(7));
	        	 }
	        	 
	        	 //System.out.println(dbName); 		//to wyrzuca na konsole wynik
	        	 
	        	 rs.close();
	             stmt.close();
	             conn.close();  
	        }
	}
	public static int getRowsOf(String tableName) throws SQLException { 
		int tableSize = 0;
		String selectQuery = String.format("SELECT COUNT(*) FROM %s", tableName);
		try (Connection conn = NpcConProvider.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery);){

	        	 if (rs.next()) tableSize = rs.getInt(1);
	        	 
	        	 //System.out.println(dbName); 		//to wyrzuca na konsole wynik 
	        	 rs.close();
	             stmt.close();
	             conn.close();  
	        }
		return tableSize;
	}
	public static String getDbString(String colName, String tableName,String idColName, int id) throws SQLException {          //pobiera z podanej bazy i zadanej kolumny string o zadanym id
		String output = null;
		String selectQuery = String.format("SELECT %s  FROM %s WHERE %s=%d",colName, tableName,idColName, id);
		try (Connection conn = NpcConProvider.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery);){
				

	        	 if (rs.next()) output = rs.getString(1); 
	        	 
	        	 //System.out.println(dbName); 		//to wyrzuca na konsole wynik
	        	 
	        	 rs.close();
	             stmt.close();
	             conn.close();  
	        }
		
		return output;
	}
	
	public static String getName(int nameID) throws SQLException {          //pobiera z bazy imion te o zadanym id
		String dbName = null;
		String selectQuery = String.format("SELECT imie FROM Imiona WHERE imieID=%d",nameID);
		try (Connection conn = NpcConProvider.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery);){

	        	 if (rs.next()) dbName = rs.getString(1); 
	        	 
	        	 //System.out.println(dbName); 		//to wyrzuca na konsole wynik
	        	 
	        	 rs.close();
	             stmt.close();
	             conn.close();  
	        }
		
		return dbName;
	}

	public static void show() throws SQLException {
		
		String selectQuery = String.format("SELECT * FROM rasa");
		
        try (Connection conn = NpcConProvider.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery);){
        	
        	 ResultSetMetaData rsmd = rs.getMetaData();
        	 int columnsNumber = rsmd.getColumnCount(); 

        	 while (rs.next()) {
        		//Print one row          
        		for(int i = 1 ; i <= columnsNumber; i++) 	System.out.print(rs.getString(i) + " "); 
        																		System.out.println();
        		    }
        	 rs.close();
             stmt.close();
             conn.close();  
        }
        
        
		
	}

	public static void show(String tableName) throws SQLException {
		
		String selectQuery = String.format("SELECT * FROM %s",tableName);
		
        try (Connection conn = NpcConProvider.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(selectQuery);){
        	
        	 ResultSetMetaData rsmd = rs.getMetaData();
        	 int columnsNumber = rsmd.getColumnCount(); 

        	 while (rs.next()) {
        		//Print one row          
        		for(int i = 1 ; i <= columnsNumber; i++)  	System.out.print(rs.getString(i) + " ");  
        																		System.out.println();        
        	 	}
            rs.close();
            stmt.close();
            conn.close();
        }	
	}
}
