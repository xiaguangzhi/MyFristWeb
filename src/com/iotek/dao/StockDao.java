package com.iotek.dao;

import java.util.List;

import com.iotek.entry.Stock;

public interface StockDao {
	public Stock selectStock(int goodid);

	public boolean updateGoodCount(Stock stock);

	public boolean addStock(Stock stock);
	public boolean addOuterStock(Stock stock);
	public boolean removeStock(Stock stock);
	
}
