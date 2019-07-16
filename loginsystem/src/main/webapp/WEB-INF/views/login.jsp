<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://www.google.com/recaptcha/api.js" async defer></script>

</head>
<body>

<form action="userlogin" method="post">

  Username: <input name="username" type="text" placeholder="username"><br/>
  Password: <input name="password" type="password" placeholder="password"><br/>

  <div class="g-recaptcha" data-sitekey="6LfVhq0UAAAAACuO3gmNfzUsXMMyD1gwSMLp6DKD"></div><br/>
  
  <input type="submit" value="Login"><br/>

</form>

<p>${msg }</p>




</body>
</html>