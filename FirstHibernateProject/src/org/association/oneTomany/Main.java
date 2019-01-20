package org.association.oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c = new Country();
		c.setName("India");
		
		State s = new  State();
		s.setSname("Maharastra");
		
		State s1 = new  State();
		s1.setSname("Gujrat");
		
		District d1 = new District();
		d1.setDname("Pune");		
		District d2 = new District();
		d2.setDname("Dhule");
		
		District d3 = new District();
		d3.setDname("Surat");		
		District d4 = new District();
		d4.setDname("Ahmadabad");
		
		c.getState().add(s);
		c.getState().add(s1);
		
		d1.setState(s);
		d2.setState(s);
		
		d3.setState(s1);
		d4.setState(s1);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(c);
		session.save(s);
		session.save(s1);
		session.save(d1);
		session.save(d2);
		session.save(d3);
		session.save(d4);
		session.beginTransaction().commit();
		session.close();
		
	}

}
