package model;

import java.util.ArrayList;

public class Product extends Object{
	
	private ProductType type;
	private ArrayList<Ingredient> ingredients;
	private String size;
	private int price;
	
	public Product(String name, Availability availability, ProductType type, ArrayList<Ingredient> ingredients, String size, int price) {
		super(name, availability);
		this.type = type;
		this.ingredients = ingredients;
		this.size = size;
		this.price = price;
	}

	public ProductType getType() {
		return type;
	}

	public void setType(ProductType type) {
		this.type = type;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
