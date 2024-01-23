<%@page import="com.dto.Vendor"%>
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
	position:relative;
	left:400px;
	top:50px;
	overflow: hidden;
	font-family: sans-serif;
	
}
.edit-conatiner{
background-color: yellow;
padding:20px;

width:max-content;
height:max-content;
border-radius: 20px;


}
input{
padding: 9px;
border-radius: 40px;
border: transparent;
background-color: black;
color: white;


}
input:hover{
color: yellow;

}

</style>
</head>
<body>

<%
String id=request.getParameter("id");
VendorDao v=new VendorDao();
Vendor s=v.getSingleVendor(id);
%>

<h2>Update your details</h2>
<div class="edit-conatiner">
<form action="Update1">
<table>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" value="<%=s.getName() %>" required></td>
</tr>
<tr>
<td><label>Account Number</label></td>
<td><input type="text" name="account" value="<%=s.getAccount_num()%>" required></td>
</tr>
<tr>
<td><label>Bank Name</label></td>
<td><input type="text" name="bank" value="<%=s.getBankName() %>" required></td>
</tr>
<tr>
<td><label>Address 1</label></td>
<td><input type="text" name="add1" value="<%=s.getAddres1() %>" ></td>
</tr>
<tr>
<td><label>Address2</label></td>
<td><input type="text" name="add2" value="<%=s.getAddres2() %>" required></td>
</tr>
<tr>
<td><label>City</label></td>
<td><input type="text" name="city" value="<%=s.getCity() %>" required></td>

</tr>
<tr>
<td><label>Country</label></td>
<td><input type="text" name="country" value="<%=s.getCountry() %>" required></td>
</tr>
<tr>
<td><label>Zipcode</label></td>
<td><input type="text" name="zipcode" value="<%=s.getZipcode() %>" required></td>
</tr>
<tr><td></td>
<td><input type="submit" value="update"></td></tr>
<tr>
<td></td>
<td><input type="hidden" name="id" value="<%=s.getId() %>" required></td>
</tr>
</table>



</form>
</div>

</body>
</html>