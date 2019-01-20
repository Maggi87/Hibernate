package org.association.oneToone;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer u = new  Customer();
		
		u.setUname("Mauli");
		
		Vehicle v = new Vehicle();
		v.setVname("Car");
		
		u.setV(v);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(u);
		session.save(v);
		session.getTransaction().commit();
		session.close();

	}

}
