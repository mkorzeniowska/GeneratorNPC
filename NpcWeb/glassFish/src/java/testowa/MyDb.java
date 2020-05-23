package testowa;





import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz
 */
public class MyDb {
    Connection con=null;
    String host = "127.0.0.1";
    String port = "1433";
    String database = "Cities";
    String user = "adm";
    String password = "1234";

    String databaseURL = "jdbc:sqlserver://"+
                         host+"\\SQLEXPRESS:"+
                         port+";databaseName="+
                         database;
    public Connection getCon()
    {
      try {
        final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(driver);
        DriverManager.getConnection(databaseURL, user, password);
      }
     catch (Exception e) {
        //Gdyby coś poszło nie tak, wydrukuj komunikat...
        System.out.println(e.getMessage());
    }
      try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      return con;
    }
    
}
