package com.iotek.bizimpl;

import java.util.List;

import com.iotek.biz.GoodBiz;
import com.iotek.dao.GoodDao;
import com.iotek.dao.impl.GoodDaoImpl;
import com.iotek.entry.Good;

public class GoodBizImpl  implements GoodBiz{
	
	private GoodDao goodDao;
	public GoodBizImpl() {
		goodDao=new GoodDaoImpl();
	}
	@Override
	public List<Good> allGood() {
		
		return goodDao.allGood();
	}
	@Override
	public int totalRow() {
		
		return goodDao.totalRow();
	}
	@Override
	public int totalPage(int totalRow, int defaultRow) {
			int res=totalRow%defaultRow==0?(totalRow/defaultRow):(totalRow/(defaultRow+1));
		return res;
	}
	@Override
	public int nowRow(int currentpage, int totalPage, int totalRow,
			int defaultRow) {
		int nowRow= (currentpage==totalPage)?(totalRow-(currentpage-1)*defaultRow):defaultRow;
		return nowRow;
	}
	@Override
	public List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow) {
		
		return goodDao.selectNowGood(currentpage, totalRow, defaultRow);
	}

}
