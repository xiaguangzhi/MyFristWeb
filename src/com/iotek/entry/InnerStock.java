package com.iotek.entry;

import java.sql.Timestamp;

public class InnerStock {
	private int id;
	private int gid;
	private int adid;
	private int innercount ;
	private Timestamp innerdate;
	public InnerStock(int id, int gid, int adid, int innercount,
			Timestamp innerdate) {
		super();
		this.id = id;
		this.gid = gid;
		this.adid = adid;
		this.innercount = innercount;
		this.innerdate = innerdate;
	}
	public InnerStock() {
		super();
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
	public int getInnercount() {
		return innercount;
	}
	public void setInnercount(int innercount) {
		this.innercount = innercount;
	}
	public Timestamp getInnerdate() {
		return innerdate;
	}
	public void setInnerdate(Timestamp innerdate) {
		this.innerdate = innerdate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adid;
		result = prime * result + gid;
		result = prime * result + id;
		result = prime * result + innercount;
		result = prime * result
				+ ((innerdate == null) ? 0 : innerdate.hashCode());
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
		InnerStock other = (InnerStock) obj;
		if (adid != other.adid)
			return false;
		if (gid != other.gid)
			return false;
		if (id != other.id)
			return false;
		if (innercount != other.innercount)
			return false;
		if (innerdate == null) {
			if (other.innerdate != null)
				return false;
		} else if (!innerdate.equals(other.innerdate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InnerStock [id=" + id + ", gid=" + gid + ", adid=" + adid
				+ ", innercount=" + innercount + ", innerdate=" + innerdate
				+ "]";
	}
	
	

}
