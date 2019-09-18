package com.tanish;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eid;
	private String ename;
	private int sal;
	
	
	@OneToOne(mappedBy="employee")
	private Laptop laptop;
	@OneToMany(mappedBy="employee")
	private List<Vehicle> vehicle;
	
	@ManyToMany(mappedBy="employee")
	private List<Project> project=new ArrayList<Project>();
	
	
	
	public Employee() {
		super();
	}


	
	
	public Employee(int eid) {
		super();
		this.eid = eid;
	}

	public Employee(int eid, String ename, int sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		
	}



	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}



	public Laptop getLaptop() {
		return laptop;
	}



	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal
				+ ", laptop=" + laptop + "]";
	}

	


	
}
