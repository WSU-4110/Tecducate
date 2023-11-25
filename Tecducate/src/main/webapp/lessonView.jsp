<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/src/main/webapp/style/lessonPage.css" type="text/css">
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/lessonPageStyle.css" type="text/css">

</head>


<body>

    <header>
		    
		    	<nav class="navbar navbar-expand-lg bg-body-tertiary">
		  	<div class="container-fluid">
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		      <a class="navbar-brand" href="#"></a>
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link" href="#">Tecduate</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" href="#">About Us</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link">Contact Us</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link">Sign Up</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link">Log in</a>
		        </li>
		      </ul>
		      
		      <button class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
		      
		      <form class="d-flex" role="search">
		        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
		        <button class="btn btn-outline-success" type="submit">Search</button>
		      </form>
<!-- for search.java -->
<!-- 		      <form class="d-flex" role="search" action="SearchServlet" method="post"> -->
<!--     			<input class="form-control me-2" type="search" name="searchInput" placeholder="Search" aria-label="Search"> -->
<!--     			<button class="btn btn-outline-success" type="submit">Search</button> -->
<!-- 			 </form> -->


		    </div>
		  </div>
		</nav>

    </header>
    
    <h1>Phishing Emails</h1>
    

    <div class="container">
        <div class="container text-center">
  <div class="row">
    <div class="col-12 col-md-6 col-lg-6 ">
       <img class="image" src="asset/Phishing-email-graphic-scaled.jpg" style="max-width: 90%"> 

    </div>
    <div class="col-12 col-md-6 col-lg-6">
    <p>  <br> <br> <br> Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
              
    </div>
  </div>
</div>


        <div class="panel-group" id="accordion">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">How Do You Identify a Phishing Email?</a>
              </h4>
            </div>
            <div id="collapse1" class="panel-collapse collapse">
              <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
            </div>
          </div>
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">How To Prevent Yourself From It?</a>
              </h4>
            </div>
            <div id="collapse2" class="panel-collapse collapse">
              <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
              <img width="100px" height="80" src="assets/Phishing-email-graphic-scaled.jpg"> 

            </div>
          </div>
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">What To Do If You Responded To One Without Knowing?</a>
              </h4>
            </div>
            <div id="collapse3" class="panel-collapse collapse">
              <div class="panel-body">Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipisicing elit,
              sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
              quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</div>
            </div>
          </div>
        </div> 
      </div>


      <div class="container1">
        <a href="quiz?id=100" target="_blank">View Quiz!</a>
      </div>
    
    
    <footer>
        42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com
    </footer>
    
<script src="changeStyle.js"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous" type="text/javascript"></script>

</body>

</html>