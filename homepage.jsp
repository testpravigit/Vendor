<%@page import="com.dto.Vendor"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.VendorDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	width: 100%;
	height: 100%;
	margin:0%;
	padding: 0%;
	box-sizing: border-box;
	background-color: lightslategray;
	
	
	
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}
.home{
position:relative;
top:100px;
	left:200px;
background-color: rgb(145,224,225);
border-radius:20px;
width:max-content;
padding: 20px;

}
a{
text-decoration: none;
color: rgb(255,255,255);
padding: 2px;
border: transparent;
border-radius: 10px;

margin: 3px;

}
tr:hover{
border: 1px white solid;
}
.add{
background-color:rgb(176,216,230);
position: relative;
left:200px;
top:150px;
padding: 30px;
}
.edit{
background-color:rgb(0,255,0);margin: 3px;
}
.delete{
background-color:rgb(255,0,0);margin: 3px;
}
</style>
</head>
<body>
<%@ include file="dropdown.jsp" %>

<div class="home">
<table>
<tr>
<th>Sl.No&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Vendor Name&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Account Number&nbsp;&nbsp;&nbsp;</th>
<th>Bank Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
<th>Action&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
</tr>
<%
VendorDao vd= new VendorDao();
 List<Vendor> l=vd.getVendor();
 int i=1;

 for(Vendor v:l){
	 System.out.println(v);
%> <tr>
<td><%=i++ %>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><%=v.getName() %>&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><%=v.getAccount_num()%>&nbsp;&nbsp;&nbsp;</td>
<td><%=v.getBankName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td><a class="edit" href="editvendor.jsp?id=<%=v.getId()%>">Edit</a>&nbsp;&nbsp;&nbsp;<a class="delete" href="delete.jsp?id=<%=v.getId()%>">Delete</a></td>
</tr>
<%} %>
</table>

</div>
<a class="add" href="addvendor.jsp">Add</a>
</body>
</html>