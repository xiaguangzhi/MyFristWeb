package com.iotek.entry;

import java.sql.Timestamp;

public class Order {
	private int id;
	private int uid;
	private Timestamp orderdate;
	private String totalmoney;
	/**
	 * 0:未支付
	 * 1：已支付 
	 * 2：已完成
	 * 
	 */
	private int orderstate;
	
	
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(int uid, Timestamp orderdate, String totalmoney,
			int orderstate) {
		super();
		this.uid = uid;
		this.orderdate = orderdate;
		this.totalmoney = totalmoney;
		this.orderstate = orderstate;
	}

	public Order(int id, int uid, Timestamp orderdate, String totalmoney,
			int orderstate) {
		super();
		this.id = id;
		this.uid = uid;
		this.orderdate = orderdate;
		this.totalmoney = totalmoney;
		this.orderstate = orderstate;
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
	public Timestamp getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	public String getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(String totalmoney) {
		this.totalmoney = totalmoney;
	}
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result
				+ ((orderdate == null) ? 0 : orderdate.hashCode());
		result = prime * result + orderstate;
		result = prime * result
				+ ((totalmoney == null) ? 0 : totalmoney.hashCode());
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
		Order other = (Order) obj;
		if (id != other.id)
			return false;
		if (orderdate == null) {
			if (other.orderdate != null)
				return false;
		} else if (!orderdate.equals(other.orderdate))
			return false;
		if (orderstate != other.orderstate)
			return false;
		if (totalmoney == null) {
			if (other.totalmoney != null)
				return false;
		} else if (!totalmoney.equals(other.totalmoney))
			return false;
		if (uid != other.uid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", uid=" + uid + ", orderdate=" + orderdate
				+ ", totalmoney=" + totalmoney + ", orderstate=" + orderstate
				+ "]";
	}
	
	
	

}
