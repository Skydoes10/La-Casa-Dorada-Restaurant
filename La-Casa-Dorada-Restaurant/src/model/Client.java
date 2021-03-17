package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String name;
	private String lastName;
	private String address;
	private int id;
	private int phone;
	private List<String> comments;
	
	public Client(String n, String ln, String a, int id, int p) {
		name = n;
		lastName = ln;
		address = a;
		this.id = id;
		phone = p;
		comments = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
}
