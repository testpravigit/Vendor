package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connector.Connector;
import com.dto.Vendor;

public class VendorDao {
	public List<Vendor> getVendor() {
		Vendor v= null;
		List<Vendor> l=new ArrayList();
		Connection con=Connector.getConnection();
		String query="select * from vendor";
		try {
			Statement stmt = con.createStatement();
			 ResultSet rst = stmt.executeQuery(query);
			 while(rst.next()) {
			v=new Vendor();
				 System.out.println(rst.getString(1));
				 v.setName(rst.getString(1));
				 v.setAccount_num(rst.getLong(2));
				 v.setBankName(rst.getString(3));
				 v.setAddres1(rst.getString(4));
				 v.setAddres2(rst.getString(5));
				 v.setCity(rst.getString(6));
				 v.setCountry(rst.getString(7));
				 v.setZipcode(rst.getInt(8));
				 v.setId(rst.getString(9));
				 l.add(v);
				 
			 }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return l;
		
	}
	
public Vendor getSingleVendor(String id) {
	Vendor v= new Vendor();
	
	Connection con=Connector.getConnection();
	String query="select * from vendor where id=?";
	try {
	 PreparedStatement pstmt = con.prepareStatement(query);
	 pstmt.setString(1, id);
		 ResultSet rst = pstmt.executeQuery();
		 while(rst.next()) {
		
			 System.out.println(rst.getString(1));
			 v.setName(rst.getString(1));
			 v.setAccount_num(rst.getLong(2));
			 v.setBankName(rst.getString(3));
			 v.setAddres1(rst.getString(4));
			 v.setAddres2(rst.getString(5));
			 v.setCity(rst.getString(6));
			 v.setCountry(rst.getString(7));
			 v.setZipcode(rst.getInt(8));
			 v.setId(rst.getString(9));
			 
			 
		 }
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	return v;
		
	}
public boolean addVendor(Vendor v) {
	String query="insert into vendor values(?,?,?,?,?,?,?,?,?)";
	Connection con=Connector.getConnection();
	boolean f=false;

	int i=0;
	try {
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, v.getName());
		pstmt.setLong(2, v.getAccount_num());
		pstmt.setString(3, v.getBankName());
		pstmt.setString(4, v.getAddres2());
		pstmt.setString(5, v.getAddres2());
		pstmt.setString(6, v.getCity());
		pstmt.setString(7, v.getCountry());
		pstmt.setInt(8, v.getZipcode());
		pstmt.setString(9, v.getId());
		 i=pstmt.executeUpdate();
		 if(i>0) {
			 f=true;
		 }
		System.out.println(i);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return f;
	
}
public boolean updateVendor(Vendor v) {
	String query="update vendor set name=?,bank_account_num=?,bank_name=?,address_one=?,address_two=?,city=?,country=?,zipcode=? where id=?";
	Connection con=Connector.getConnection();
	boolean f=false;
	try {
		PreparedStatement pstmt=con.prepareStatement(query);

		pstmt.setString(1, v.getName());
		pstmt.setLong(2, v.getAccount_num());
		pstmt.setString(3, v.getBankName());
		pstmt.setString(4, v.getAddres1());
		pstmt.setString(5, v.getAddres2());
		pstmt.setString(6, v.getCity());
		pstmt.setString(7, v.getCountry());
		pstmt.setInt(8, v.getZipcode());
		pstmt.setString(9, v.getId());
		int i=pstmt.executeUpdate();
		System.out.println(i);
		if(i>0) {
			f=true;
		}
	
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	return f;
	
}
public boolean deleteVendor(String id) {
	String query="delete from vendor where id=?";
	Connection con=Connector.getConnection();
	System.out.println(id);
	boolean f=false;
	try {
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, id);
		int i=pstmt.executeUpdate();
		if(i>0) {
			f=true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return f;
	
}

}
