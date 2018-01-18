package com.dvdlibrary.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dvdlibrary.domain.DVDItem;
import com.dvdlibrary.domain.Genre;

public class AccessDB {
	public static void main(String[] args) {
		String url = "jdbc:derby://localhost:1527/dvd";
		String user = "java";
		String password = "java";
		String query = "SELECT * FROM DVDItem";
		List<DVDItem> dvds = new ArrayList<>();
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
				DVDItem item = 
						new DVDItem(title, 
								Genre.valueOf(genre.toUpperCase()), 
								year);
				dvds.add(item);
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		if(!dvds.isEmpty()) {
			for(DVDItem dvd : dvds) {
				System.out.print(dvd);
			}
		}
	}
}