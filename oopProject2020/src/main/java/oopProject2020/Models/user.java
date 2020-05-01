package oopProject2020.Models;

public abstract class user {
	
	private  String userName;
	private  String password;
	private int userType;
	private int userstatus;
	
	//public abstract int login(String username, String password);
	
	public abstract int logout();
	
	public abstract int changestatus();
	
	public abstract int changeUserDetaisl();
	
	

}
