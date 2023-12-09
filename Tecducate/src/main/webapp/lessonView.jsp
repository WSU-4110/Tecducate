<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

    
<!DOCTYPE html>
<html lang="en">

<head>
	<title id = "SignUp">Lesson Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" type="image/png" href="http://localhost:8080/Tecducate/asset/lessonLogo.png">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/lessonPage.css" type="text/css">
  <link rel="stylesheet" href="http://localhost:8080/Tecducate/style/lessonPageStyle1.css" type="text/css">

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
		        
		      </ul>
		      
		      <button style= "float: right;" class="navbar__btn" id="change-style-button" onclick="toggleStyles()">Style</button>
		      
		      <div id="searchBox">
		      		<input type="text" id="input" placeholder="Search" />
		      		<input type="button" id="searchBtn" value="Search" onclick="searchAndHighlight();" />	
		      
		      </div>
<!-- 		      <form class="d-flex" role="search"> -->
<!-- 		        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"> -->
<!-- 		        <button class="btn btn-outline-success" type="submit">Search</button> -->
<!-- 		      </form> -->
<!-- for search.java -->
<!-- 		      <form class="d-flex" role="search" action="SearchServlet" method="post"> -->
<!--     			<input class="form-control me-2" type="search" name="searchInput" placeholder="Search" aria-label="Search"> -->
<!--     			<button class="btn btn-outline-success" type="submit">Search</button> -->
<!-- 			 </form> -->


		    </div>
		  </div>
		</nav>

    </header>
    
    <h1>${title}</h1>
    

    <div class="container">
        <div class="container text-center">
  <div class="row">
    <div class="col-12 col-md-6 col-lg-6 ">
       <img class="image" src="http://localhost:8080/Tecducate/asset/Phishing-email-graphic-scaled.jpg" style="max-width: 90%"> 

    </div>
    <div class="col-12 col-md-6 col-lg-6">
    <p>  <br> <br> <br>${description}</p>
              
    </div>
  </div>
</div>


        <div class="panel-group" id="accordion">
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">${topic1}</a>
              </h4>
            </div>
            <div id="collapse1" class="panel-collapse collapse">
              <div class="panel-body"> <p> 
	              <ul>
	              	<li>${detail1} 
	              	</li>
	              	<li>${detail2} 
	              	</li>
	              	<li>${detail3} 
	              	</li>
	             </ul></p>
              </div>
            </div>
          </div>
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">${topic2}</a>
              </h4>
            </div>
            <div id="collapse2" class="panel-collapse collapse">
              <div class="panel-body"><p>
              	<ul>
	              	<li>${detail4} 
	              	</li>
	              	<li>${detail5} 
	              	</li>
	              	<li>${detail6} 
	             </ul></p>
              </div>

            </div>
          </div>
          <div class="panel panel-default">
            <div class="panel-heading">
              <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">${topic3}</a>
              </h4>
            </div>
            <div id="collapse3" class="panel-collapse collapse">
              <div class="panel-body"><p>
              	<ul>
	              	<li>${detail7} 
	              	</li>
	              	<li>${detail8} 
	              	</li>
	              	<li>${detail9} 
	              	</li>
	             </ul></p>
             
             </div>
            </div>
          </div>
        </div> 
      </div>


      <div class="container1">
        <a href="quiz?id=${prefLesson}" target="_blank">View Quiz!</a>
      </div>
      
    <footer id="main">
	    	<img class="image" src="http://localhost:8080/Tecducate/asset/logo.png" style="width: 170px; height: 170px; margin-left: 90px; margin-right: 120px; float: left;"> 
        	
        	
        	<ul style="float: center; list-style-type: none;">
        		<li></br> 42 W Warren Ave, Detroit, MI | 313-000-0000 | Tecducate@gmail.com </br></br></li>
        		<li><a href="https://www.instagram.com/"><img src="http://localhost:8080/Tecducate/asset/instagram.png" alt="Instagram" style="width: 50px; height: 35px; margin-left: 10px;"></a>         
    			<a href="https://www.facebook.com/"><img src="http://localhost:8080/Tecducate/asset/facebook.png" alt="Facebook" style="width: 40px; height: 35px; margin-left: 10px;"></a>
    			<a href="https://www.youtube.com/"><img src="http://localhost:8080/Tecducate/asset/youtube.png" alt="YouTube" style="width: 50px; height: 35px; margin-left: 10px;"></a></br></li>
        	    <li></br>&copy; 2023 Tecducate</li>
        
        	</ul>
           	
    </footer>
    
    
<script src="searchButton.js"></script>
<script src="changeStyle.js"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous" type="text/javascript"></script>

</body>

</html>