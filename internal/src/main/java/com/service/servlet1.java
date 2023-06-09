package com.service;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class servlet1 extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException
	{
        res.setContentType("text/html");
        PrintWriter write = res.getWriter();
        String uname= req.getParameter("uname");
        String pw = req.getParameter("age");
     
        int age = Integer.parseInt(pw);
        if (age >= 18) {
        	RequestDispatcher rd = req.getRequestDispatcher("servlet2");
        	rd.forward(req,res);
        } else {
            write.print(" You must be at least 18 years old for Voting........");
        }

        
        
        
}
	}

