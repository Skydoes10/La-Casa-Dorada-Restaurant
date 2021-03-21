package model;

import java.util.ArrayList;

public class LaCasaDorada {
	
	private ArrayList<Product> products;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<ProductType> pType;

	
	public LaCasaDorada() {
		products = new ArrayList<Product>();
	}
	
	public String addProduct(String name, ProductType type, String size, int price) {
		String message = "Product added";
		Product product = new Product(name, type, ingredients, size, price);
		products.add(product);
		return message;
	}
	
	public String addIngredient(String name) {
		String message = "Ingredient added";
		Ingredient ingredient = new Ingredient(name);
		ingredients.add(ingredient);		
		return message;
	}
	
	public String addProductType(String name) {
		String message = "Type of product added";
		ProductType pt = new ProductType(name);
		pType.add(pt);		
		return message;
	}
}
