package com.iotek.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoodInfo implements Serializable{
	private int id;
	private String gname;
	private BigDecimal gprice;
	private String goodtype;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String caption;
	public GoodInfo(int id, String gname, BigDecimal gprice, String goodtype,
			String image1, String image2, String image3, String image4,
			String caption) {
		super();
		this.id = id;
		this.gname = gname;
		this.gprice = gprice;
		this.goodtype = goodtype;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.caption = caption;
	}
	public GoodInfo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public BigDecimal getGprice() {
		return gprice;
	}
	public void setGprice(BigDecimal gprice) {
		this.gprice = gprice;
	}
	public String getGoodtype() {
		return goodtype;
	}
	public void setGoodtype(String goodtype) {
		this.goodtype = goodtype;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	@Override
	public String toString() {
		return "GoodInfo [id=" + id + ", gname=" + gname + ", gprice=" + gprice
				+ ", goodtype=" + goodtype + ", image1=" + image1 + ", image2="
				+ image2 + ", image3=" + image3 + ", image4=" + image4
				+ ", caption=" + caption + "]";
	}
	

}
