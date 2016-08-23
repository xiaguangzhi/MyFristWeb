package com.iotek.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.OrderBiz;
import com.iotek.biz.StockBiz;
import com.iotek.biz.UserBiz;
import com.iotek.bizimpl.OrderBizImpl;
import com.iotek.bizimpl.StockBizImpl;
import com.iotek.bizimpl.UserBizImpl;
import com.iotek.entry.GoodInfo;
import com.iotek.entry.Order;
import com.iotek.entry.Stock;
import com.iotek.entry.UserInfo;

/**
 * Servlet implementation class Pay
 */
@WebServlet("/pay.do")
public class Pay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pay() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		HttpSession session = request.getSession();
		UserInfo userinfo = null;
		GoodInfo goodinfo = null;

		userinfo = (UserInfo) session.getAttribute("userinfo");

		goodinfo = (GoodInfo) session.getAttribute("goodinfoitem");
		double money=Double.parseDouble(userinfo.getMoney()+"")-goodinfo.getGprice().doubleValue();
			
			
			Order order=new Order();
			order.setUid(userinfo.getId());
			order.setTotalmoney(goodinfo.getGprice().toString());
			order.setOrderdate(new Timestamp(new Date().getTime()));
			OrderBiz orderBiz=new OrderBizImpl();
			
			//查询改用户所有订单信息放入session；
			session.setAttribute("order",order);
				if (money<0) {
					order.setOrderstate(0);//订单未支付
//					订单表增加该订单
					orderBiz.addOrder(order);
					response.getWriter()
					.print("<script language='javascript'>alert('余额不足');"
							+ "	window.location.href='pages/order.jsp';</script>");
					return;
				}
				StockBiz stockBiz=new StockBizImpl();
				//获得商品库存
				int stockGoodCount = stockBiz.selectStock(goodinfo.getId());
				if (stockGoodCount<=0) {
					order=null;
					response.getWriter()
					.print("<script language='javascript'>alert('抱歉，库存不足');"
							+ "	window.location.href='index.jsp';</script>");
					return;
				}
				UserBiz userBiz=new UserBizImpl();
			boolean updateMoney = userBiz.updateMoney(money,userinfo.getId());
			//支付成功
			if (updateMoney) {
				order.setOrderstate(1);//订单已支付
				Stock stock=new Stock();
				stock.setGid(goodinfo.getId());
				stock.setGoodcount(-1);
				stock.setAdid(1);//默认为1系统
				boolean updateGoodCount = stockBiz.updateGoodCount(stock);
				System.out.println(updateGoodCount);
//				订单表增加该订单
				orderBiz.addOrder(order);
				response.getWriter()
				.print("<script language='javascript'>alert('下单成功');"
						+ "	window.location.href='pages/order.jsp';</script>");
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
