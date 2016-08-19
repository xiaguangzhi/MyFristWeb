package com.iotek.controller;
/**
 * @author xiaohuang
 */

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.UserBiz;
import com.iotek.bizimpl.UserBizImpl;
import com.iotek.entry.User;
import com.iotek.entry.UserDetail;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register.do")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		propress(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		propress(request, response);
	}

	private void propress(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("tel");
		

		UserBiz userbiz = new UserBizImpl();
		// 通过用户名查找，如果查找出有该用户不存在，
		// 将该用户信息添加到user表 通过查询得到用户id 再将用户的详细信息和用户id添加到用户详情表
		// 否则提示请选择登陆或者用户名已被注册

		User checkUser = userbiz.checkName(name);
		HttpSession session = request.getSession();
		

		if (checkUser == null) {
			User user = new User(name, password);
			// 向user表里插入用户信息
			boolean addflag = userbiz.addUser(user);

			if (addflag) {
				// 查询用户信息
				User selectUser = userbiz.login(name, password);
				// 将用户id 邮箱和手机号码插入Userdetial里
				UserDetail detail = new UserDetail(selectUser.getId(), "0",
						phone, email);
				userbiz.addUserDeatail(detail);

				session.setAttribute("userdetail", detail);
				request.getRequestDispatcher("pages/registerSuccess.jsp").forward(
						request, response);

			} else {
				
				session.setAttribute("errorMsg", "注册失败，请重新注册");
				request.getRequestDispatcher("pages/register.jsp").forward(request,
						response);

			}

		} else {
			session.setAttribute("errorMsg", "用户已存在");
			request.getRequestDispatcher("pages/register.jsp").forward(request,response);
		}
	}

}
