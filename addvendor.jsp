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
.add-container{
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

a{
display: none;
z-index: 1;
}


</style>
</head>
<body>

<h1>Add your details</h1>
<div class="add-container">
<form action="Add1">
<table>
<tr>
<td><label>Name</label></td>
<td><input type="text" name="name" value="" required></td>
</tr>
<tr>
<td><label>Account Number</label></td>
<td><input type="text" name="account" value="" required></td>
</tr>
<tr>
<td><label>Bank Name</label></td>
<td><input type="text" name="bank" value="" required></td>
</tr>
<tr>
<td><label>Address 1</label></td>
<td><input type="text" name="add1" value="" ></td>
</tr>
<tr>
<td><label>Address2</label></td>
<td><input type="text" name="add2" value="" required></td>
</tr>
<tr>
<td><label>City</label></td>
<td><input type="text" name="city" value="" required></td>

</tr>
<tr>
<td><label>Country</label></td>
<td><input type="text" name="country" value="" required></td>
</tr>
<tr>
<td><label>Zipcode</label></td>
<td><input type="text" name="zipcode" value="" required></td>
</tr>
<tr><td></td>
<td><input type="submit" value="Add"></td></tr>
</table>



</form>
</div>

</body>
</html>