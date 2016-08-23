package com.iotek.entry;

public class Stock {
	private int id;
	private int gid;
	private int adid;
	private int goodcount;
	
	public Stock() {
		super();
	}

	public Stock(int id, int gid, int adid, int goodcount) {
		super();
		this.id = id;
		this.gid = gid;
		this.adid = adid;
		this.goodcount = goodcount;
	}
	public Stock( int gid, int adid, int goodcount) {
		super();
	
		this.gid = gid;
		this.adid = adid;
		this.goodcount = goodcount;
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

	public int getGoodcount() {
		return goodcount;
	}

	public void setGoodcount(int goodcount) {
		this.goodcount = goodcount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adid;
		result = prime * result + gid;
		result = prime * result + goodcount;
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
		Stock other = (Stock) obj;
		if (adid != other.adid)
			return false;
		if (gid != other.gid)
			return false;
		if (goodcount != other.goodcount)
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", gid=" + gid + ", adid=" + adid
				+ ", goodcount=" + goodcount + "]";
	}
	
	

}
