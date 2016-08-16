package com.iotek.biz;

import java.util.List;

import com.iotek.entry.Good;

public interface GoodBiz {
	//所有商品信息
	public List<Good> allGood();
	//总行数
	public int totalRow();
	//总的商品页数
	public int totalPage(int totalRow,int defaultRow);
	//当前页显示的行数
	public int nowRow(int currentpage,int totalPage,int totalRow,int defaultRow);
	//查询当前页显示的商品信息
	public List<Good> selectNowGood(int currentpage,int totalRow,int defaultRow);
	
	

}
