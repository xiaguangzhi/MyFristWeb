package com.iotek.biz;
/**
 * @author xiaohuang
 */

import java.util.List;

import com.iotek.entry.Good;
import com.iotek.entry.GoodDetail;
import com.iotek.entry.GoodInfo;

public interface GoodBiz {
	public boolean addGood(Good good,GoodDetail goodDetail);
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
	//查询12个商品详情
	public List<GoodInfo> selectGoodInfo();
	public Good selectGood(int id);
	//通过商品id查询商品的详细信息
	public GoodInfo selectGoodInfo(int id);

}
