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
	public String toString() {
		return "GoodDetail [id=" + id + ", gid=" + gid + ", image1=" + image1
				+ ", image2=" + image2 + ", image3=" + image3 + ", image4="
				+ image4 + ", caption=" + caption + "]";
	}
	
	
}
