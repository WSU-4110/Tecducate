<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html lang="en" >
<html>
	<head>
		<title id = "SignUp">SignUp Page</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/BrandSmalllogo.png">
		<meta name="description" content="Create your tecducate account">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle.css" type="text/css">
	</head>
<!--Header of the Page-->
    <header>
        <h1>Tecducate</h1>
        <h2>Get Started with a free account</h2>
        <p>Create a free tecducate account to start learning & keep record of your progress.
            Already have a Tecducate account?<a href="login.jsp">Log in here<a></p> <!--go to log in page directly from sign up page-->
    </header>
<!--Sign Up from-->
    <body>
         <form action = "register"> <!--Send From information via email-->
                
            <filedset>             
                <ul class="Personal-Infomation">
                    <li><label for ="firstName">First Name<br></label><input type="text" name="firstName""></li><br>
                    <li><label for ="lastName">Last Name<br></label><input type="text" name="lastName"></li><br>
                    <li><label for="email">Email<br></label><input type="text" name="email"></li><br>
                    <li><label for="number">Telephone Number<br></label><input type="text" name="number"></li><br>
                    <li><label for="password">Password<br></label><input type="password" name="password"></li><br>
                    <li><label for="confirmation">Confirm Password<br></label><input type="password" name="confirmation"></li><br>
                </ul>	
                	
            </filedset>

        <filedset>
            
                <ul class="Prefferences">
                    <Legand >Choose what you would like to start learning<em>(Choose one or more)</em></legand>
                <li><label><input type="checkbox" name="Topic" value="Phishing-email" checked>Identify Phishing Emails</label></li>
                <li><label><input type="checkbox" name="Topic" value="Phishing-links">Identify Phishing links</label></li>
                <li><label><input type="checkbox" name="Topic" value="Account-management">How to manage my account</label></li>
                </ul>
        </filedset>
        <!--Submit and Reset Button-->
        <input class= "Submit-Butoon" type="submit" value="Register" > <input class="Reset-button" type="reset">

	    </form>
    </body>
    
    <!--Footer-->
    <footer>
        <p><small>Tecducate.com  October 1st, 2023</small></p>
    </footer>
</html>