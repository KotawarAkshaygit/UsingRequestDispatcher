package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("uname");
		String password=request.getParameter("pwd");
		
		System.out.println("Initail");
		request.setAttribute("uname", name);
		if(password.contentEquals("Isteer"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
			
		}
		else
		{
			
			RequestDispatcher rd1=request.getRequestDispatcher("index.html");
			rd1.forward(request, response);
		}
	}

}
