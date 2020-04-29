package oopProject2020.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	Connection con = null;
	
	public Connection getCon()
	{
		try {
			Class.forName("mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/oopproject","root","");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
}
