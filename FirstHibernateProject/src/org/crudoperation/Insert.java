package org.crudoperation;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Insert {
	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		for(int i = 0; i < 5; i++)
		{
			Department d = new Department();
			System.out.println("Enter the Name");
			String name = sc.nextLine();
			d.setDname(name);
			session.save(d);			
		}
		
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
	}

}
