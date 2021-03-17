package model;

public class User extends Employee {

	private String password;
	
	public User(String n, String ln, int id, String pw) {
		super(n, ln, id);
		password = pw;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
