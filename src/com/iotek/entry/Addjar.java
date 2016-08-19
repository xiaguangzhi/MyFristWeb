package com.iotek.entry;

import java.sql.Timestamp;

public class Addjar {
	private int  id;
	private int gid;
	private int adid;
	private Timestamp adddate;
	public Addjar() {
		// TODO Auto-generated constructor stub
	}
	public Addjar(int id, int gid, int adid, Timestamp adddate) {
		super();
		this.id = id;
		this.gid = gid;
		this.adid = adid;
		this.adddate = adddate;
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
	public Timestamp getAdddate() {
		return adddate;
	}
	public void setAdddate(Timestamp adddate) {
		this.adddate = adddate;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adddate == null) ? 0 : adddate.hashCode());
		result = prime * result + adid;
		result = prime * result + gid;
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
		Addjar other = (Addjar) obj;
		if (adddate == null) {
			if (other.adddate != null)
				return false;
		} else if (!adddate.equals(other.adddate))
			return false;
		if (adid != other.adid)
			return false;
		if (gid != other.gid)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Addjar [id=" + id + ", gid=" + gid + ", adid=" + adid
				+ ", adddate=" + adddate + "]";
	}
	
	

}
