package model;

public class Employee extends Object{
	private static final long serialVersionUID = 1;
	
	private String lastName;
	private String id;
	
	public Employee(String name, Availability avl, String ln, String id) {
		super(name, avl);
		lastName = ln;
		this.id = id;
	}

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
