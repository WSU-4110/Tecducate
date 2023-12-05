<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/profileLogo.png">
    <title>User Profile</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> <!-- Font Awesome CSS -->
	<link rel="stylesheet" href="http://localhost:8080/Tecducate/style/profileStyleSheet1.css">
	 <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/lessonPage.css" type="text/css">
	

</head>
<body>
    <header>
        <h1>Profile Page</h1>
        <a href="#" id="settings-icon"><i class="fas fa-cog"></i> Settings</a>
    </header>
    <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
    <a href="logout" >Logout</a>
    

<section class="user-info-box">
	<h2>User Information</h2>
   
    <p><strong>Name:</strong> ${firstName} ${lastName}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Phone Number:</strong> ${phoneNum}</p>
    
</section>



    <section class="lessons-box">

        <h2>Your Lessons</h2>
        <p><strong>Lesson ID:</strong> ${user.prefLesson}</p>
        <button id="go-to-lesson-button"><i class="fas fa-graduation-cap"></i> Go to lesson</button>
    </section>


    <section class="quiz-scores">    
    <h2>Leaderboard</h2>
        <ol>
        	<c:forEach var="users" items="${userList}">
            <li><c:out value="${users.email}" /> - <c:out value="${users.profLVL}" /></li>
            <br>
            </c:forEach>
        </ol>
    </section>
    
    
    <section class="lesson-recomendations">
        <h2>Try These Other Lessons</h2>
        <ul>
            <li><a href="lesson?id=101">Account Management</a></li>
            <li><a href="lesson?id=102">Virus Identification</a></li>
        </ul>
</section>


    <footer>
        <p><img class="image" src="http://localhost:8080/Tecducate/asset/logo.png" style="width: 170px; height: 170px; margin-left: 90px; float: left;"> 
        </br> 42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com </br></br>
        <a href="https://www.instagram.com/"><img src="http://localhost:8080/Tecducate/asset/instagram.png" alt="Instagram" style="width: 50px; height: 35px; margin-left: 50px;"></a>          
    	<a href="https://www.facebook.com/"><img src="http://localhost:8080/Tecducate/asset/facebook.png" alt="Facebook" style="width: 40px; height: 35px; margin-left: 50px;"></a> 
    	<a href="https://www.youtube.com/"><img src="http://localhost:8080/Tecducate/asset/youtube.png" alt="YouTube" style="width: 50px; height: 35px; margin-left: 50px;"></a></br>
        </br> &copy; 2023 Tecducate</p>
    </footer>
    
    <script src="changeStyle.js"></script>
    
    <script>
        document.getElementById("settings-icon").addEventListener("click", function () {
            window.location.href = "settingsView.jsp";
        });

        document.getElementById("go-to-lesson-button").addEventListener("click", function () {
            window.location.href = "lesson";
        });
    </script>

</body>
</html>
