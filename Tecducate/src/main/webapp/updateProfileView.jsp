<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html lang="en" >
<html>
    <head>
		<title id = "Update_Profile">Update profile</title>
		<meta name = "viewport" contant= "width=device-width, initial-scale=1.0">
		<meta charset="utf-8">
		<link rel="shortcut icon" type="image/png" href="BrandSamllLogo.png">
		<meta name="description" content="Update your profile">
		<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/signupStylesheet.css">
        <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/updateprofile_Stylesheet.css">
	</head>
    <body>
        <h1>Update Account Information</h1>
		<p>Welcome ${ user.getFirstName()}${ user.getLastName()}</p>
        <form action = "update" method = "POST"> <!--Send From information-->
                
            <filedset>             
                <ul class="Personal-Infomation">
                    <li><label for="email">Email address<br></label><input type="text" name="email" id="email" value="${ user.getEmail()}" disabled></li><br>
                    <li><label for ="firstlast">First name<br></label><input type="text" name="firstName" id="first" value="${ user.getFirstName()}"></li><br>
                    <li><label for ="last">First name<br></label><input type="text" name="lastName" id="last" value="${ user.getLastName()}"></li><br>
                    <li><label for="password">Password<br></label><input type="text" id="password-input" name="password-input" value="..................." disabled></li><br>
                    <small><input class= "ChangePass-Button"  onclick="myFunction()" type="button" value="Change Password"> </small>
                    <input id="NewPassword" type="text" value="New Password" style="display: none;" >
                </ul>	
                	
            </filedset>

            <input class= "Update-Button" type="submit" value="Update">
      </form>
            <script>
                function myFunction() {
                    var newPasswordInput = document.getElementById("NewPassword");
                    newPasswordInput.style.display = "block"; // Display the new password input
                }
                </script>
    </body>
</html>