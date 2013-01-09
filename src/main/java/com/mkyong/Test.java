package com.mkyong;

import org.hibernate.Session;

import com.ahmada.Kontak;
import com.mkyong.util.HibernateUtil;

public class Test {
	
	public static void main (String [] args){
		
		System.out.println("Mulai bro");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Kontak k = new Kontak();
		
		k.setKontakId("001");
		k.setKontakNama("Saifi Ahmada");
		k.setNumber("085751635457");
		
		System.out.println("mulai nyimpan");
		session.save(k);
		
		session.getTransaction().commit();
		
		System.out.println("commit sukses");
		
	}

}
