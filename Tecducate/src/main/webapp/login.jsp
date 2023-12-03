<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "SignUp">LogIn Page</title>
		<meta name = "viewport" content= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="BrandSamllLogo.png">
		<meta name="description" content="Log into Tecducate">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle.css" type="text/css">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/loginStyle.css" type="text/css">
	</head>

    <header>
        <h1>Tecducate</h1>
    </header>

    <body style="background-image: url('asset/Home-Backgrounf-Image.jpg'); background-size: cover; background-repeat: no-repeat; background-attachment: fixed;">
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
						<input type="submit" value="Login" style="width: 200px; background-color: blue; color: white; font-size: 18px; cursor: pointer; transition: background-color 0.3s;"/>
					</td>
				</tr>
			</table>
			<!--change color of error massage.-->
			<!-- Display error message for invalid input -->
			<c:if test= "${not empty loginStr}">
				<div class="errir-message"style="color: red;">${loginStr}</div>
			</c:if>
			
			<a href="register.jsp" target="_self">Register Here</a>
		</form>
    </body>
    <footer>
        <p><small>Tecducate.com  October 1st, 2023</small></p>
    </footer>

</html>