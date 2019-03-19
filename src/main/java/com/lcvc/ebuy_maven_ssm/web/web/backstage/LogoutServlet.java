package com.lcvc.ebuy_maven_ssm.web.web.backstage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/backstage/logout")
public class LogoutServlet extends HttpServlet {

	
	private HttpServletResponse resp;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		response.sendRedirect(basePath+"/jsp/backstage/login.jsp");
	}
	}

	
