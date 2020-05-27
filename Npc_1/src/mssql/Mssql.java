package mssql;

import java.sql.*;
/**
 *
 * @author Admin
 */
public class Mssql {
    
    static public Connection connection = null;
    static String host = "127.0.0.1";
    static String port = "1433";
    static String database = "NPC";
    static String user = "marta";
    static String password = "12345";
 
    static String databaseURL = "jdbc:sqlserver://"+
                         host+"\\SQLEXPRESS:"+
                         port+";databaseName="+
                         database;

    //nawiązanie połączenia
    public static Connection createConnection(Connection connection) throws ClassNotFoundException, SQLException {
        //driver
        final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(driver);
        //Nawiązanie połączenia
        connection = DriverManager.getConnection(databaseURL, user, password);
        return connection;
    }
    
    public static ResultSet getData(String sqlQuery) throws ClassNotFoundException, SQLException {
        Statement statement = createConnection(connection).createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);
        return resultSet;
    }
    
    /*public static void setToDataBase(String base, String sqlQuery) throws ClassNotFoundException, SQLException {
       Statement statement = createConnection(connection).createStatement();
       statement.executeUpdate(base + sqlQuery);
       
 
        // the mysql insert statement
      String query = " INSERT INTO Person (name, surname, race, subrace, classes, alignment, age, atributes, skills, appearence, personality)"
        + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = createConnection(connection).prepareStatement(query);
      preparedStmt.setString (1, name);
      preparedStmt.setString (2, surname);
      preparedStmt.setString (3, race);
      preparedStmt.setString (4, subrace);
      preparedStmt.setString (5, classes);
      preparedStmt.setString (6, alignment);
      preparedStmt.setInt    (7, age);
      preparedStmt.setInt (2, atributes);

      // execute the preparedstatement
      preparedStmt.execute();
               }*/
    
    public static void closeConnection(Connection con, ResultSet rs) throws SQLException {
        rs.close();
        con.close();
    }
    
}
