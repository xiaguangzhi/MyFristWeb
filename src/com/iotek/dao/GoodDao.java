package com.iotek.dao;

import java.util.List;

import com.iotek.entry.Good;
import com.iotek.entry.GoodDetail;
import com.iotek.entry.GoodInfo;

public interface GoodDao {
	public boolean addGoods(Good good);
	public boolean addGoodsDetail(GoodDetail detail);
	public Good selectGoods(Good good);
	public  List<Good> allGood();
	public  int totalRow();
	public  List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow);
	public List<GoodInfo> selectGoodInfo();
	

}
