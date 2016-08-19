package com.iotek.entry;

public class BuyCar {
	private int id;
	private int uid;
	private int gid;
	private String goodcount;
	public BuyCar() {
		// TODO Auto-generated constructor stub
	}
	public BuyCar(int id, int uid, int gid, String goodcount) {
		super();
		this.id = id;
		this.uid = uid;
		this.gid = gid;
		this.goodcount = goodcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGoodcount() {
		return goodcount;
	}
	public void setGoodcount(String goodcount) {
		this.goodcount = goodcount;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gid;
		result = prime * result
				+ ((goodcount == null) ? 0 : goodcount.hashCode());
		result = prime * result + id;
		result = prime * result + uid;
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
		BuyCar other = (BuyCar) obj;
		if (gid != other.gid)
			return false;
		if (goodcount == null) {
			if (other.goodcount != null)
				return false;
		} else if (!goodcount.equals(other.goodcount))
			return false;
		if (id != other.id)
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BuyCar [id=" + id + ", uid=" + uid + ", gid=" + gid
				+ ", goodcount=" + goodcount + "]";
	}
	
	
	

}
