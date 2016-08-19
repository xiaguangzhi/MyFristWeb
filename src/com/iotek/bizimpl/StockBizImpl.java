package com.iotek.bizimpl;

import java.util.List;

import com.iotek.biz.StockBiz;
import com.iotek.dao.StockDao;
import com.iotek.dao.impl.StockDaoImpl;
import com.iotek.entry.Stock;

public class StockBizImpl implements StockBiz{
	private StockDao stockdao=null;
	public StockBizImpl() {
		stockdao=new StockDaoImpl();
	}
	@Override
	public int  selectStock(int goodid) {
		List<Stock> selectStock = stockdao.selectStock(goodid);
		int stockGoodCount=0;
		for (Stock stock : selectStock) {
			stockGoodCount+=stock.getGoodcount();
		}
		return stockGoodCount;
	}
	@Override
	public boolean updateGoodCount(int num, int goodid) {
		List<Stock> selectStock = stockdao.selectStock(goodid);
			for (Stock stock : selectStock) {
				if (stock.getGoodcount()>0) {
					return stockdao.updateGoodCount(stock.getId(),num);
				}
			}
		return false;
	}

}
