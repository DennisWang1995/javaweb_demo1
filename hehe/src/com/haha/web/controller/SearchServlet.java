package com.haha.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haha.domain.Condition;
import com.haha.service.UserService;

public class SearchServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		int status=Integer.parseInt(request.getParameter("status"));
		Condition c=new Condition(name, status);
		UserService service=new UserService();
		request.setAttribute("allUsers", service.getByCondition(c));
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
}
