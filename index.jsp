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
	top:100px;
	overflow: hidden;
	font-family: sans-serif;
	
}
.login-container{
background-color: yellow;
height: 200px;
width: 400px;
padding: 10px;
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
text-decoration: none;
color: black;
}


</style>
</head>
<body>
<h1>Login</h1>
<div class="login-container">
<form action="Valid1">
<table>
<tr>
<td><label>Email</label></td>
<td><input type="email" name="email" value=""></td>
</tr>

<tr>
<td><label>Password</label></td>
<td><input type="password" name="password" value=""></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="submit"></td>
</tr>

</table>




</form>
<a href="userforget.jsp">Forgot password?</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="useraccount.jsp">New user?Create account</a>

</div>
</body>
</html>