package com.iotek.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.GoodBiz;
import com.iotek.biz.StockBiz;
import com.iotek.bizimpl.GoodBizImpl;
import com.iotek.bizimpl.StockBizImpl;
import com.iotek.entry.Good;
import com.iotek.entry.Stock;

/**
 * Servlet implementation class Innerstock
 */
@WebServlet("/innerstock.do")
public class InnerStock extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InnerStock() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
		Good goods = (Good) session.getAttribute("addgoodstock");
		int goodsNumber = Integer.parseInt(request.getParameter("number"));
		StockBiz stockBiz=new StockBizImpl();
		
		boolean updateGoodCount=false;
		//先查看库存表里是否存在该商品   如果存在更新库存
//		如果不存在添加库存信息
		if (stockBiz.selectStocks(goods.getId())) {
			Stock stock=new Stock();
			stock.setGid(goods.getId());
			stock.setGoodcount(-1);
			stock.setAdid(1);//默认为1系统
			 updateGoodCount = stockBiz.updateGoodCount(stock);
		}else {
			Stock stock=new Stock(goods.getId(), 1,goodsNumber);
		
			updateGoodCount=stockBiz.addStock(stock);
			
		}
		
		
		if (updateGoodCount) {
			response.getWriter()
			.print("<script language='javascript'>alert('添加成功');"
					+ "	window.location.href='pages/addstock.jsp';</script>");
		}else {
			response.getWriter()
			.print("<script language='javascript'>alert('添加失败');"
					+ "	window.location.href='pages/addstock.jsp';</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
