package com.ahmada;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Siswa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String nis;

	@Column(name = "nama", length = 30, nullable = false, unique = true)
	private String nama;

	@Column(name = "alamat", length = 30)
	private String alamat;

	@Column(name="tgl_lahir")
	@Temporal(TemporalType.DATE)
	private Date tglLahir;
	
	public Siswa() {
	
	}
	
	public Siswa(String nis) {
		this.nis = nis;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Date getTglLahir() {
		return tglLahir;
	}

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nis == null) ? 0 : nis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Siswa other = (Siswa) obj;
		if (nis == null) {
			if (other.nis != null)
				return false;
		} else if (!nis.equals(other.nis))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Siswa [nis=" + nis + "]";
	}
	
}
