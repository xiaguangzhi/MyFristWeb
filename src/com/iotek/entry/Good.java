package com.iotek.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class Good implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String gname;
	private BigDecimal gprice;
	private String goodtype;
	public Good() {
		
	}
	
	public Good(String gname, BigDecimal gprice, String goodtype) {
		super();
		this.gname = gname;
		this.gprice = gprice;
		this.goodtype = goodtype;
	}

	public Good(int id, String gname, BigDecimal gprice, String goodtype) {
		super();
		this.id = id;
		this.gname = gname;
		this.gprice = gprice;
		this.goodtype = goodtype;
	}
	public int getId() {
		return id;
	}
	public String getGname() {
		return gname;
	}
	public BigDecimal getGprice() {
		return gprice;
	}
	public String getGoodtype() {
		return goodtype;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public void setGprice(BigDecimal gprice) {
		this.gprice = gprice;
	}
	public void setGoodtype(String goodtype) {
		this.goodtype = goodtype;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result
				+ ((goodtype == null) ? 0 : goodtype.hashCode());
		result = prime * result + ((gprice == null) ? 0 : gprice.hashCode());
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
		Good other = (Good) obj;
		if (gname == null) {
			if (other.gname != null)
				return false;
		} else if (!gname.equals(other.gname))
			return false;
		if (goodtype == null) {
			if (other.goodtype != null)
				return false;
		} else if (!goodtype.equals(other.goodtype))
			return false;
		if (gprice == null) {
			if (other.gprice != null)
				return false;
		} else if (!gprice.equals(other.gprice))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Good [id=" + id + ", gname=" + gname + ", gprice=" + gprice
				+ ", goodtype=" + goodtype + "]";
	}
	
	

}
