<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "Update_Profile">Update profile</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="BrandSamllLogo.png">
		<meta name="description" content="Update your profile">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStyle.css" type="text/css">
        <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/updateprofileStyle.css" type="text/css">
	</head>
    <body>
        <h1>Update Account Information</h1>
		<p>Welcome</p>
        <form action = "update" method = "POST"> <!--Send From information-->
                
            <fieldset>             
                <ul class="Personal-Infomation">
                    <li>
                    	<label for="email">Email<br></label>
                    	<input type="text" name="email" id="email" value="${user.email}" disabled></li><br>
                    <li><label for ="firstlast">First Name<br></label><input type="text" name="firstName" id="firstName" value="${user.firstName}"></li><br>
                    <li><label for="last">Last Name<br></label><input type="text" name="lastName" id="lastName" value="${user.lastName}"></li><br>
                    <small><input class= "ChangePass-Button"  onclick="myFunction()" type="button" value="Change Password"> </small>
                    <input id="NewPassword" type="text" value="New Password" style="display: none;" ><br>
                    <input id="confirmation" type = "text" value = "Confirm Password" style="display: none">
                </ul>	
                	
            </fieldset>

            <input class= "Update-Button" type="submit" value="Update">
      </form>
            <script>
                function myFunction() {
                    var newPasswordInput = document.getElementById("NewPassword");
                    newPasswordInput.style.display = "block"; // Display the new password 
                    var confrimationInput = document.getElementById("confirmation");
                    confrimationInput.style.display = "block";
                }
                </script>
    </body>
</html>