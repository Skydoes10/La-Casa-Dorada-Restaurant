package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable{
	private static final long serialVersionUID = 1;
	
	private String code; 
	private ArrayList<String> products;
	private int quantityProducts;
	private String client;
	private String employee;
	private String date;
	private String observations;
	
	public Order(String code, ArrayList<String> products, int quantityProducts, String client, String employee, String date, String observations) {
		this.code = code;
		products = new ArrayList<String>();
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

	public ArrayList<String> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<String> products) {
		this.products = products;
	}

	public int getQuantityProducts() {
		return quantityProducts;
	}

	public void setQuantityProducts(int quantityProducts) {
		this.quantityProducts = quantityProducts;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}
	
	
}
