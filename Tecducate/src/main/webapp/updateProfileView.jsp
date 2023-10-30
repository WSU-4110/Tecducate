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
		<link rel="stylesheet" href="/styleSheets/Signup_Stylesheet.css">
        <link rel ="stylesheet" href="/styleSheets/updateprofile_Stylesheet.css">
	</head>
    <body>
        <h1>Update Account Information</h1>
        <p>Welcome "Cilent Name"</p>
        <form action = "susmitaranighosh03@gmail.com" method = "POST" enctype="text/plain"> <!--Send From information via email-->
                
            <filedset>             
                <ul class="Personal-Infomation">
                    <li><label for="email">Email address<br></label><input type="text" name="email" id="email" value=".........@example.com" disabled></li><br>
                    <li><label for ="firstlast">First & Last name<br></label><input type="text" name="fullname" id="firstlast" value="Jhon James"></li><br>
                    <li><label for="number">Phone Number<br></label><input type="text" name="number" id="number" value="562-956-5623"></li><br>
                    <li><label for="password">Password<br></label><input type="text" id="password-input" name="password-input" value="..................." disabled></li><br>
                    <small><input class= "ChangePass-Button"  onclick="myFunction()" type="button" value="Change Password"> </small>
                    <input id="NewPassword" type="text" value="New Password" style="display: none;" >
                </ul>	
                	
            </filedset>

            <input class= "Update-Button" type="submit" value="Update">
            <script>
                function myFunction() {
                    var newPasswordInput = document.getElementById("NewPassword");
                    newPasswordInput.style.display = "block"; // Display the new password input
                }
                </script>
    </body>
</html>