package com.iotek.entry;

public class GoodComment {
	private int id;
	private int orderid;
	private String comment;
	public GoodComment() {
		// TODO Auto-generated constructor stub
	}
	public GoodComment(int id, int orderid, String comment) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.comment = comment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + id;
		result = prime * result + orderid;
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
		GoodComment other = (GoodComment) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (id != other.id)
			return false;
		if (orderid != other.orderid)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "GoodComment [id=" + id + ", orderid=" + orderid + ", comment="
				+ comment + "]";
	}
	
	
}
