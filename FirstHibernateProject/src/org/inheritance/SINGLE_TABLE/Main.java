package org.inheritance.SINGLE_TABLE;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {
	
	public static void main(String args[])
	{
		Vehicles v = new Vehicles();
		v.setName("Car");
		
		TwoWheelar t = new TwoWheelar();
		t.setName("Honda");
		t.setSteeringHandle("Bike Steering");
		
		FourWheelar f = new FourWheelar();
		f.setName("Maruti");
		f.setSteeringWheel("Maruti Steering Wheel");
		
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(v);
		session.save(t);
		session.save(f);
		session.beginTransaction().commit();
		session.close();
		sf.close();
	}
}
