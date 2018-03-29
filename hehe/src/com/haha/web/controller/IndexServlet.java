package com.haha.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.haha.service.UserService;

public class IndexServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService service=new UserService();
		request.setAttribute("allUsers", service.getAll());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
