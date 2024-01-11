package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestOneToOne {
	public static void main(String[] args) {
		Address A1=new Address(35,"Model","Pune");
		Address A2=new Address(40,"Baner","Pune");
		
		MyUser u1=new MyUser(33,"Harsh",A1);
		MyUser u2=new MyUser(55,"Shubh",A2);
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s1 = sf.openSession();
		Transaction tr1 = s1.beginTransaction();
		
		s1.save(A1);
		s1.save(A2);
		s1.save(u1);
		s1.save(u2);
		
		
		tr1.commit();
		s1.close();
	}

}
