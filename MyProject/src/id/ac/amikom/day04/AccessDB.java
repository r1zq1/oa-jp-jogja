package id.ac.amikom.day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessDB {
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dvd";
		String user = "java";
		String password = "java";
		String query = "SELECT * FROM DVDItem";
		try (
			Connection conn = 
				DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
		) {
			while(rs.next()) {
				String title = rs.getString("title");
				int year = rs.getInt("tahun");
				String genre = rs.getString("genre");				
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	}
}