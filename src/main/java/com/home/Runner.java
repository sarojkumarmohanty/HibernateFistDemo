package com.home;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.home.entity.User;

public class Runner {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.addAnnotatedClass(User.class);
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		//User u=new User();
		
		//u.setCreationDate(new Date());
		session.beginTransaction();
		//session.save(u);
		//session.delete(u);
		User u=session.get(User.class, 2l);
		//System.out.println(u);
		session.delete(u);
		session.close();

	}

}
