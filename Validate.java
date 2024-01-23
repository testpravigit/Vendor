package com.validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connector.Connector;

/**
 * Servlet implementation class Validate
 */
@WebServlet("/Valid1")
public class Validate extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	System.out.println("vaidate");
	String email= req.getParameter("email");
	String pass= req.getParameter("password");
	Connection con=Connector.getConnection();
	resp.setContentType("text/html");
    PrintWriter w=	resp.getWriter();

	
	
	String query="select name from acc where email=? and password=?";
	try {
		PreparedStatement pstmt =con.prepareStatement(query);
		pstmt.setString(1, email);
		pstmt.setString(2, pass);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next()) {
			String a=rst.getString(1);
			System.out.println(rst.getString(1));
//			w.print("<h3>Welcome "+ a +" </h3>");
			RequestDispatcher rd=req.getRequestDispatcher("homepage.jsp?id="+a+"");
			rd.include(req, resp);
			
		}
		
		else 
		{
			w.print("<h3>Login failed!!!.Enter correct email and password</h3>");
			RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
			rd.include(req, resp);
			
			
		}
		
		
		
		
		
		
		
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
