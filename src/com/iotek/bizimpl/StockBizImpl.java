package com.iotek.bizimpl;

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
		Stock stock = stockdao.selectStock(goodid);
		if (stock!=null) {
			return stock.getGoodcount();
		}
		 
	
		return 0;
	}
	@Override
	public boolean updateGoodCount(Stock stock) {
		
		return stockdao.updateGoodCount(stock);
	}
	@Override
	public boolean selectStocks(int goodid) {
		if (stockdao.selectStock(goodid)!=null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean addStock(Stock stock) {
		
		return stockdao.addStock( stock);
	}

}
