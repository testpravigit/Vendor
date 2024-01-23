package com.crud;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.VendorDao;

/**
 * Servlet implementation class DeleteVendor
 */
@WebServlet("/Delete1")
public class DeleteVendor extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id = req.getParameter("id");
	System.out.println("id anme"+id);
	String p = req.getParameter("opt");
	System.out.println("buton value"+p);
	if(p.equals("yes"))
	{
		resp.setContentType("text/html");
		PrintWriter w = resp.getWriter();
		 VendorDao v=new VendorDao();
		    boolean b = v.deleteVendor(id);
		    if(b) 
		    {
		    	
		    	RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
		    	rd.include(req, resp);
		    	
		    }
		    else
		    {
		    	w.println("<h3>Error!!!!!</h3>");
		    	
		    }
	}
	else {
		RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
    	rd.include(req, resp);
		
	}
		   
		
	
	
	}

}
