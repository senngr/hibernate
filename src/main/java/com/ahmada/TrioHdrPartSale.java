package com.ahmada;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TrioHdrPartSale implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="idpartsale", length=15 , nullable=false)
	private String idpartsale;
	
	@Column(name="tglsale")
	@Temporal(TemporalType.DATE) 
	private Date tglsale;
	
	@Column(name="idkonsumen", length=30)
	private String idkonsumen;
	
	@OneToMany(cascade={CascadeType.ALL}, mappedBy="trioHdrpartsale")
	private Set<TrioDtlPartSale> trioDtlPartSaleSet;
	
	public TrioHdrPartSale() {
	
	}

	public TrioHdrPartSale(String idpartsale) {
		this.idpartsale = idpartsale;
	}

	public Set<TrioDtlPartSale> getTrioDtlPartSaleSet() {
		return trioDtlPartSaleSet;
	}

	public void setTrioDtlPartSaleSet(Set<TrioDtlPartSale> trioDtlPartSaleSet) {
		this.trioDtlPartSaleSet = trioDtlPartSaleSet;
	}

	public String getIdpartsale() {
		return idpartsale;
	}

	public void setIdpartsale(String idpartsale) {
		this.idpartsale = idpartsale;
	}

	public Date getTglsale() {
		return tglsale;
	}

	public void setTglsale(Date tglsale) {
		this.tglsale = tglsale;
	}

	public String getIdkonsumen() {
		return idkonsumen;
	}

	public void setIdkonsumen(String idkonsumen) {
		this.idkonsumen = idkonsumen;
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
		TrioHdrPartSale other = (TrioHdrPartSale) obj;
		if (idpartsale == null) {
			if (other.idpartsale != null)
				return false;
		} else if (!idpartsale.equals(other.idpartsale))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TrioHdrPartSale [idpartsale=" + idpartsale + "]";
	}
	
}
