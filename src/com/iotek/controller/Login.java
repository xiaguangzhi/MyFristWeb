package com.iotek.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iotek.biz.UserBiz;
import com.iotek.bizimpl.UserBizImpl;
import com.iotek.entry.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		propress(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		propress(request, response);
	}
	public  void propress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("name");
		String password=request.getParameter("password");
		UserBiz  userbiz=new UserBizImpl();
		
		User user = userbiz.login(name, password);
		HttpSession session = request.getSession();
		if (user!=null) {
			
			session.setAttribute("user", user);
			request.getRequestDispatcher("pages/loginSuccess.jsp").forward(request,response);
			
		}else {
			response.getWriter().print("<script language='javascript'>alert('用户名或密码错误');window.location.href='pages/userLogin.jsp';</script>");   
			/*session.setAttribute("errorMsg","用户名或密码错误");
            request.getRequestDispatcher("pages/userLogin.jsp").forward(request,response);*/
		}
		
		
		

	}

}
