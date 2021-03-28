package model;

public class Employee {
	
	private String name;
	private String lastName;
	private String id;
	private Availability availability;
	
	public Employee(String n, String ln, String id, Availability avl) {
		name = n;
		lastName = ln;
		this.id = id;
		availability = avl;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	
	
}
