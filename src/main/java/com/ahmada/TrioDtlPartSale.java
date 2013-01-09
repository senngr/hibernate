package com.ahmada;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TrioDtlPartSale implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idpartsale", length=15, nullable=false)
	private String idpartsale;
	
	@Column(name="idbarang", length=15, nullable=false)
	private String idbarang;
	
	@ManyToOne
	@JoinColumn(name="idpartsale", referencedColumnName="idpartsale", insertable=false, updatable=false)
	private TrioHdrPartSale trioHdrpartsale;
	
	public TrioHdrPartSale getTrioHdrpartsale() {
		return trioHdrpartsale;
	}

	public void setTrioHdrpartsale(TrioHdrPartSale trioHdrpartsale) {
		this.trioHdrpartsale = trioHdrpartsale;
	}

	public TrioDtlPartSale() {
	
	}
	
	public TrioDtlPartSale(String idpartsale) {
		this.idpartsale = idpartsale;
	}

	public String getIdpartsale() {
		return idpartsale;
	}

	public void setIdpartsale(String idpartsale) {
		this.idpartsale = idpartsale;
	}

	public String getIdbarang() {
		return idbarang;
	}

	public void setIdbarang(String idbarang) {
		this.idbarang = idbarang;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idpartsale == null) ? 0 : idpartsale.hashCode());
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
		TrioDtlPartSale other = (TrioDtlPartSale) obj;
		if (idpartsale == null) {
			if (other.idpartsale != null)
				return false;
		} else if (!idpartsale.equals(other.idpartsale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrioDtlPartSale [idpartsale=" + idpartsale + "]";
	}
	
}
