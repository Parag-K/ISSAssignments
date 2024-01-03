package com.user;

import java.io.IOException;
import java.sql.DriverManager;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet{
	
	private static final long serialVersionUID=1L;
	
	public LoginServlet()
	{
		super();
		
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/paragdb","root","ShreeVallabh");
			 String name=request.getParameter("textName");
			 String password=request.getParameter("textpwd");
			 
			 PreparedStatement pst = con.prepareStatement("SELECT * from login WHERE username=? AND password=?");
			 
			 pst.setString(1,name);
			 pst.setString(2,password);
			 
			 ResultSet rs=pst.executeQuery();
			 
			 if(rs.next())
			 {
				 response.sendRedirect("success.jsp");
			 }
			 else
			 {
				 response.sendRedirect("error.jsp");
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
}