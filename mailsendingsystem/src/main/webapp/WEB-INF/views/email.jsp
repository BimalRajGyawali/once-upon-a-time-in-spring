<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/style.css">
</head>
<body>

<div>
  <form action="sendemail" method="post">
     
        <p><input type="text" name="to" placeholder="To" size="50" required onfocus="changeText()"></p>
        <p><input type="text" name="subject" placeholder="Subject" size="50"></p>
       
        <p><textarea name="message" rows="30" cols="90" required></textarea></p>
  
        <input type="submit" value="Send">
        <input type="reset" value="Reset">
  
  
  </form>




</div>



</body>
</html>