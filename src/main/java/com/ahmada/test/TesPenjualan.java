package com.ahmada.test;

import java.util.Date;

import org.hibernate.Session;

import com.ahmada.Penjualan;
import com.mkyong.util.HibernateUtil;

public class TesPenjualan {
	
	public static void main (String [] args){
		System.out.println("Mulai");
		Session ses = HibernateUtil.getSessionFactory().openSession();
		
		ses.beginTransaction();
		
		Penjualan p = new Penjualan();
		
		p.setKomsumen("RADJA");
		p.setTgljual(new Date());
		
		ses.save(p);
		
		ses.getTransaction().commit();
		System.out.println("Commit");
		
	}

}
