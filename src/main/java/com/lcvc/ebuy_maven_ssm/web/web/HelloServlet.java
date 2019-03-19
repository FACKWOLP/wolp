package com.lcvc.ebuy_maven_ssm.web.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/hello")
public class HelloServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session=req.getSession();
		session.setAttribute("name", "王麻子");
		resp.sendRedirect("hello.jsp");
	
		/*request.setAttribute("","");
		request.getRequestDis
	*/
	}
	
}