package com.iotek.biz;

import com.iotek.entry.Stock;

public interface StockBiz {
	public int  selectStock(int goodid);
	public boolean selectStocks(int goodid);

	public boolean updateGoodCount(Stock stock);
	public boolean addStock(Stock stock);
}
