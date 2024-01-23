package com.validation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connector.*;

/**
 * Servlet implementation class Forget
 */
@WebServlet("/frgt1")
public class Forget extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con=Connector.getConnection();
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		String query="update acc set email=? ,password=? where name=?";
		try {
			PreparedStatement pstmt= con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, pass);
			pstmt.setString(3, name);
			int i=pstmt.executeUpdate();
			resp.setContentType("text/html");
			PrintWriter w=	resp.getWriter();
			w.print("<h3>User name and Password Succesfully updated</h3>");
			w.print("<a href=\"index.jsp\">click here</a>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
