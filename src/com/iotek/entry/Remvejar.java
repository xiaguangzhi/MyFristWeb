package com.iotek.entry;

import java.sql.Timestamp;

public class Remvejar {
	private int id;
	private int gid;
	private int adid;
	private Timestamp removedate;

	public Remvejar() {
		super();
	}

	public Remvejar(int id, int gid, int adid, Timestamp removedate) {
		super();
		this.id = id;
		this.gid = gid;
		this.adid = adid;
		this.removedate = removedate;
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

	public Timestamp getRemovedate() {
		return removedate;
	}

	public void setRemovedate(Timestamp removedate) {
		this.removedate = removedate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adid;
		result = prime * result + gid;
		result = prime * result + id;
		result = prime * result
				+ ((removedate == null) ? 0 : removedate.hashCode());
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
		Remvejar other = (Remvejar) obj;
		if (adid != other.adid)
			return false;
		if (gid != other.gid)
			return false;
		if (id != other.id)
			return false;
		if (removedate == null) {
			if (other.removedate != null)
				return false;
		} else if (!removedate.equals(other.removedate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Remvejar [id=" + id + ", gid=" + gid + ", adid=" + adid
				+ ", removedate=" + removedate + "]";
	}

}
