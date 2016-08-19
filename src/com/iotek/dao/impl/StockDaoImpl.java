package com.iotek.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.StockDao;
import com.iotek.entry.Stock;

public class StockDaoImpl extends BaseDao implements StockDao{

	@Override
	public List<Stock> selectStock(int goodid) {
		String sql="select *from stock where gid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(goodid);
		List<Stock> list=null;
		try {
			list=operQuery(sql, params, Stock.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public boolean updateGoodCount(int id, int num) {
		String sql="update stock set goodcount=goodcount+? where id=?";
		List<Object> params = new ArrayList<Object>();
		params.add(num);
		params.add(id);
		return operUpdate(sql, params);
	}
	

}
