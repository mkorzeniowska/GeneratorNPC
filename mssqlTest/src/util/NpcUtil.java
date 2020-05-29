/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import dataSource.NpcConProvider;
import java.util.ArrayList;
import javax.swing.JComboBox;
import model.Person;

/**
 *
 * @author Grzegorz
 */
public class NpcUtil {
    
    //wartości tymczasowe, pod comboBox, czy to jest tu naprawdę potrzebne?
    public static String sex, name, surname, race, subrace, classes, appearence;
    public static String alignment, age;
    public static int ac, hp, speed;
    public static String formatedQuery;
    public static ArrayList<String> rows;
    
    

    //randomCharacter trzeba wynieść do NpcUtil i dopasować pod obiekt Person
    public static Person randomCharacter() throws SQLException{
        Person p = new Person();
        if("Random".equals(NpcUtil.race)){
            p.setRace(NpcUtil.getDbString("rasa","Rasa"));}
        if("Random".equals(NpcUtil.subrace)) {
                p.setSubrace(NpcUtil.getDbStringForSubraces("podrasa","Podrasa"));}
        if("Random".equals(NpcUtil.classes)){
                p.setJob(NpcUtil.getDbString("klasa","Klasa"));}
        if ("Random".equals(NpcUtil.alignment)) {
                p.setCharacter(NpcUtil.getDbStringForAlignment("charakter","Charakter"));}
        if ("Random".equals(NpcUtil.age)) {
                p.setAge(NpcUtil.getDbString("wiek","Wiek"));}
            

        NpcUtil.setRandAttr(p);	//metoda ustalajaca atrybuty
        NpcUtil.generateAppearence(p); //metoda ustalajaca wyglad
        NpcUtil.generateName(p);
        NpcUtil.generateSurname(p);
        NpcUtil.generatePersonality(p);
        NpcUtil.generateSkills(p);
	p.printAll();
        return p;
    }

        //pobiera z podanej bazy i zadanej kolumny nazwy wierszy
    public static void getDbRows(String colName, String tableName, JComboBox c) {         
	String output = null;
        String selectQuery = String.format("SELECT %s  FROM %s",colName, tableName);
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                     while (rs.next()) {
                        output = rs.getString(1);
                        c.addItem(output);
                        }
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }   
            catch (SQLException e) {}
           
	}
    
        public static void getDbRowsForSubrace(String colName, String tableName, JComboBox c)  {         
	String output = null;
        String selectQuery = String.format("SELECT p.podrasa FROM Podrasa AS p, "
                    + "Rasa AS r WHERE p.rasaID=r.rasaID AND r.rasa='%s'", NpcUtil.race);
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                     while (rs.next()) {
                        output = rs.getString(1);
                        c.addItem(output);
                        }
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }   
             catch (SQLException e) {}
          
	}
    public static void getDbRowsForAlignment(String colName, String tableName, JComboBox c)  {         
	String output = null;
        String selectQuery = String.format("SELECT c.charakter\n" +
                                             "FROM Charakter c\n" +
                                             "JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID \n" +
                                             "JOIN Rasa r ON cr.rasaID=r.rasaID\n" +
                                             "WHERE r.rasa='%s' " , NpcUtil.race);
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                     while (rs.next()) {
                        output = rs.getString(1);
                        c.addItem(output);
                        }
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }   
             catch (SQLException e) {}
           
	}
    //pobiera z podanej bazy i zadanej kolumny string 
    public static String getDbString(String colName, String tableName) {         
	String output = null;
        String selectQuery = String.format("SELECT TOP 1 %s  FROM %s ORDER BY NEWID()",colName, tableName);
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                    if (rs.next()) output = rs.getString(1); 
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }
            catch (SQLException e) {}
		return output;
            
	}
    
    public static String getDbStringForSubraces(String colName, String tableName)  {         
	String output = null;
        String selectQuery = String.format("SELECT TOP 1 p.podrasa FROM Rasa r\n" +
                "JOIN  Podrasa p ON p.rasaID=r.rasaID\n" +
                "WHERE r.rasa='%s' ORDER BY NEWID()",race);
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                    if (rs.next()) output = rs.getString(1); 
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }
            catch (SQLException e) {}
		return output;
	}
	
        public static String getDbStringForAlignment(String colName, String tableName) throws SQLException {         
	String output = null;
        String selectQuery = String.format("SELECT TOP 1 c.charakter FROM Charakter c\n" +
                    "JOIN Charakter_Rasy cr ON c.charakterID=cr.charakterID \n" +
                    "JOIN Rasa r ON cr.rasaID=r.rasaID\n" +
                    "WHERE r.rasa='%s' \n" +
                    "ORDER BY NEWID()",race );
            try (Connection conn = NpcConProvider.getConnection();
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(selectQuery);){
				

                    if (rs.next()) output = rs.getString(1); 
	        	 
	        rs.close();
	        stmt.close();
	        conn.close();  
	        }
		return output;
	}
	  //ustawia zestaw atrybutow dla danego id zestawu
	public static void setRandAttr(Person person) throws SQLException {        
		
		String selectQuery = String.format(
				"SELECT TOP 1 sila, kondycja, zrecznosc, inteligencja, madrosc, charyzma  FROM Atrybuty ORDER BY NEWID()");
		try (Connection conn = NpcConProvider.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectQuery);){

	        	 if (rs.next()) {
	        		 person.setStrength(rs.getInt(1));
	        		 person.setDexterity(rs.getInt(2));
	        		 person.setConstitution(rs.getInt(3));
	        		 person.setIntelligence(rs.getInt(4));
	        		 person.setWisdom(rs.getInt(5));
	        		 person.setCharisma(rs.getInt(6));
	        	 }
	        	 
	        	 //System.out.println(dbName); 		//to wyrzuca na konsole wynik
	        	 
	        	 rs.close();
	             stmt.close();
	             conn.close();  
	        }
	}
        
    public static void generateAppearence(Person p) throws SQLException{

            /*formatedQuery = String.format("  SELECT TOP 1 w.wyglad FROM Wyglad w" +
            "JOIN Rasa r ON r.rasaID=w.rasaID" +
            "JOIN Podrasa p ON p.podrasaID=w.podrasaID" +
            "JOIN Plec pl ON pl.plecID=w.plecID" +
            "JOIN Wiek wi ON wi.wiekID=w.wiekID" +
            "WHERE rasa='%s' AND plec='%s'", race, sex);*/
            p.setApperance(NpcUtil.getDbString("wyglad","Wyglad"));
    }
    public static void generateName(Person p) throws SQLException{

        /*formatedQuery = String.format("SELECT TOP 1 i.imie FROM Imiona i\n" +
                                           "JOIN Rasa r ON i.rasaID=r.rasaID\n" +
                                           "JOIN Plec p ON p.plecID=i.plecID\n" +
                                           "WHERE r.rasa='Elf' AND p.plec='Kobieta'\n" +
                                            "ORDER BY NEWID()", race, sex);*/
        p.setName(NpcUtil.getDbString("imie","Imiona"));
    }
    public static void generateSurname(Person p) throws SQLException{
        /*formatedQuery = String.format("SELECT TOP 1 n.nazwisko FROM Nazwiska n JOIN Rasa r ON n.rasaID=r.rasaID\n" +
                                        "WHERE r.rasa='%s' ORDER BY NEWID()", race);*/
        p.setSurname(NpcUtil.getDbString("nazwisko","Nazwiska"));
    }
    
    public static void generatePersonality(Person p) throws SQLException {
        //formatedQuery = "SELECT TOP 1 cecha FROM Osobowosc ORDER BY NEWID()";
        p.setPersonality(NpcUtil.getDbString("cecha","Osobowosc"));
    }
    
    public static void generateSkills(Person p) throws SQLException {
        if("Krasnolud".equals(p.getRace()) || "Gnom".equals(p.getRace()) || "Elf".equals(p.getRace()) || "Niziołek".equals(p.getRace()) ) {
                //formatedQuery = "SELECT TOP 1 u.umiejetnosc FROM Umiejetnosci ORDER BY NEWID()";
                p.setSkill(NpcUtil.getDbString("u.umiejetnosc", "Umiejetnosci"));}
        else {
                //formatedQuery = "SELECT TOP 1 umiejetnosc FROM Umiejetnosci ORDER BY NEWID()";
                p.setSkill(NpcUtil.getDbString("u.umiejetnosc", "Umiejetnosci"));}
    }
    
}
