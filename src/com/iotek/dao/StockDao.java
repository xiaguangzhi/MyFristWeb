package com.iotek.dao;

import java.util.List;

import com.iotek.entry.Stock;

public interface StockDao {
	public List<Stock> selectStock(int goodid);

	public boolean updateGoodCount(int id, int num);

}
