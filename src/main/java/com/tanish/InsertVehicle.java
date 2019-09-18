package com.tanish;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertVehicle {

	public static void main(String[] args) {
		
		Session session=Util.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Vehicle vehicle1=new Vehicle(101,"Model1",20001,new Employee(111));
		Vehicle vehicle2=new Vehicle(102,"Model2",20002,new Employee(111));
		Vehicle vehicle3=new Vehicle(103,"Model3",20003,new Employee(111));
		Vehicle vehicle4=new Vehicle(104,"Model4",20004,new Employee(222));
		Vehicle vehicle5=new Vehicle(105,"Model5",20005,new Employee(222));
		
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(vehicle4);
		session.save(vehicle5);
		
		
		tx.commit();
		session.close();

	}

}
