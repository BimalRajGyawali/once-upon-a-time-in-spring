<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

 <script src="https://www.google.com/recaptcha/api.js" async defer></script>

<body>
 
   <a href="fileupload">Upload File</a>
   <a href="gallerycontroller">Gallery</a>
   
   
   
   <hr>
   
   <div class="g-recaptcha" data-sitekey="6LfVhq0UAAAAACuO3gmNfzUsXMMyD1gwSMLp6DKD"></div>
    
    <form action="verifyrecaptcha" method="post">
    
       <input type="submit" value="Ok">
    
    </form>
    
</body>
</html>