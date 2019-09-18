package com.tanish;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int lid;
	private String brand;
	private int price;
	
	@OneToOne(cascade=CascadeType.ALL )
	private Employee employee;
	
	public Laptop() {
		super();
	}




	public Laptop(int lid, String brand, int price, Employee employee) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.price = price;
		this.employee = employee;
	}






	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price
				+ ", employee=" + employee + "]";
	}
	
	
	
}
