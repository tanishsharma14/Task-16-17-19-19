package com.tanish;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertEmployee {

	public static void main(String[] args) {
		
		Session session=Util.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp1=new Employee(111,"Tanish",2000);
		Employee emp2=new Employee(222,"Jay",3000);
		Employee emp3=new Employee(333,"Vijay",4000);
		Employee emp4=new Employee(444,"Ajay",5000);
		Employee emp5=new Employee(555,"Atul",8000);

		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		session.save(emp5);
		
		
		tx.commit();
		session.clear();
	}

}
