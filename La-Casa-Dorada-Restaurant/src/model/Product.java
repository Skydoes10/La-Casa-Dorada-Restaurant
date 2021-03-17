package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String name;
	private String type;
	private List<Ingredient> ingredients;
	private String size;
	private double price;
	
	public Product(String n, String t, String s, double p) {
		name = n;
		type = t;
		ingredients = new ArrayList<>();
		size = s;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
