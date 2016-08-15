package com.iotek.entry;

public class UserDetail {
	private int id;
	private int uid;
	private String money;
	private String phone;
	private String email;
	
	public UserDetail(int uid, String money, String phone, String email) {
		super();
		
		this.uid = uid;
		this.money = money;
		this.phone = phone;
		this.email = email;
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
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", uid=" + uid + ", money=" + money
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	

}
