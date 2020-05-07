package oopProject2020.Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnect;


public class user {
	
	
	public String userName;
	public String name;
	public String email;
	public String address;
	public String contactNumber;
	public String regNo;
	public int userType;
	public int userStatus;
	

	public user(String name, String email, String address, String contactNumber, String regNo, int userType) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		this.regNo = regNo;
		this.userType = userType;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}	
	
	public int insertUser()
	{
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.Connect();
		int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO userdetails (userName, name,email,address,contactNumber,regNo) VALUES ('"+this.userName +"','"+this.name+"','"+ this.email +"','"+this.address+"','"+this.contactNumber+"','"+this.regNo+"')";
			stmt.execute(sql);
			res =1;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = 0;
		}
		return res;
	}

}
