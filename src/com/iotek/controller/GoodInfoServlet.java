package com.iotek.controller;
/**
 * @author xiaohuang
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.GoodBiz;
import com.iotek.bizimpl.GoodBizImpl;
import com.iotek.entry.GoodInfo;

/**
 * Servlet implementation class GoodInfoServlet
 */
@WebServlet("/goodinfo.do")
public class GoodInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String	id= request.getParameter("goodid");
		GoodBiz goodBiz=new GoodBizImpl();
		GoodInfo itemgoodInfo = goodBiz.selectGoodInfo(Integer.parseInt(id));
		HttpSession session = request.getSession();
		session.setAttribute("itemgoodInfo", itemgoodInfo);
		request.getRequestDispatcher("pages/goodsinfo.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
