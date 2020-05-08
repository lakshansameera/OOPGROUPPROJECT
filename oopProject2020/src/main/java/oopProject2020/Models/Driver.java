package oopProject2020.Models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.util.DBConnect;

public class Driver extends user{

	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void checkTrips()
	{
		
		
	}
	

	/**public void asignTrip()
	{
		DBConnect dbConnect = new DBConnect();
		Connection con = dbConnect.Connect();
		//int res=0;//return 0 whrn data is not fetched
		try {
			Statement stmt = con.createStatement();
			String sql ="INSERT INTO vehiclebookings (userName,Fromdate,Todate,	fromTime,ToTime	,VehicleReg,DriverId) VALUES ('"+getVehicleregNo() +"','"+getVehicleType()+"','"+getNoOfPassengers() +"','"+this.getVehicleStatus()+"')";
			stmt.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}**/
}
