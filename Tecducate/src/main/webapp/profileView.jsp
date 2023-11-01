<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!-- request parameters to retrieve preferences -->
<%
    String[] chosenLessons = request.getParameterValues("chosenLesson");
%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
    <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/profileStyleSheet.css" type="text/css">
    <style>

        #lessons-box {
            margin-top: 20px;
            padding: 20px;
            background-color: #fff;
            border: 1px solid #ccc;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        /* Styling for the settings icon */
        #settings-icon {
            position: absolute;
            top: 10px;
            right: 10px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Profile Page</h1>
    </header>

    <section id="user-info">
        <h2>User Information</h2>
        <p><strong>Name:</strong> Mohammad Azadegan</p>
        <p><strong>Email:</strong> testing123@example.com</p>
        <p><strong>Phone Number:</strong> (123) 456-7890</p>
    </section>


<div id="leaderboard-box" class="quiz-scores">
    <h2>Leaderboard</h2>
    <ol>
        <li>Player 1 - Score: 95%</li>
        <li>Player 2 - Score: 92%</li>
        <li>Player 3 - Score: 88%</li>
    </ol>
</div>
<!-- Dynamically adding the lesson content that user have chosen in sign up page.  -->

    <div id="lessons-box">
        <h2>Your Lessons</h2>
        <c:forEach var="chosenLesson" items="${chosenLessons}">
            <c:choose>
                <c:when test="${chosenLesson eq 'Phishing-email'}">
                    <p>Phishing Email Lesson</p>
                    <%
                        Lesson phishingEmailLesson = new PhishingEmailLesson();
                        phishingEmailLesson.display();
                    %>
                </c:when>
                <c:when test="${chosenLesson eq 'Phishing-links'}">
                    <p>Phishing Links Lesson</p>
                    <%
                        Lesson phishingLinksLesson = new PhishingLinksLesson();
                        phishingLinksLesson.display();
                    %>
                </c:when>
                <c:when test="${chosenLesson eq 'Account-management'}">
                    <p>Account Management Lesson</p>
                    <%
                        Lesson accountManagementLesson = new AccountManagementLesson();
                        accountManagementLesson.display();
                    %>
                </c:when>
            </c:choose>
        </c:forEach>
    </div>


    <a href="settings.html" id="settings-icon">
        <img src="http://localhost:8080/project/assets/settings-icon.png" alt="Settings">
    </a>

    <footer>
        <p>&copy; 2023 Tecducate</p>
    </footer>
</body>
</html>
