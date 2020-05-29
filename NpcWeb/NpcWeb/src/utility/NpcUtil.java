package utility;
import java.sql.*;

import dataSource.NpcConProvider;
import model.Person;


public class NpcUtil {
	
	//generuje w pełni losową osobę
	public static Person generateRandom() throws SQLException{
		Person p = new Person();
		// ustalanie ilosci wierszy w kazdej z tabel
		// rozwiązanie nieoptymalne - losowy wybor można załątwić jednym zapytaniem
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
		
		NpcUtil.setRandAttr(p);	//metoda ustalajaca atrybuty
		//System.out.println(getRowsOf("[Umiejetnosci_Klasa]"));
		//p.printAll();
		
		return p;
	
	}
	
	  //ustawia zestaw atrybutow dla danego id zestawu
	public static void setRandAttr(Person person) throws SQLException {        
		
		String selectQuery = String.format(
				"SELECT TOP 1 sila, kondycja, zrecznosc, inteligencja, madrosc, charyzma  FROM Atrybuty ORDER BY NEWID()");
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
	
	//metoda zwracajaca wielkość tabeli
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
	
	 //pobiera z podanej bazy i zadanej kolumny string o zadanym id
	public static String getDbString(String colName, String tableName,String idColName, int id) throws SQLException {         
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

//metoda testowa - drukuje zadaną tablicę
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
