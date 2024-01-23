package com.validation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connector.*;

/**
 * Servlet implementation class account
 */
@WebServlet("/acc1")
public class account extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Connection con=Connector.getConnection();
	String name=req.getParameter("name");
	String email=req.getParameter("email");
	String pass=req.getParameter("pass");
	String query="insert into acc values(?,?,?)";
	PreparedStatement pstmt;
	try {
		pstmt = con.prepareStatement(query);
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setString(3, pass);
		int i=pstmt.executeUpdate();
		RequestDispatcher rd=req.getRequestDispatcher("accmsg.html");
		rd.include(req, resp);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
