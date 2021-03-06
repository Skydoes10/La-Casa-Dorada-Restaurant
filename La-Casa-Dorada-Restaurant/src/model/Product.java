package model;

import java.util.ArrayList;

public class Product extends Object{
	private static final long serialVersionUID = 1;
	
	private String type;
	private ArrayList<String> ingredients;
	private ArrayList<Size> size;
	private ArrayList<Integer> prices;
	
	public Product(String name, Availability availability, String type, ArrayList<String> ingredients, ArrayList<Size> size, ArrayList<Integer> prices) {
		super(name, availability);
		this.type = type;
		ingredients = new ArrayList<String>();
		size = new ArrayList<Size>();
		prices = new ArrayList<Integer>();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}

	public ArrayList<Size> getSize() {
		return size;
	}

	public void setSize(ArrayList<Size> size) {
		this.size = size;
	}

	public ArrayList<Integer> getPrices() {
		return prices;
	}

	public void setPrices(ArrayList<Integer> prices) {
		this.prices = prices;
	}

	
	
	
	
}
