<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html lang="en" >
<html>
	<head>
		<title id = "SignUp">SignUp Page</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="http://localhost:8080/project/asset/BrandSmalllogo.png">
		<meta name="description" content="Create your tecducate account">
		<link rel="stylesheet" href="http://localhost:8080/project/style/signupStylesheet.css">
	</head>
<!--Header of the Page-->
    <header>
        <h1>Tecducate</h1>
        <h2>Get Started with a free account</h2>
        <p>Create a free tecducate account to start learing & keep record of your progress.
            Already have a Tecducate account?<a href="LogIn.html">Log in here<a></p> <!--go to log in page directly from sign up page-->
    </header>
<!--Sign Up from-->
    <body>
         <form action = "register" method = "POST" enctype="text/plain"> <!--Send From information via email-->
                
            <filedset>             
                <ul class="Personal-Infomation">
                    <li><label for ="firstlast">Name<br></label><input type="text" name="fullname" id="firstlast"></li><br>
                    <li><label for="email">Email<br></label><input type="text" name="email" id="email"></li><br>
                    <li><label for="number">Telephone Number<br></label><input type="text" name="number" id="number"></li><br>
                    <li><label for="password">Password<br></label><input type="text" id="password-input" name="password-input"></li><br>
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