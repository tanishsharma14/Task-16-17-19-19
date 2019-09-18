package com.tanish;

import java.util.Scanner;




import org.hibernate.Session;
import org.hibernate.Transaction;

public class CRUDLaptop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Session session = Util.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("1. Add Laptop");
		System.out.println("2. Delete Laptop");
		System.out.println("3. Update Laptop");
		System.out.println("4. Retrieve Laptop");
		int type = sc.nextInt();
		switch (type) {
		case 1: {

			System.out.println("Enter laptop  number");
			int lid=sc.nextInt();
			System.out.println("Enter brand name");
			String brand=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			
			System.out.println("Enter employee number");
			int eid=sc.nextInt();
			Employee e=new Employee(eid);
			session.save(e);
			Laptop t=new Laptop(lid,brand,price,e);
			session.save(t);
			tx.commit();
			break;
		}
		case 2:{
			
			System.out.println("Enter Laptop number ");
			int lid=sc.nextInt();
			Laptop laptop=session.get(Laptop.class,lid);
			session.remove(laptop);
			tx.commit();
			break;
		}
		case 3:{
			
			System.out.println("Enter laptop number");
			int lid=sc.nextInt();
			Laptop laptop=session.get(Laptop.class,lid);
			System.out.println("Enter brand");
			laptop.setBrand(sc.next());
			System.out.println("Enter price");
			laptop.setPrice(sc.nextInt());
			session.save(laptop);
			tx.commit();
			break;
		}
		case 4:{
			
			System.out.println("Enter laptop number");
			int lid=sc.nextInt();
			Laptop laptop=session.get(Laptop.class,lid);
			
			System.out.println("Laptop id:"+laptop.getLid());
			System.out.println("Laptop brand:"+laptop.getBrand());
			System.out.println("Laptop price:"+laptop.getPrice());
			System.out.println("Employee ID:"+laptop.getEmployee().getEid());
			System.out.println("Employee name:"+laptop.getEmployee().getEname());
			System.out.println("Employee salary:"+laptop.getEmployee().getSal());
			
			break;
		}

		}
		
		session.close();

	}

}
