package model;

import java.util.ArrayList;

public class Product extends Object{
	
	private ProductType type;
	private ArrayList<Ingredient> ingredients;
	private Size size;
	private ArrayList<Integer> prices;
	
	public Product(String name, Availability availability, ProductType type, ArrayList<Ingredient> ingredients, Size size, ArrayList<Integer> prices) {
		super(name, availability);
		this.type = type;
		this.ingredients = ingredients;
		this.size = size;
		prices = new ArrayList<Integer>();
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

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public ArrayList<Integer> getPrices() {
		return prices;
	}

	public void setPrices(ArrayList<Integer> prices) {
		this.prices = prices;
	}

	
	
	
	
}
