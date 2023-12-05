<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "SignUp">LogIn Page</title>
		<meta name = "viewport" content= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/HomeLogo.png">
		<meta name="description" content="Log into Tecducate">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle1.css" type="text/css">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/loginStyle.css" type="text/css">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/footer.css" type="text/css">
	
		
	</head>

    <header>
        <h1 style="font-size: 70px;">Tecducate</h1>
        
    </header>
    <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
    

    <body>
        <form action="login" method="post">
			<table border="1" cellpadding="5">
				<tr>
					<th>Email: </th>
					<td>
						<input type="text" name="email" size="45" autofocus>
					</td>
				</tr>
				<tr>
					<th>Password: </th>
					<td> 
						<input type="password" name="password" size="45">
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="Login"/>
					</td>
				</tr>
			</table>
			
			<!-- Display error message for invalid input -->
			<c:if test= "${not empty loginStr}">
				<div class="errir-message">${loginStr}</div>
			</c:if>
			
			<a href="register.jsp" target="_self">Register Here</a>
		</form>
		
		<script src="changeStyle.js"></script>
		
    </body>
     <footer>
        <p><img class="image" src="http://localhost:8080/Tecducate/asset/logo.png" style="width: 170px; height: 170px; margin-left: 90px; float: left;"> 
        </br> 42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com </br></br>
        <a href="https://www.instagram.com/"><img src="http://localhost:8080/Tecducate/asset/instagram.png" alt="Instagram" style="width: 50px; height: 35px; margin-left: 50px;"></a>          
    	<a href="https://www.facebook.com/"><img src="http://localhost:8080/Tecducate/asset/facebook.png" alt="Facebook" style="width: 40px; height: 35px; margin-left: 50px;"></a> 
    	<a href="https://www.youtube.com/"><img src="http://localhost:8080/Tecducate/asset/youtube.png" alt="YouTube" style="width: 50px; height: 35px; margin-left: 50px;"></a></br>
        </br> &copy; 2023 Tecducate</p>
    </footer>


</html>