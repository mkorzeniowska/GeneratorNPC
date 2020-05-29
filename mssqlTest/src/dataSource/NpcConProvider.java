/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSource;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Grzegorz
 */
public class NpcConProvider {
    static Connection connection = null;
    static String host = "127.0.0.1";
    static String port = "1433";
    static String database = "NPC";
    static String DB_USER = "adm";
    static String DB_PASSWD = "1234";

    static String DB_URL = "jdbc:sqlserver://"+
                         host+"\\SQLEXPRESS:"+
                         port+";databaseName="+
                         database;
   
    public static Connection getConnection() throws SQLException{
         
        try{
            connection=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
        } catch(SQLException ex)
        { 
            ex.printStackTrace();
        }
        return connection;
    }
   
}
