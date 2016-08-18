package com.iotek.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.GoodBiz;
import com.iotek.bizimpl.GoodBizImpl;
import com.iotek.entry.Good;

/**
 * Servlet implementation class ShowGoods
 */
@WebServlet("/showgoods.do")
public class ShowGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowGoods() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process( request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process( request, response);
	}
	public void process(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		int currentpage=Integer.parseInt(request.getParameter("currentpage"));
		final int defaultRow=15;
		GoodBiz goodbiz=new GoodBizImpl();
		//获得商品总行数
		int totalRow= goodbiz.totalRow();
		//通过总行数除以总页数可以得到共有多少页
		int totalPage = goodbiz.totalPage(totalRow, defaultRow);
		
		
		//获得当前页要显示的个数
		int nowRow = goodbiz.nowRow(currentpage, totalPage, totalRow, defaultRow);
		//	查询指定数量的商品显示在页面
		List<Good> nowGood = goodbiz.selectNowGood(currentpage, totalRow, defaultRow);
		/*List<Good> nowGood=goodbiz.allGood();*/
		/*for (Good good : nowGood) {
			System.out.println(good);
		}*/
		
		HttpSession session = request.getSession();
		session.setAttribute("goodList", nowGood);
		session.setAttribute("totalpage", totalPage);
		session.setAttribute("nowRow",nowRow);
		try {
			request.getRequestDispatcher("pages/showgoods.jsp").forward(request,response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
