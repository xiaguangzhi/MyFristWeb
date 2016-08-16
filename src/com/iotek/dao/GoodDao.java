package com.iotek.dao;

import java.util.List;

import com.iotek.entry.Good;

public interface GoodDao {
	public  List<Good> allGood();
	public  int totalRow();
	public  List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow);
	
	

}
