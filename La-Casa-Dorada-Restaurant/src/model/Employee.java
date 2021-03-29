package model;

public class Employee extends Object{

	private String lastName;
	private String id;
	
	public Employee(String name, Availability avl, String ln, String id) {
		super(name, avl);
		lastName = ln;
		this.id = id;
	}
	
//	public Employee(String n, String ln, String id, Availability avl) {
//		name = n;
//		lastName = ln;
//		this.id = id;
//		availability = avl;
//	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
