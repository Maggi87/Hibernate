 package org.crudoperation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Fetch {

	public static void main(String args[])
	{
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		long id = 3;
		Department d = (Department) session.get(Department.class, id);
		System.out.println("Name of Department :-"+d.getDname());
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
	}
	
}
