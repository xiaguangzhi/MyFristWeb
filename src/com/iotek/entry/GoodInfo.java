package com.iotek.entry;

import java.io.Serializable;
import java.math.BigDecimal;

public class GoodInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caption == null) ? 0 : caption.hashCode());
		result = prime * result + ((gname == null) ? 0 : gname.hashCode());
		result = prime * result
				+ ((goodtype == null) ? 0 : goodtype.hashCode());
		result = prime * result + ((gprice == null) ? 0 : gprice.hashCode());
		result = prime * result + id;
		result = prime * result + ((image1 == null) ? 0 : image1.hashCode());
		result = prime * result + ((image2 == null) ? 0 : image2.hashCode());
		result = prime * result + ((image3 == null) ? 0 : image3.hashCode());
		result = prime * result + ((image4 == null) ? 0 : image4.hashCode());
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
		GoodInfo other = (GoodInfo) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
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
		if (image1 == null) {
			if (other.image1 != null)
				return false;
		} else if (!image1.equals(other.image1))
			return false;
		if (image2 == null) {
			if (other.image2 != null)
				return false;
		} else if (!image2.equals(other.image2))
			return false;
		if (image3 == null) {
			if (other.image3 != null)
				return false;
		} else if (!image3.equals(other.image3))
			return false;
		if (image4 == null) {
			if (other.image4 != null)
				return false;
		} else if (!image4.equals(other.image4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GoodInfo [id=" + id + ", gname=" + gname + ", gprice=" + gprice
				+ ", goodtype=" + goodtype + ", image1=" + image1 + ", image2="
				+ image2 + ", image3=" + image3 + ", image4=" + image4
				+ ", caption=" + caption + "]";
	}
	

}
