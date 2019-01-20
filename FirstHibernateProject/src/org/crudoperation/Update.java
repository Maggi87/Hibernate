package org.crudoperation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Update {
	public static void main(String args[])
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		long id = 1;
		Department d = (Department) session.get(Department.class, id);
		d.setDname("Pooja");
		session.update(d);
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
	}
}
