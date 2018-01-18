package id.ac.amikom.day04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AksesDBJamanOld {
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dvddb";
		String username = "java";
		String password = "java";
		String query = "SELECT * FROM DVDItem";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, username, password);
			st = conn.createStatement();
			rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getString("title"));
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
