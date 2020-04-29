package oopProject2020.JavaBeans;

public class RegisterBean {

	private String username;
	private String email;
	private String password;
	private String studentnumber;
	
	
	public RegisterBean(String username, String email, String password, String studentnumber) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.studentnumber = studentnumber;
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
	
		
}
