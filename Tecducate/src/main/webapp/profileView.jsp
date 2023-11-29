<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
    <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/profileStyleSheet.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"> <!-- Font Awesome CSS -->
</head>
<body>
    <header>
        <h1>Profile Page</h1>
        <a href="#" id="settings-icon"><i class="fas fa-cog"></i> Settings</a>
    </header>

<section class="user-info-box">
	<h2>User Information</h2>
    
    <p><strong>Name:</strong> ${user.firstName || 'n/a'} ${user.lastName || 'n/a'}</p>
    <p><strong>Email:</strong> ${user.email || 'n/a'}</p>
    <p><strong>Phone Number:</strong> ${user.phoneNum || 'n/a'}</p>
   
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
        <p>&copy; 2023 Tecducate</p>
    </footer>
    <script>
        document.getElementById("settings-icon").addEventListener("click", function () {
            window.location.href = "settingsView.jsp";
        });

        document.getElementById("go-to-lesson-button").addEventListener("click", function () {
            window.location.href = "lessonView.jsp";
        });
    </script>

</body>
</html>
