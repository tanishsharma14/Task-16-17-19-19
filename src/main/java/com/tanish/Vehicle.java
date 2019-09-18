package com.tanish;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {

	@Id
	private int regno;
	private String model;
	private int price;
	
	@ManyToOne
	private Employee employee;
	
	public Vehicle() {
		super();
	}

	
	public Vehicle(int regno, String model, int price, Employee employee) {
		super();
		this.regno = regno;
		this.model = model;
		this.price = price;
		this.employee = employee;
	}


	public Vehicle(int regno, String model, int price) {
		super();
		this.regno = regno;
		this.model = model;
		this.price = price;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}




	@Override
	public String toString() {
		return "Vehicle [regno=" + regno + ", model=" + model + ", price="
				+ price + ", employee=" + employee + "]";
	}




	
	
}
