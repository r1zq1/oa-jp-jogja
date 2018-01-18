package id.ac.amikom.day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AksesDB2 {
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dvddb";
		String username = "java";
		String password = "java";
		String query = "SELECT * FROM DVDItem";
		String insert = 
			"INSERT INTO DVDItem VALUES('Doraemon',2000,'Cartoon')";
		try (
			Connection conn = 
				DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();
//			ResultSet rs = st.executeQuery(query);
		) {
			st.executeUpdate(insert);
//			while(rs.next()) {
//				System.out.println(rs.getString("title"));
//			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}