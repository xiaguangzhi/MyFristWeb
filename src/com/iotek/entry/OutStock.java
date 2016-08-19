package com.iotek.entry;

import java.sql.Timestamp;

public class OutStock {
	private int id;
	private int gid;
	private int adid;
	private int outcount;
	private Timestamp outdate;
	public OutStock() {
		// TODO Auto-generated constructor stub
	}
	public OutStock(int id, int gid, int adid, int outcount, Timestamp outdate) {
		super();
		this.id = id;
		this.gid = gid;
		this.adid = adid;
		this.outcount = outcount;
		this.outdate = outdate;
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
	public int getAdid() {
		return adid;
	}
	public void setAdid(int adid) {
		this.adid = adid;
	}
	public int getOutcount() {
		return outcount;
	}
	public void setOutcount(int outcount) {
		this.outcount = outcount;
	}
	public Timestamp getOutdate() {
		return outdate;
	}
	public void setOutdate(Timestamp outdate) {
		this.outdate = outdate;
	}
	@Override
	public String toString() {
		return "OutStock [id=" + id + ", gid=" + gid + ", adid=" + adid
				+ ", outcount=" + outcount + ", outdate=" + outdate + "]";
	}
	

}
