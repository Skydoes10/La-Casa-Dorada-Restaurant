package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	private String code; 
	private ArrayList<Product> products;
	private int quantityProducts;
	private Client client;
	private Employee employee;
	private Date date;
	private String observations;
	
	public Order(String code, ArrayList<Product> products, int quantityProducts, Client client, Employee employee, Date date, String observations) {
		this.code = code;
		products = new ArrayList<Product>();
		this.quantityProducts = quantityProducts;
		this.client = client;
		this.employee = employee;
		this.date = date;
		this.observations = observations;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int getQuantityProducts() {
		return quantityProducts;
	}

	public void setQuantityProducts(int quantityProducts) {
		this.quantityProducts = quantityProducts;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	
}
