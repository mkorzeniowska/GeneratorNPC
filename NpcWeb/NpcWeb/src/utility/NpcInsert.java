package utility;

import java.sql.*;

import dataSource.NpcConProvider;
import model.Person;

public class NpcInsert {
	
	private static String CREATE = String.format(
"INSERT [dbo].[Person] ([personID], [plec], [imie], [nazwisko], [rasa], [podrasa], [klasa], [charakter], [sila], [kondycja], [zrecznosc], [inteligencja], [madrosc], [charyzma], [wyglad], [osobowosc])"
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	
	public static void insertPerson(Person p) throws SQLException { 
		
		try (Connection conn = NpcConProvider.getConnection();
	          PreparedStatement prepStmt = conn.prepareStatement(CREATE)) {
			
			 	prepStmt.setInt(1,p.getId());
			
			 	prepStmt.setString(2, p.getSex());
			 	prepStmt.setString(3, p.getName());
			 	prepStmt.setString(4, p.getSurname());
			 	prepStmt.setString(5, p.getRace());
			 	prepStmt.setString(6, p.getSubrace());
			 	prepStmt.setString(7, p.getJob());
			 	prepStmt.setString(8, p.getCharacter());
			 	
			 	prepStmt.setInt(9,p.getStrength());
			 	prepStmt.setInt(10,p.getConstitution());
			 	prepStmt.setInt(11,p.getDexterity());
			 	prepStmt.setInt(12,p.getIntelligence());
			 	prepStmt.setInt(13,p.getWisdom());
			 	prepStmt.setInt(14,p.getCharisma());
			
			 	prepStmt.setString(15, p.getApperance());
			 	prepStmt.setString(16, p.getPersonality()); 
			 	
	            prepStmt.executeUpdate();
	           
	             conn.close();  
	             }
	}
}

// pierwotnie dałbym tak:
//		+ "VALUES (%d, '%s', '%s',  '%s', '%s',  '%s', '%s',  '%s', %d, %d, %d, %d, %d, %d, '%s',  '%s)",
