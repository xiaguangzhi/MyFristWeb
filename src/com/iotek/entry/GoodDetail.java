package com.iotek.entry;

public class GoodDetail {
	private int id;
	private int gid;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String caption;
	
	public GoodDetail() {
		super();
	}
	

	public GoodDetail(String image1, String image2, String image3,
			String image4, String caption) {
		super();
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.caption = caption;
	}


	public GoodDetail(int gid, String image1, String image2, String image3,
			String image4, String caption) {
		super();
		this.gid = gid;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.caption = caption;
	}


	public GoodDetail(int id, int gid, String image1, String image2,
			String image3, String image4, String caption) {
		super();
		this.id = id;
		this.gid = gid;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.caption = caption;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getGid() {
		return gid;
	}


	public void setGid(int gid) {
		this.gid = gid;
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
		result = prime * result + gid;
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
		GoodDetail other = (GoodDetail) obj;
		if (caption == null) {
			if (other.caption != null)
				return false;
		} else if (!caption.equals(other.caption))
			return false;
		if (gid != other.gid)
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
		return "GoodDetail [id=" + id + ", gid=" + gid + ", image1=" + image1
				+ ", image2=" + image2 + ", image3=" + image3 + ", image4="
				+ image4 + ", caption=" + caption + "]";
	}
	
	
}
