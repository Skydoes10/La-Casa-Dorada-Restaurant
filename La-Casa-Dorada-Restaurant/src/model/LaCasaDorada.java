package model;

import java.util.ArrayList;

public class LaCasaDorada {
	
	private ArrayList<Product> products;
	private ArrayList<Ingredient> ingredients;
	private ArrayList<ProductType> pType;
	private ArrayList<User> users;
	private ArrayList<Employee> employees;
	private ArrayList<Client> clients;
	private ArrayList<Order> orders;
	
	public LaCasaDorada() {
		products = new ArrayList<Product>();
		ingredients = new ArrayList<Ingredient>();
		users = new ArrayList<User>();
		employees = new ArrayList<Employee>();
	}
	
	public void addUser(String name, String lastname, String id, String username, String password) {
		User user = new User(name, lastname, id, Availability.HABILITADO, username, password);
		users.add(user);
	}
	
	public void addEmployee(String name, String lastname, String id) {
		Employee employee = new Employee(name, lastname, id, Availability.HABILITADO);
		employees.add(employee);
	}
	
	public void addProduct(String name, ProductType type, String size, int price) {
		
	}
	
	public void addIngredient(String name) {
		Ingredient ingredient = new Ingredient(name, Availability.HABILITADO);
		ingredients.add(ingredient);
	}
	
	public void addProductType(String name) {
		ProductType productType = new ProductType(name, Availability.HABILITADO);
		pType.add(productType);
	}
	
	public boolean deleteUser(String id) {
		boolean deleted = false;
		for(int i=0; i<users.size() && !deleted; i++) {
			if(users.get(i).getId().equals(id)) {
				users.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}
	
	public boolean deleteEmployee(String id) {
		boolean deleted = false;
		for(int i=0; i<employees.size() && !deleted; i++) {
			if(employees.get(i).getId().equals(id)) {
				employees.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}
	
	public boolean deleteIngredient(String name) {
		boolean deleted = false;
		for(int i=0; i<ingredients.size() && !deleted; i++) {
			if(ingredients.get(i).getName().equals(name)) {
				ingredients.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}
	
	public boolean deletePType(String name) {
		boolean deleted = false;
		for(int i=0; i<pType.size() && !deleted; i++) {
			if(pType.get(i).getName().equals(name)) {
				pType.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}
	
	
	
	
	public boolean searchUser(String id) {
		boolean found = false;
		for(int i=0; i<users.size() && !found; i++) {
			if(users.get(i).getId().equals(id)) {
				found = true;
			}
		}
		return found;
	}
	
	
	
	
	
	
	
	
	public String RemoveProduct(String name) {
		String message = "";
		if (products.contains(name)) {
			products.remove(products.indexOf(name));
			message = "Product removed";
		}
		return message;
	}
	
	public String RemoveIngredient(String name) {
		String message = "";
		if (ingredients.contains(name)) {
			ingredients.remove(ingredients.indexOf(name));
			message = "Ingredient removed";
		}
		return message;
	}
	
	public String RemoveProductType(String name) {
		String message = "";
		if (pType.contains(name)) {
			pType.remove(pType.indexOf(name));
			message = "Type of product removed";
		}
		return message;
	}

	public ArrayList<User> getUsers() {
		return users;
	}
	
	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public ArrayList<Ingredient> getIngredients() {
		return ingredients;
	}
	
}
