package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter w = res.getWriter();
		String uname = req.getParameter("uname");
		w.print("Welcome"+ ": "+uname);
		w.print("<a href='7AUI.html'><br>Go Back</a>");
	}

}
