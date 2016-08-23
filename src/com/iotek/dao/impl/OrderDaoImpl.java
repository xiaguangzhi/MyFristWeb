package com.iotek.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.iotek.dao.OrderDao;
import com.iotek.entry.Order;

public class OrderDaoImpl  extends BaseDao implements OrderDao{

	@Override
	public boolean addOrder(Order order) {
		String sql="insert into orders(uid,orderdate,totalmoney,orderstate)values(?,?,?,?)";
		List<Object> params=new ArrayList<Object>();
		params.add(order.getUid());
		params.add(order.getOrderdate());
		params.add(order.getTotalmoney());
		params.add(order.getOrderstate());
		return operUpdate(sql, params);
	}

}
