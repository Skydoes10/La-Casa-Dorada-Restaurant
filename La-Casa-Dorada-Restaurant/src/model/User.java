package model;

public class User extends Employee {

	private String username;
	private String password;
	
	public User(String n, String ln, int id, String u, String pw) {
		super(n, ln, id);
		username = u;
		password = pw;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
