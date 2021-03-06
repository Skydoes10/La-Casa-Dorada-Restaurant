package model;

public class User extends Employee {
	private static final long serialVersionUID = 1;
	
	private String username;
	private String password;
	
	public User(String n, String ln, String id, Availability avl, String u, String pw) {
		super(n, avl, id, ln);
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
