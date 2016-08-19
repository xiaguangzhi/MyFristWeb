package com.iotek.controller;
/**
 * @author xiaohuang
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.iotek.biz.GoodBiz;
import com.iotek.bizimpl.GoodBizImpl;
import com.iotek.entry.Good;
import com.iotek.entry.GoodDetail;

/**
 * Servlet implementation class AddGoods
 */
@MultipartConfig
@WebServlet("/addGoods.do")
public class AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGoods() {
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
			String goodsName = request.getParameter("goods");
		
			String price=request.getParameter("price");
			BigDecimal gprice=new BigDecimal(price);
			String type=request.getParameter("type");
		
			Collection<Part> parts = request.getParts();
			List<String> list=new ArrayList<String>();
			String caption = request.getParameter("msg");
			
			String realPath = request.getServletContext().getRealPath("/");
			for (Part part : parts) {
				if (part.getName().startsWith("image")) {
					String filename=getFilename(part);
					if ("".equals(filename)) {
						list.add("images/wutu.png");
					}else {
						list.add("images/"+filename);
						writeTo(filename, part,realPath);
					}
					
				}
			}
			GoodBiz  goodBiz=new GoodBizImpl();
		
			Good good=new Good(goodsName, gprice, type);
			GoodDetail goodDetail=new GoodDetail(list.get(0), list.get(1), list.get(2), list.get(3), caption);
			
			boolean addGood = goodBiz.addGood(good, goodDetail);
			if (addGood) {
				
				
				response.getWriter().print("<script language='javascript'>alert('商品添加成功');window.location.href='pages/addGoods.jsp';</script>");   
				
			}else {
				response.getWriter().print("<script language='javascript'>alert('商品添加失败');window.location.href='pages/addGoods.jsp';</script>");   
				/*session.setAttribute("errorMsg","用户名或密码错误");
	            request.getRequestDispatcher("pages/userLogin.jsp").forward(request,response);*/
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
	private void   writeTo(String filename,Part part ,String realPath) throws IOException{
		InputStream inputStream = part.getInputStream();
		OutputStream os=new FileOutputStream(realPath+"images/"+filename);
		byte[] car=new byte[1024];
		int len=-1;
		while (-1!=(len=inputStream.read(car))) {
			os.write(car,0,len);
			
		}
		inputStream.close();
		os.close();
		
	}
	private String getFilename(Part part){
		String header=part.getHeader("Content-Disposition");
		System.out.println("header"+header);
		String filename=header.substring(header.indexOf("filename=\"")+10, header.lastIndexOf("\""));
		return filename;
	
	}

}
