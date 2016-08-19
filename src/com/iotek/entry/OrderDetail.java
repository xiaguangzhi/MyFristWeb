package com.iotek.entry;

public class OrderDetail {
	private int id;
	private int oid;
	private int goodid;
	private String goodcount;
	private int goodstate;
	
	public OrderDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderDetail(int oid, int goodid, String goodcount, int goodstate) {
		super();
		this.oid = oid;
		this.goodid = goodid;
		this.goodcount = goodcount;
		this.goodstate = goodstate;
	}

	public OrderDetail(int id, int oid, int goodid, String goodcount,
			int goodstate) {
		super();
		this.id = id;
		this.oid = oid;
		this.goodid = goodid;
		this.goodcount = goodcount;
		this.goodstate = goodstate;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public String getGoodcount() {
		return goodcount;
	}
	public void setGoodcount(String goodcount) {
		this.goodcount = goodcount;
	}
	public int getGoodstate() {
		return goodstate;
	}
	public void setGoodstate(int goodstate) {
		this.goodstate = goodstate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((goodcount == null) ? 0 : goodcount.hashCode());
		result = prime * result + goodid;
		result = prime * result + goodstate;
		result = prime * result + id;
		result = prime * result + oid;
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
		OrderDetail other = (OrderDetail) obj;
		if (goodcount == null) {
			if (other.goodcount != null)
				return false;
		} else if (!goodcount.equals(other.goodcount))
			return false;
		if (goodid != other.goodid)
			return false;
		if (goodstate != other.goodstate)
			return false;
		if (id != other.id)
			return false;
		if (oid != other.oid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", oid=" + oid + ", goodid=" + goodid
				+ ", goodcount=" + goodcount + ", goodstate=" + goodstate + "]";
	}
	
	
	

}
