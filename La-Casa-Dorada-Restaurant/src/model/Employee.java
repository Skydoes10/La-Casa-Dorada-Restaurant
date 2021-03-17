package model;

public class Employee {
	
	private String name;
	private String lastName;
	private int id;
	
	public Employee(String n, String ln, int id) {
		name = n;
		lastName = ln;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
