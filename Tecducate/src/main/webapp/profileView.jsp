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
        <p><strong>Name:</strong> Mohammad Azadegan</p>
        <p><strong>Email:</strong> testing123@example.com</p>
        <p><strong>Phone Number:</strong> (123) 456-7890</p>
    </section>

    <section class="lessons-box">
        <h2>Your Lessons</h2>
        <p><strong>Lesson:</strong> Phishing Email</p>
        <button id="go-to-lesson-button"><i class="fas fa-graduation-cap"></i> Go to lesson</button>
    </section>

    <section class="quiz-scores">
        <h2>Leaderboard</h2>
        <ol>
            <li>Player 1 - Score: 95%</li>
            <li>Player 2 - Score: 92%</li>
            <li>Player 3 - Score: 88%</li>
        </ol>
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
