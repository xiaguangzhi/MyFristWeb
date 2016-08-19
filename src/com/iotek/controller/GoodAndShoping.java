package com.iotek.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.GoodBiz;
import com.iotek.biz.UserBiz;
import com.iotek.bizimpl.GoodBizImpl;
import com.iotek.bizimpl.UserBizImpl;
import com.iotek.entry.GoodInfo;
import com.iotek.entry.User;
import com.iotek.entry.UserInfo;

/**
 * Servlet implementation class GoodAndShoping
 */
@WebServlet("/goodAndshoping.do")
public class GoodAndShoping extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GoodAndShoping() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		int goodid = Integer.parseInt(request.getParameter("goodid"));
		// System.out.println("/goodAndshoping.do:"+goodid);
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		GoodBiz goodbiz = new GoodBizImpl();
		GoodInfo goodinfo = goodbiz.selectGoodInfo(goodid);
		session.setAttribute("goodinfoitem", goodinfo);
		if (user != null) {
			// 当用户不为空时
			// 查看用户的金额 如果该用户的余额不够支付该商品弹出余额不足，请先充资的对话框
			// 如果用户余额足够 跳转到该用户订单页面 生成订单 用户输入支付密码后减掉余额金额
			// 写入订单表
			// 1：通过商品id返回商品信息
			UserBiz userBiz = new UserBizImpl();
			UserInfo userInfo = userBiz.selectUserInfo(user.getId());

			session.setAttribute("userinfo", userInfo);
			System.out.println(userInfo.toString());

			// 跳转到输入密码完成订单页面
			System.out.println("妈的");
			response.getWriter()
					.print("<script language='javascript'>alert('前往支付');"
							+ "	window.location.href='pages/pay.jsp';</script>");

		} else {
			// 当用户没有登录时弹出请先登录 跳转到登录页面 用户登录后在跳转到该servlet
			System.out.println("妈的");
			response.getWriter()
					.print("<script language='javascript'>alert('请先登录');"
							+ "	window.location.href='pages/userLogin.jsp';</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
