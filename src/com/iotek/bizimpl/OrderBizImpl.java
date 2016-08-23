package com.iotek.bizimpl;

import com.iotek.biz.OrderBiz;
import com.iotek.dao.OrderDao;
import com.iotek.dao.impl.OrderDaoImpl;
import com.iotek.entry.Order;

public class OrderBizImpl implements OrderBiz{
	private OrderDao orderDao;
	public OrderBizImpl() {
		orderDao=new OrderDaoImpl();
	}

	@Override
	public boolean addOrder(Order order) {
		
		return orderDao.addOrder(order);
	}

}
