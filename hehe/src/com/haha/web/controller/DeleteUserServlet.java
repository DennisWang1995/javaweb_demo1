package com.haha.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haha.service.UserService;

public class DeleteUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operatorId=Integer.parseInt(request.getParameter("operatorId"));
		UserService service=new UserService();
		service.deleteUser(operatorId);
		response.sendRedirect(request.getContextPath()+"/index");
	}
}
