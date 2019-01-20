package org.hibernate.manyTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banks b = new Banks();
		b.setName("SBI");	
		
		Banks b1 = new Banks();
		b1.setName("ICICI");	
		
		Customers c = new Customers();
		c.setName("Dattaptasad");
		
		Customers c1 = new Customers();
		c1.setName("Ramprasad");
		
		b.getCust().add(c);
		b.getCust().add(c1);
		
		
		c.getBank().add(b);
		c.getBank().add(b1);
		
		c1.getBank().add(b);
				
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		session.persist(b);
		session.persist(b1);
		
		session.beginTransaction().commit();
		session.close();
	}
}
