package com.mkyong;

import org.hibernate.Session;

import com.ahmada.User;
import com.mkyong.util.HibernateUtil;

public class TestUser {
	
	public static void main (String [] args){
		
		System.out.println("tes awal");
		
		Session ses = HibernateUtil.getSessionFactory().openSession();
		
		ses.beginTransaction();
		
		User user = new User();
		user.setUserId("ahmids");
		user.setPassword("ahmids123");
		
		ses.save(user);
		
		ses.getTransaction().commit();
		
	}

}
