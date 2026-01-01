package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration()
				.configure().buildSessionFactory();
		//open Session
		Session session =factory.openSession();
		//begin transaction
		Transaction tx=session.beginTransaction();
		//create class
		Student s=new Student("Bharath");
		//save object
		session.save(s);
		//commite 
		tx.commit();
		//close the resources
		session.close();
		factory.close();
		System.out.println("Data have been inserted sucessfull");

	}

}
