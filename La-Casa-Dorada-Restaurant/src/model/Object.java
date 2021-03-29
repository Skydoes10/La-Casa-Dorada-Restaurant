package model;

import java.io.Serializable;

public class Object implements Serializable{
	private static final long serialVersionUID = 1;
	
	private String name;
	private Availability availability;

	public Object(String name, Availability avl) {
		this.name = name;
		this.availability = avl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Availability getAvailability() {
		return availability;
	}

	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	
}
