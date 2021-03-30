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
		pType = new ArrayList<ProductType>();
		orders = new ArrayList<Order>();
	}
	
	public void addUser(String name, String lastname, String id, String username, String password) {
		User user = new User(name, lastname, id, Availability.HABILITADO, username, password);
		users.add(user);
	}
	
	public void addEmployee(String name, String lastname, String id) {
		Employee employee = new Employee(name, Availability.HABILITADO, id, lastname);
		employees.add(employee);
	}
	
	public void addProduct(String name, String type, ArrayList<String> ingredients, ArrayList<Size> size, ArrayList<Integer> prices) {
		Product product = new Product(name, Availability.HABILITADO, type, ingredients, size, prices);
		products.add(product);
	}
	
	public void addIngredient(String name) {
		Ingredient ingredient = new Ingredient(name, Availability.HABILITADO);
		ingredients.add(ingredient);
	}
	
	public void addProductType(String name) {
		ProductType productType = new ProductType(name, Availability.HABILITADO);
		pType.add(productType);
	}
	
	public void addClient(String name, String ln, String a, String id, String p, String com) {
		Client client = new Client(name, Availability.HABILITADO, ln, a, id, p, com);
		clients.add(client);
	}
	
	public void addOrder(String code, ArrayList<String> products, int quantityProducts, String client, String employee, String date, String observations) {
		Order order = new Order(code, products, quantityProducts, client, employee, date, observations);
		orders.add(order);
	}
	
	public boolean deleteOrder(String code) {
		boolean deleted = false;
		for(int i=0; i<orders.size() && !deleted; i++) {
			if(orders.get(i).getCode().equals(code)) {
				orders.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}
	
	public boolean deleteClient(String id) {
		boolean deleted = false;
		for(int i=0; i<clients.size() && !deleted; i++) {
			if(clients.get(i).getId().equals(id)) {
				clients.remove(i);
				deleted = true;
			}
		}
		return deleted;
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
	
	public boolean deleteProduct(String name) {
		boolean deleted = false;
		for(int i=0; i<products.size() && !deleted; i++) {
			if(products.get(i).getName().equals(name)) {
				products.remove(i);
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
	
	public boolean searchIngInProduct(String name) {
		boolean found = false;
		for(int i=0; i<products.size(); i++) {
			for(int j=0; i<products.get(i).getIngredients().size() && !found; j++) {
				if(products.get(i).getIngredients().get(j).equals(name)) {
					found = true;
				}
			}
		}
		return found;
	}
	
	public boolean searchProductInOrder(String name) {
		boolean found = false;
		for(int i=0; i<orders.size(); i++) {
			for(int j=0; i<orders.get(i).getProducts().size() && !found; j++) {
				if(orders.get(i).getProducts().get(j).equals(name)) {
					found = true;
				}
			}
		}
		return found;
	}
	
	public boolean searchPTypeInProduct(String name) {
		boolean found = false;
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getType().equals(name)) {
				found = true;
			}
		}
		return found;
	}
	
	public boolean searchClientInOrder(String id) {
		boolean found = false;
		for(int i=0; i<orders.size(); i++) {
			if(orders.get(i).getClient().equals(id)) {
				found = true;
			}
		}
		return found;
	}
	
	public void changeDisableOrEnable(String name, int on) {
		for(int i=0; i<ingredients.size(); i++) {
			if(ingredients.get(i).getName().equals(name)) {
				if(on==0) {
					ingredients.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					ingredients.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
	}
	
	public void changeDisableOrEnableU(String id, int on) {
		for(int i=0; i<users.size(); i++) {
			if(users.get(i).getName().equals(id)) {
				if(on==0) {
					users.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					users.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
	}
	
	public void changeDisableOrEnablePT(String name, int on) {
		for(int i=0; i<pType.size(); i++) {
			if(pType.get(i).getName().equals(name)) {
				if(on==0) {
					pType.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					pType.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
	}
	
	public void changeDisableOrEnablePro(String name, int on) {
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getName().equals(name)) {
				if(on==0) {
					products.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					products.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
	}
	
	public void changeDisableOrEnableEmp(String id, int on) {
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getName().equals(id)) {
				if(on==0) {
					employees.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					employees.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
	}
	
	public void changeDisableOrEnableCli(String id, int on) {
		for(int i=0; i<clients.size(); i++) {
			if(clients.get(i).getName().equals(id)) {
				if(on==0) {
					clients.get(i).setAvailability(Availability.HABILITADO);
				}else if(on==1) {
					clients.get(i).setAvailability(Availability.DESHABILITADO);
				}
			}
		}
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

	public ArrayList<ProductType> getpType() {
		return pType;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}
	
	
}
