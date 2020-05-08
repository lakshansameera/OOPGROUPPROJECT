package oopProject2020.Controls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oopProject2020.Models.Vehicle;

/**
 * Servlet implementation class AddVehicle
 */
public class AddVehicle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVehicle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String VehicleType= request.getParameter("vehicleType");
		int numOfPassengers = Integer.parseInt(request.getParameter("noOfPessengers"));
		String RejNo = request.getParameter("rejNo");
		String VehicleStatus = request.getParameter("VehicleStatus");
		int status;
		if(VehicleStatus.equals("Available")){
				status =0;
			}
		else
			{
			status =1;
			}
		
		Vehicle vehicle = new Vehicle(RejNo, VehicleType,numOfPassengers, status);
		vehicle.insertVehicle();
	}
		

}
