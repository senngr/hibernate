package com.ahmada.test;

import java.util.Date;

import org.hibernate.Session;

import com.ahmada.Siswa;
import com.mkyong.util.HibernateUtil;

public class TestSiswa {
	
	public static void main (String [] args){
		System.out.println("Mulai tes siswa");
		Session ses = HibernateUtil.getSessionFactory().openSession();
		
		ses.beginTransaction();
		
		Siswa siswa = new Siswa("0034");
		
		siswa.setAlamat("Daha Selatan");
		siswa.setNama("Ahmada");
		siswa.setTglLahir(new Date());

		ses.save(siswa);	
		
		ses.getTransaction().commit();
		System.out.println("Commit sukses");
	}

}
