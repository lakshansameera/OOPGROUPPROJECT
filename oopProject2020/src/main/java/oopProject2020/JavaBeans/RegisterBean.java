package oopProject2020.JavaBeans;

import oopProject2020.Models.uswerDatabase;

public class RegisterBean {

	private String username;
	private String email;
	private String password;
	private String studentnumber;
	uswerDatabase db = new uswerDatabase();
	
	
	public RegisterBean(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;

	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentnumber() {
		return studentnumber;
	}
	public void setStudentnumber(String studentnumber) {
		this.studentnumber = studentnumber;
	}
	public int registerUser()
	{
		db.insertData("Insert in to (userName,password,userType,status) values ('"+ getUsername()+"','"+ getPassword()+"','"+ 0+"','"+ 1+"',)");
		return 0;
	}

}
