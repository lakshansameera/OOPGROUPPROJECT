package oopProject2020.Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class uswerDatabase {

	public void insertDate(String query)
	{
		DataBase db = new DataBase();
		Connection con = db.getCon();
		Statement stat;
		try {
			stat = con.createStatement();
			stat.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
