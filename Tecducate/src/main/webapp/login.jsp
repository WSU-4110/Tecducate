<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "SignUp">LogIn Page</title>
		<meta name = "viewport" content= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="BrandSamllLogo.png">
		<meta name="description" content="Log into Tecducate">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle.css" type="text/css">
	</head>

    <header>
        <h1>Tecducate</h1>
    </header>

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
			<a href="register.jsp" target="_self">Register Here</a>
		</form>
    </body>
    <footer>
        <p><small>Tecducate.com  October 1st, 2023</small></p>
    </footer>

</html>