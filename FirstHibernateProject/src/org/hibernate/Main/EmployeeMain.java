package org.hibernate.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.UserDtl.Address;
import org.hibernate.UserDtl.Employee;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {
	
	public static void main(String args[])
	{
		Employee emp = new  Employee();
		emp.setUserName("Dattaprasad");
		
		Address addr1 = new  Address();
		addr1.setStreet("Ladkat Road");
		addr1.setCity("Pune");
		addr1.setState("Maharashtra");
		addr1.setPincode("411036");
		
		Address addr2 = new  Address();
		addr2.setStreet("Ladkat Road");
		addr2.setCity("Pune");
		addr2.setState("Maharashtra");
		addr2.setPincode("411036");
		
		emp.getListofAddress().add(addr1);
		emp.getListofAddress().add(addr2);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(emp);
		session.getTransaction().commit();
		session.close();
	}
}
