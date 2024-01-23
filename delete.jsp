<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.dto.Vendor"%>
<%@page import="com.dao.VendorDao"%>
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
	position:relative;
	left:400px;
	top:50px;
	overflow: hidden;
	font-family: sans-serif;
}
</style>
</head>
<body>
<%
String id=request.getParameter("id");
VendorDao v=new VendorDao();
Vendor s=v.getSingleVendor(id);
%>
<h3>Do you want to delete this vendor <%=s.getName() %> </h3>
<form action="Delete1">
<input type="hidden" name="id" value=<%=id %>>
<input type="submit" name="opt" value="yes">
<input type="submit" name="opt" value="no">


</form>

</body>
</html>