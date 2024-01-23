package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.VendorDao;
import com.dto.Vendor;

/**
 * Servlet implementation class AddVendor
 */
@WebServlet("/Add1")
public class AddVendor extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	resp.setContentType("text/html");
	PrintWriter w = resp.getWriter();
	String name = req.getParameter("name");
	long bank = Long.parseLong(req.getParameter("account"));
	String account = req.getParameter("bank");
	String add1 = req.getParameter("add1");
	String add2 = req.getParameter("add2");
	String city = req.getParameter("city");
	String country = req.getParameter("country");
	int zipcode =Integer.parseInt(req.getParameter("zipcode"));
	UUID uuid=UUID.randomUUID();
	String id=uuid.toString();
	Vendor r=new Vendor(name,bank,account,add1,add2,city,country,zipcode,id);
    VendorDao v=new VendorDao();
    boolean b = v.addVendor(r);
    if(b) {
    	w.println("<h3>successfully added</h3>");
    	RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
    	rd.include(req, resp);
    	
    }
    else {
    	w.println("<h3>Error!!!!!</h3>");
    	
    }
	
}

}
