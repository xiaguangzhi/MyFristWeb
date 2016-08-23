package com.iotek.bizimpl;
/**
 * @author xiaohuang
 */

import java.util.ArrayList;
import java.util.List;

import com.iotek.biz.GoodBiz;
import com.iotek.dao.GoodDao;
import com.iotek.dao.impl.GoodDaoImpl;
import com.iotek.entry.Good;
import com.iotek.entry.GoodDetail;
import com.iotek.entry.GoodInfo;

public class GoodBizImpl implements GoodBiz {

	private GoodDao goodDao;

	public GoodBizImpl() {
		goodDao = new GoodDaoImpl();
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
		int res = totalRow % defaultRow == 0 ? (totalRow / defaultRow)
				: (totalRow / (defaultRow + 1));
		return res;
	}

	@Override
	public int nowRow(int currentpage, int totalPage, int totalRow,
			int defaultRow) {
		int nowRow = (currentpage == totalPage) ? (totalRow - (currentpage - 1)
				* defaultRow) : defaultRow;
		return nowRow;
	}

	@Override
	public List<Good> selectNowGood(int currentpage, int totalRow,
			int defaultRow) {

		return goodDao.selectNowGood(currentpage, totalRow, defaultRow);
	}

	@Override
	public boolean addGood(Good good, GoodDetail goodDetail) {
		if (goodDao.addGoods(good)) {
			goodDetail.setGid(goodDao.selectGoods(good).getId());

		}
		if (goodDao.addGoodsDetail(goodDetail)) {
			return true;
		}
		return false;
	}

	@Override
	public List<GoodInfo> selectGoodInfo() {
		List<GoodInfo> list = new ArrayList<GoodInfo>();
		List<GoodInfo> info = goodDao.selectGoodInfo();
		int i = 0;
		for (GoodInfo goodInfo : info) {

			if (goodInfo.getImage1() != null) {
				list.add(goodInfo);
				i++;
			}
			if (i==12) {
				break;
			}

		}
		return list;
	}

	@Override
	public GoodInfo selectGoodInfo(int id) {
		
		return goodDao.selectGoodInfo(id);
	}

	@Override
	public Good selectGood(int id) {
		
		return goodDao.selectGoods(id);
	}

}
