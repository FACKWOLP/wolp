package com.lcvc.ebuy_maven_ssm.web.web.backstage;

import com.lcvc.ebuy_maven_ssm.web.dao.AdminDao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns="/login")
public class loginServlet extends HttpServlet {
AdminDao adminDao=new AdminDao();

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path=request.getContextPath();
		String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		String username=request.getParameter("a");
		String password=request.getParameter("b");
		
		if(new AdminDao().login(username,password)) response.sendRedirect(basePath + "/jsp/backstage/main.html");
		else{
			response.sendRedirect(basePath+"/jsp/backstage/login.jsp");
		}	
	
		
		//response.sendRedirect(basePath+"/jsp/login.jsp");
	}

	
}

