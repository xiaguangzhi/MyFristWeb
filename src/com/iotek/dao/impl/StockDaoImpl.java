package com.iotek.dao.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.iotek.dao.StockDao;
import com.iotek.entry.Stock;

public class StockDaoImpl extends BaseDao implements StockDao{

	@Override
	public Stock selectStock(int goodid) {
		String sql="select *from stock where gid=?";
		List<Object> params = new ArrayList<Object>();
		params.add(goodid);
		List<Stock> list=new ArrayList<Stock>();
		try {
			list=operQuery(sql, params, Stock.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (list.size()>0) {
			return list.get(0);
		}
		return null;
		
	}

	@Override
	public boolean updateGoodCount(Stock stock) {
		
		String sql="update stock set goodcount=goodcount+("+stock.getGoodcount()+")where gid=?";
		List<Object> params = new ArrayList<Object>();
		System.out.println(sql);
		params.add(stock.getGid());
		boolean flag=false;
		if (stock.getGoodcount()>0) {
			flag = addStock(stock);
		}else {
			flag=removeStock(stock);
		}
		return operUpdate(sql, params)&&flag;
	}
	
	@Override
	public boolean addStock(Stock stock) {
		String sql="insert into stock(gid,adid,goodcount)values(?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(stock.getGid());
		params.add(stock.getAdid());
		params.add(stock.getGoodcount());
		return operUpdate(sql, params);
		
	}

	@Override
	public boolean addOuterStock(Stock stock) {
		String sql="insert into innerstock(gid,adid,innercount,innerdate)values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(stock.getGid());
		params.add(stock.getAdid());
		params.add(stock.getGoodcount());
		params.add(new Timestamp(new Date().getTime()).toString());
	
		
		return operUpdate(sql, params);
	}

	@Override
	public boolean removeStock(Stock stock) {
		String sql="insert into outstock(gid,adid,outcount,outdate)values(?,?,?,?)";
		List<Object> params = new ArrayList<Object>();
		params.add(stock.getGid());
		params.add(stock.getAdid());
		params.add(Math.abs(stock.getGoodcount()));
		params.add(new Timestamp(new Date().getTime()).toString());
		return operUpdate(sql, params);
	}
	

}
