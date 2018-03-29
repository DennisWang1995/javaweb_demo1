package com.haha.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haha.domain.User;
import com.haha.service.UserService;

/**
 * Servlet implementation class GetUserServlet
 */
public class GetUserServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int operatorId=Integer.parseInt(request.getParameter("operatorId"));
		UserService service=new UserService();
		User user=service.getUser(operatorId);
		request.setAttribute("user", user);
		request.getRequestDispatcher("/update.jsp").forward(request, response);
	}
}
