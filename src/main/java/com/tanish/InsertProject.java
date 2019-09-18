package com.tanish;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertProject {

	public static void main(String[] args) {
		
		Session session=Util.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Project project1=new Project(501, "Project1", 9001);
		Project project2=new Project(502, "Project2", 9002);
		Project project3=new Project(503, "Project3", 9003);
		Project project4=new Project(504, "Project4", 9004);
		Project project5=new Project(505, "Project5", 9005);
		
		project1.getEmployee().add(new Employee(111));
		project1.getEmployee().add(new Employee(222));
		project1.getEmployee().add(new Employee(333));
		project1.getEmployee().add(new Employee(444));
		project1.getEmployee().add(new Employee(555));
		
		project2.getEmployee().add(new Employee(111));
		project2.getEmployee().add(new Employee(222));
		project2.getEmployee().add(new Employee(333));
		project2.getEmployee().add(new Employee(444));
		project2.getEmployee().add(new Employee(555));
		
		project3.getEmployee().add(new Employee(111));
		project3.getEmployee().add(new Employee(222));
		project3.getEmployee().add(new Employee(333));
		project3.getEmployee().add(new Employee(444));
		project3.getEmployee().add(new Employee(555));
		
		project4.getEmployee().add(new Employee(111));
		project4.getEmployee().add(new Employee(222));
		project4.getEmployee().add(new Employee(333));
		project4.getEmployee().add(new Employee(444));
		project4.getEmployee().add(new Employee(555));
		
		project5.getEmployee().add(new Employee(111));
		project5.getEmployee().add(new Employee(222));
		project5.getEmployee().add(new Employee(333));
		project5.getEmployee().add(new Employee(444));
		project5.getEmployee().add(new Employee(555));
		
		session.save(project1);
		session.save(project2);
		session.save(project3);
		session.save(project4);
		session.save(project5);
		
		tx.commit();
		session.close();
		
	}

}
