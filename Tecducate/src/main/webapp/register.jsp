<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html lang="en" >
<html>
	<head>
		<title id = "SignUp">Registration Page</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/registerLogo.png">
		<meta name="description" content="Create your tecducate account">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle1.css" type="text/css">
	</head>
<!--Header of the Page-->
    <header>
        <h1>Tecducate</h1>
        <h2>Get Started with a free account</h2>
        <p>Create a free tecducate account to start learning & keep record of your progress.
         Already have a Tecducate account?<a href="login.jsp">Log in here<a></p> <!--go to log in page directly from sign up page-->
         <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
    
    </header>
<!--Sign Up from-->
    <body>

         <form action = "register" method="post"> <!--Send From information -->

                
            <filedset>             
                <ul class="Personal-Infomation">
                    <li><label for ="firstName">First Name<br></label><input type="text" name="firstName" maxlength="20"></li><br>
                    <li><label for ="lastName">Last Name<br></label><input type="text" name="lastName" maxlength="20"></li><br>
                    <li><label for="email">Email<br></label><input type="text" name="email" maxlength="50"></li><br>
                    <li><label for="number">Telephone Number<br></label><input type="text" name="number" maxlength="11"></li><br>
                    <li><label for="password">Password<br></label><input type="password" name="password" maxlength="20"></li><br>
                    <li><label for="confirmation">Confirm Password<br></label><input type="password" name="confirmation" maxlength="20"></li><br>
                </ul>	
                	
            </filedset>

        <filedset>
            
                <ul class="Prefferences">
                    <Legand >Choose what you would like to start learning<em>(Choose one or more)</em></legand>
                <li><label><input type="radio" name="topic" value="100" checked>Identify Phishing Emails</label></li>
                <li><label><input type="radio" name="topic" value="101">Identify Phishing links</label></li>
                <li><label><input type="radio" name="topic" value="102">How to manage my account</label></li>
                </ul>
        </filedset>
        <!--Submit and Reset Button-->
        <input class= "Submit-Butoon" type="submit" value="Register" > <input class="Reset-button" type="reset">

	    </form>
    </body>
    
    
    <!--Footer-->
   	<footer style="background-color: rgb(64, 128, 128);">
   	<div id="main">
        <p><img class="image" src="http://localhost:8080/Tecducate/asset/logo.png" style="width: 170px; height: 170px; margin-left: 90px; float: left;"> 
        </br> 42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com </br></br>
        <a href="https://www.instagram.com/"><img src="http://localhost:8080/Tecducate/asset/instagram.png" alt="Instagram" style="width: 50px; height: 35px; margin-left: 50px;"></a>          
    	<a href="https://www.facebook.com/"><img src="http://localhost:8080/Tecducate/asset/facebook.png" alt="Facebook" style="width: 40px; height: 35px; margin-left: 50px;"></a> 
    	<a href="https://www.youtube.com/"><img src="http://localhost:8080/Tecducate/asset/youtube.png" alt="YouTube" style="width: 50px; height: 35px; margin-left: 50px;"></a></br>
        </br> &copy; 2023 Tecducate</p>
     </div>
    </footer>
    

    <script src="changeStyle.js"></script>
    
</html>