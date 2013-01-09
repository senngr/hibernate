package com.mkyong;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.ahmada.TrioDtlPartSale;
import com.ahmada.TrioHdrPartSale;
import com.mkyong.util.HibernateUtil;

public class Transaksi {
	
	public static void main (String [] args){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		TrioHdrPartSale hdr = new TrioHdrPartSale();
		String id = Util.getId();
		hdr.setIdpartsale(id);
		hdr.setTglsale(new Date());
		hdr.setIdkonsumen("RADJA");
		
		Set<TrioDtlPartSale> dtlSet = new HashSet<TrioDtlPartSale>();
		
		dtlSet.add(new TrioDtlPartSale(id));
		dtlSet.add(new TrioDtlPartSale(id));
		
		System.out.println("size = "+dtlSet.size());
		
		session.getTransaction().commit();
		
	}
	
}
