package model;

public class Client extends Object{
	private static final long serialVersionUID = 1;
	
	private String lastName;
	private String address;
	private String id;
	private String phone;
	private String comments;

	public Client(String name, Availability avl, String ln, String a, String id, String p, String com) {
		super(name, avl);
		this.lastName = ln;
		this.address = a;
		this.id = id;
		this.phone = p;
		comments = com;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
