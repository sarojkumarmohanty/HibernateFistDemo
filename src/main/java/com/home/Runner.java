package com.home;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.home.entity.Student;
import com.home.entity.User;

public class Runner {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.addAnnotatedClass(User.class);
		conf.addAnnotatedClass(Student.class);
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		
		/*//User u=new User();
		
		//u.setCreationDate(new Date());
		session.getTransaction().begin();
		User u=session.get(User.class, 2L);
		//System.out.println(u);
		session.delete(u);
		session.getTransaction().commit();
		session.close();*/
		
		Student s=new Student();
		s.setName("Aroj");
		s.setCgpa(8.3f);
		session.getTransaction().begin();
		Long r=(Long) session.save(s);
		System.out.println(r);
		session.getTransaction().commit();
		session.close();

	}

}
