package oopProject2020.Controls;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oopProject2020.Models.user;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		String email = request.getParameter("email");
		String name = request.getParameter("Name");
		String address = request.getParameter("address");
		String contactNumber = request.getParameter("contactNumber");
		String RejNo = request.getParameter("rejNumber");
		String userType = request.getParameter("userType");	
		
		int type=-1;
		switch (userType) {
		case "Student":
		type =0;
		break;
		case "Driver" :
		
		type = 1;
		break;
		case "Employee":
		type =2;	
		break;
		}
		user us = new user(name,email,address,contactNumber,RejNo,type);

	}

}
