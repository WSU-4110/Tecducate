<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/settingsLogo.png">
    <title>Settings Page</title>
    <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/settingStyle1.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> <!-- Font Awesome CSS -->
</head>
<body>
    <header>
        <h1>Settings</h1>
    </header>


    <section id="user-settings">
             <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()" style="float: right;">Style</button>
    
        <h2>Edit User Information</h2>
       


<!--      <form action = "delete" method ="post"> -->  
        
       

        <div class="button-container">
        
        
            <button style="width: 200px; margin-left: 490px;" id="update-profile-button"><i class="fas fa-user-edit"></i> Update Profile</button>
            <form action = "delete" method ="post">
            <button id="delete-profile-button" type = "submit"><i class="fas fa-user-times"></i> Delete Profile</button>
           	</form>
           	<form action = "reset" method ="post">
           	<button id="reset-lesson-plan-button" type = "submit"><i class="fas fa-user-times"></i> Reset Lesson Plan</button>
           	</form>
        </div>
        <script>

</script>
        </form>
    </section>

    <div class="button-group">
        <button id="back-to-profile-button"><i class="fas fa-arrow-left"></i> Back to Profile</button>
    </div>

    <footer>
        <p><img class="image" src="http://localhost:8080/Tecducate/asset/logo.png" style="width: 170px; height: 170px; margin-left: 90px; float: left;"> 
        </br> 42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com </br></br>
        <a href="https://www.instagram.com/"><img src="http://localhost:8080/Tecducate/asset/instagram.png" alt="Instagram" style="width: 50px; height: 35px; margin-left: 50px;"></a>          
    	<a href="https://www.facebook.com/"><img src="http://localhost:8080/Tecducate/asset/facebook.png" alt="Facebook" style="width: 40px; height: 35px; margin-left: 50px;"></a> 
    	<a href="https://www.youtube.com/"><img src="http://localhost:8080/Tecducate/asset/youtube.png" alt="YouTube" style="width: 50px; height: 35px; margin-left: 50px;"></a></br>
        </br> &copy; 2023 Tecducate</p>
    </footer>
    <script>
        document.getElementById("back-to-profile-button").addEventListener("click", function () {
            window.location.href = "profile";
        });

        document.getElementById("update-profile-button").addEventListener("click", function () {
            window.location.href = "updateView?";
        })
        
    </script>

    
    <script src="changeStyle.js"></script>
        

</body>
</html>

