package oopProject2020.Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnect;



public class Vehicle {
	
	
	private String VehicleregNo;
	private String VehicleType;
	private int noOfPassengers;
	private int vehicleStatus; //weather vehicle is in a running condition
	
	public Vehicle(String vehicleregNo, String vehicleType, int noOfPassengers, int vehicleStatus) {
		super();
		VehicleregNo = vehicleregNo;
		VehicleType = vehicleType;
		this.noOfPassengers = noOfPassengers;
		this.vehicleStatus = vehicleStatus;
	}
	public String getVehicleregNo() {
		return VehicleregNo;
	}
	public void setVehicleregNo(String vehicleregNo) {
		VehicleregNo = vehicleregNo;
	}
	public String getVehicleType() {
		return VehicleType;
	}
	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public int getVehicleStatus() {
		return vehicleStatus;
	}
	public void setVehicleStatus(int vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}
	
	public void insertVehicle()
	{
		
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.Connect();
		//int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO vehicles (vehicleNo,VehicleType,noOfPassengers,vehicleStatus) VALUES ('"+getVehicleregNo() +"','"+getVehicleType()+"','"+getNoOfPassengers() +"','"+this.getVehicleStatus()+"')";
			stmt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public void notifyBreakDown()
	{
		if (getVehicleStatus()==0)
		{
			setVehicleStatus(1);
		}
		else 
		{
			setVehicleStatus(0);
		}
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.Connect();
		//int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="UPDATE vehicles SET  vehicleStatus='"+ getVehicleStatus() +"' WHERE vehicleNo = '"+ getVehicleregNo()+"'";
			stmt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
}
