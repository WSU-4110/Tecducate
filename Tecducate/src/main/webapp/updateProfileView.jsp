<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "Update_Profile">Update profile</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/updateProfileLogo.png">
		<meta name="description" content="Update your profile">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle1.css" type="text/css">
	</head>
    <body>
        <h1 style="font-weight: bolder;">Update Account Information</h1>
        
        <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
        
		
        <form action = "update" method = "POST"> <!--Send From information-->
                
            <fieldset>             
                <ul class="Personal-Infomation">
                    <li>
                    	<label for="email">Email address<br></label>
                    	<input type="text" name="email" id="email" value="" disabled></li><br>
                    <li><label for ="firstlast">First name<br></label><input type="text" name="firstName" id="first" value=""></li><br>
                    <li><label for="last">First name<br></label><input type="text" name="lastName" id="last" value=""></li><br>
                    <li><label for="password">Password<br></label><input type="text" id="password-input" name="password-input" value="..................." disabled></li><br>
                    <small><input class= "ChangePass-Button"  onclick="myFunction()" type="button" value="Change Password"> </small>
                    <input id="NewPassword" type="text" value="New Password" style="display: none;" >
                </ul>	
                	
            </fieldset>

            <input class= "Update-Button" type="submit" value="Update">
      </form>
      
      <script src="changeStyle.js"></script>
      
            <script>
                function myFunction() {
                    var newPasswordInput = document.getElementById("NewPassword");
                    newPasswordInput.style.display = "block"; // Display the new password input
                }
                </script>
    </body>
    
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
    
</html>