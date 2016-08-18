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
	public String toString() {
		return "Good [id=" + id + ", gname=" + gname + ", gprice=" + gprice
				+ ", goodtype=" + goodtype + "]";
	}
	
	

}
