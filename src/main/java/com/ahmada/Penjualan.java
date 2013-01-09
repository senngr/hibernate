package com.ahmada;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Penjualan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="konsumen", length=30)
	private String komsumen;
	
	@Column(name="tgljual", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date tgljual;
	
	public Penjualan() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKomsumen() {
		return komsumen;
	}

	public void setKomsumen(String komsumen) {
		this.komsumen = komsumen;
	}

	public Date getTgljual() {
		return tgljual;
	}

	public void setTgljual(Date tgljual) {
		this.tgljual = tgljual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Penjualan other = (Penjualan) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Penjualan [id=" + id + "]";
	}
	
}
