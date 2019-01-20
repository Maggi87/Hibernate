package org.inheritance.join;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human h = new Human();
		h.setName("God");
		
		Male m = new Male();
		m.setName("Sagar");
		m.setMale("Male");
		
		Female f = new Female();
		f.setName("Pooja");
		f.setFemale("Female");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(h);
		session.save(m);
		session.save(f);
		session.beginTransaction().commit();
		session.close();
		sf.close();

	}

}
