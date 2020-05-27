package dataSource;

import java.sql.*;


public class MiastaUtil {
	
	public static void insert(String name, String country, int population) throws SQLException{
        try (Connection conn = MiastaConnectionProvider.getConnection();
             Statement stmt = conn.createStatement();){
        	int id = rowCount() + 1;
            String query = String
                    .format("INSERT INTO miasta(id, name, country, population) VALUES (%d, '%s', '%s', %d)",
                            id, name, country, population);
            stmt.executeUpdate(query);
        }
    }
	
	public static int rowCount() throws SQLException{
        try (Connection conn = MiastaConnectionProvider.getConnection();
             Statement stmt = conn.createStatement();){
            String query = String
                    .format("SELECT COUNT(*) FROM miasta");
            ResultSet rs = stmt.executeQuery(query); 
           if(rs.next()) return rs.getInt(1);      
           else return 0;
        }
    }
	
	public static void delete(String name) throws SQLException {
		
		String selectQuery = String.format("SELECT ID FROM miasta WHERE Name='%s'", name);
        try (Connection conn = MiastaConnectionProvider.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet resultSet = stmt.executeQuery(selectQuery);){
        	
            if (resultSet.next()) {
                String deleteQuery = String.format("DELETE FROM miasta WHERE ID=%d", resultSet.getInt(1));
                stmt.executeUpdate(deleteQuery);
            }
        }
		
	}
	
}
