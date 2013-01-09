package com.ahmada;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kontak implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; 
	
	@Id
	@Column(name="kontakId", length=5, nullable=false)
	private String kontakId;
	
	@Column(name="kontakNama", length =30)
	private String kontakNama;
	
	@Column(name="number", length=15)
	private String number;
	
	public Kontak() {

	}
	
	public Kontak(String kontakId) {
		this.kontakId = kontakId;
	}

	public String getKontakId() {
		return kontakId;
	}

	public void setKontakId(String kontakId) {
		this.kontakId = kontakId;
	}

	public String getKontakNama() {
		return kontakNama;
	}

	public void setKontakNama(String kontakNama) {
		this.kontakNama = kontakNama;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((kontakId == null) ? 0 : kontakId.hashCode());
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
		Kontak other = (Kontak) obj;
		if (kontakId == null) {
			if (other.kontakId != null)
				return false;
		} else if (!kontakId.equals(other.kontakId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Kontak [kontakId=" + kontakId + "]";
	}
	
}
