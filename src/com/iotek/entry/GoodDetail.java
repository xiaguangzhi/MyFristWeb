package com.iotek.entry;

public class GoodDetail {
	private int id;
	private String gid;
	private String gimage;
	public GoodDetail() {
		// TODO Auto-generated constructor stub
	}
	public GoodDetail(int id, String gid, String gimage) {
		super();
		this.id = id;
		this.gid = gid;
		this.gimage = gimage;
	}
	public int getId() {
		return id;
	}
	public String getGid() {
		return gid;
	}
	public String getGimage() {
		return gimage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public void setGimage(String gimage) {
		this.gimage = gimage;
	}
	@Override
	public String toString() {
		return "GoodDetail [id=" + id + ", gid=" + gid + ", gimage=" + gimage
				+ "]";
	}
	

}
