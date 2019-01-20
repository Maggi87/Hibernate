 package org.association.Main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.UserDtl.Address;
import org.hibernate.UserDtl.User;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		
		
		User user = new User();

		Address addr = new Address();
		addr.setStreet("ladkat road");
		addr.setCity("Pune");
		addr.setState("Maharashtra");
		addr.setPincode("411036");
		
		user.setUname("Dattprasad");
		user.setJoinDate(new Date());
		user.setDescription("Description of the user");
		user.setHomeaddress(addr);
		
		Address addr1 = new Address();
		addr1.setStreet("Mitrang");
		addr1.setCity("Baner");
		addr1.setState("Maharashtra");
		addr1.setPincode("411047");
		
		user.setOfficeaddresd(addr1);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;
		session = sf.openSession();
		session.beginTransaction();
		long usetId = 1;
		user = (User) session.get(User.class, usetId);
		System.out.println("Name of User :-"+user.getUname());

	}

}
