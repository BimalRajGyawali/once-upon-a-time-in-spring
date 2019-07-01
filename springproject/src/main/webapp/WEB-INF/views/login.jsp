<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Log In Form</h1>

<hr>

<form action="userlogin" method="post">
   
        Username <input type="text" name="username"> <br>
        Password <input type ="password" name="password">
        
        <input type="submit" value="LogIn" >
        




</form>

<p> ${error}</p>


</body>
</html>