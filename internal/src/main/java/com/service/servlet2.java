package com.service;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet2  extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
        res.setContentType("text/html");
        PrintWriter write = res.getWriter();
        String uname= req.getParameter("uname");
        write.print("Congrats.. You are eligible for Voting --- ");
        write.print("<a href='INT1UI.html'>  Go Back   </a>");
        
	}
}

