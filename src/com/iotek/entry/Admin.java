package com.iotek.entry;

public class Admin {
	private int id;
	private String adname;
	private String adpsd;
	private int adstatus;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, String adname, String adpsd, int adstatus) {
		super();
		this.id = id;
		this.adname = adname;
		this.adpsd = adpsd;
		this.adstatus = adstatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdname() {
		return adname;
	}
	public void setAdname(String adname) {
		this.adname = adname;
	}
	public String getAdpsd() {
		return adpsd;
	}
	public void setAdpsd(String adpsd) {
		this.adpsd = adpsd;
	}
	public int getAdstatus() {
		return adstatus;
	}
	public void setAdstatus(int adstatus) {
		this.adstatus = adstatus;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adname == null) ? 0 : adname.hashCode());
		result = prime * result + ((adpsd == null) ? 0 : adpsd.hashCode());
		result = prime * result + adstatus;
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
		Admin other = (Admin) obj;
		if (adname == null) {
			if (other.adname != null)
				return false;
		} else if (!adname.equals(other.adname))
			return false;
		if (adpsd == null) {
			if (other.adpsd != null)
				return false;
		} else if (!adpsd.equals(other.adpsd))
			return false;
		if (adstatus != other.adstatus)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adname=" + adname + ", adpsd=" + adpsd
				+ ", adstatus=" + adstatus + "]";
	}
	
	
	

}
