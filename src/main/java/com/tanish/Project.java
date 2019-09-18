package com.tanish;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	private String pname;
	private int cost;
	

	@ManyToMany
		List<Employee> employee=new ArrayList<Employee>();

	public Project() {
		super();
	}

	public Project(int pid, String pname, int cost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", cost=" + cost
				+ ", employee=" + employee + "]";
	}


	
	
	
}
