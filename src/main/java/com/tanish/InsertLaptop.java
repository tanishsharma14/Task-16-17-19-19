package com.tanish;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertLaptop {

	public static void main(String[] args) {
		
		Session session=Util.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Laptop laptop1=new Laptop(1,"HP",1000,new Employee(111));
		Laptop laptop2=new Laptop(2,"DELL",2000,new Employee(222));
		Laptop laptop3=new Laptop(3,"MAC",3000,new Employee(333));
		Laptop laptop4=new Laptop(4,"LENOVO",4000,new Employee(444));
		Laptop laptop5=new Laptop(5,"LG",5000,new Employee(555));
		
		session.save(laptop1);
		session.save(laptop2);
		session.save(laptop3);
		session.save(laptop4);
		session.save(laptop5);
		
		tx.commit();
		session.clear();
	}

}
