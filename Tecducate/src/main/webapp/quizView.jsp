<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Post</title>
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/navStyle.css">
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/generalStyle.css">
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/quizStyle.css">
</head>

<body>

  <!--
    THIS SECTION IS MISC. IT'S A BASIC HEADER FOR NAVIGATION ON WEBSITE

  <header id="pageHeader">
    <nav class="nav-area">
      <img id="logo" src="brandAssets/tech-rings.png" alt="layered rings">
      <ul>
        <li><a href="homePage.html">Home</a></li>
        <li><a href="newsPage.html">News</a></li>
        <li><a href="forumPage.html">Forum</a></li>
        <li><a href="">More</a>
          <ul>
            <li><a href="aboutPage.html">About</a></li>
            <li><a href="newLetterSignUpPage.html">Newsletter</a></li>
            <li><a href="policyPage.html">Policy</a></li>
          </ul>
        </li>
        
      </ul>
    </nav>
  </header>
-->

  <!--Main section for all quiz page elements-->

  
  <main id="contentSection">

    <!--Dedicated section for each question-->
    <div id="questionSection" class="quizBlock">
      <h1>${quiz.question}</h1>
    </div>

    <!--Dedicated section for each sample example, includes ability to use a sample image as well as any sample text-->
    <div id="sampleSection" class="quizBlock">
        <img src="http://localhost:8080/Tecducate/asset/stressedHomer.gif" alt="Homer Simpson sitting at his office reading notes looking stressed">
        <p>${quiz.directions}</p>
    </div>
  
    <!--Dedicated section to select the correct answer out of 4 possible choices-->
    <div id="answerSection" class="quizBlock">

      <!--Each answer block has their own unique text entry-->
      <section id="answer1" class="answerBlock">
        <a href="result?ansr=<c:out value='${quiz.ansr1}' />"><h2>${quiz.ansr1}</h2></a>
      </section>

      <section id="answer2" class="answerBlock">
       <a href="result?ansr=<c:out value='${quiz.ansr2}' />"><h2>${quiz.ansr2}</h2></a>
      </section>

      <section id="answer3" class="answerBlock">
        <a href="result?ansr=<c:out value='${quiz.ansr3}' />"><h2>${quiz.ansr3}</h2></a>
      </section>

      <section id="answer4" class="answerBlock">
        <a href="result?ansr=<c:out value='${quiz.ansr4}' />"><h2>${quiz.ansr4}</h2></a>
      </section>
    </div>
  
  </main>
  


  <!--Dedicated section for website footer to provide contact information-->
  <footer id="pageFooter">
    <h3>Copyright 2023 Tecducate</h3>
    <p>For more information find us at 1030 longworm, San Diego, California, 24001
    </p>
    <h3>Contact Us</h3>
    <p>1-900-324-2459</p>
    <p><a href="mailto: hd3652@wayne.edu"> tecducate@outlook.com</a></p>
  </footer>

  </body>

</html>