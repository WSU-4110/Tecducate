import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class ControlServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private userDAO userDAO = new userDAO();
	    private quizDAO quizDAO = new quizDAO();
	    private lessonDAO lessonDAO = new lessonDAO();
	    
	    private String currentUser;
	    private HttpSession session=null;
		private String NULL;
	    
	    public ControlServlet()
	    {
	    	
	    }
	    
	    public void init()
	    {
	    	userDAO = new userDAO();
	    	quizDAO = new quizDAO();
	    	lessonDAO = new lessonDAO();
	    	currentUser= "";
	    }
	    
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        doGet(request, response);
	    }
	    
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String action = request.getServletPath();
	        System.out.println(action);
	    
	    try {
        	switch(action) {  
        	case "/login":
        		login(request,response);
        		break;
        	case "/register":
        		register(request, response);
        		break;
        	case "/lesson": 
                System.out.println("The action is: lesson");
                lessonPage(request, response);           	
                break;
        	case "/GetlessonData": 
                System.out.println("The action is: lesson");
                GetlessonPage(request, response);           	
                break;
        	case "/quiz": 
                System.out.println("The action is: quiz");
                quizPage(request, response);           	
                break;
        	case "/result": 
                System.out.println("The action is: result");
                resultPage(request, response);           	
                break;
        	case "/profile": 
                System.out.println("The action is: profile");
                userPage(request, response);           	
                break;
        	case "/logout":
        		logout(request,response);
        		break;
        	 case "/update": 
                 System.out.println("The action is: Update");
                 update(request, response);           	
                 break;
        	 case "/updateView":
        		 System.out.println("The action is : UpdateView");
        		 updateView(request, response);
        		 break;
        	 case "/delete":
                 System.out.println("The action is : DeleteProfile");
                 deleteProfile(request,response);
                 break;
        	 case "/reset":
                 System.out.println("The action is : ResetProfile");
                 resetProfile(request,response);
                 break;

	    	}
	    }
	    catch(Exception ex) {
        	System.out.println(ex.getMessage());
	    	}
	    }
	    
	    private void deleteProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	String email = (String)session.getAttribute("username");
	    	userDAO.delete(email);
	    	
	    	request.getRequestDispatcher("login.jsp").forward(request, response);
	    }
	    
	    private void resetProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	        String email = (String)session.getAttribute("username");
	        userDAO.reset(email);
	        
	        request.getRequestDispatcher("login.jsp").forward(request, response);
	      }


	    private void userPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	System.out.println("profile View");
	    	String email = (String)session.getAttribute("username");
	    	user user = userDAO.getUser(email);
	    	
	    	String firstName = user.getFirstName();
	    	String lastName = user.getLastName();
	    	String phoneNum = user.getPhoneNum();
	 
	    	if (firstName == null){
	    			firstName = "n/a";
	    	}
	    	
	    	if (lastName == null){
    			lastName = "n/a";
	    	}
	    	
	    	if (email == null){
    			email = "n/a";
    	}
	    	
	    	if (phoneNum == null){
    			phoneNum = "n/a";
	    	}
	    		    	
	    	request.setAttribute("user", user);
	    	request.setAttribute("firstName", firstName);
	    	request.setAttribute("lastName", lastName);
	    	request.setAttribute("email", email);
	    	request.setAttribute("phoneNum", phoneNum);
	    	List<user> userList = userDAO.listAllUsers();
	    	
	    	int prefLesson = userDAO.getLesson(email);
	    	List<lessonData> otherLesson = lessonDAO.getOtherLesson(prefLesson);
	    	request.setAttribute("userList", userList);
	    	request.setAttribute("otherLesson", otherLesson);
	    	
	        RequestDispatcher dispatcher = request.getRequestDispatcher("profileView.jsp");
	        dispatcher.forward(request, response);
	    }
	    
	    
	    
	    private void lessonPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	System.out.println("Lesson View");
	    	currentUser = (String) session.getAttribute("username");
	    	int prefLesson = userDAO.getLesson(currentUser);
	    	System.out.println(currentUser);
	    	System.out.println(prefLesson);
	    	
	    	lessonData lessonData = lessonDAO.getLesson(prefLesson);
	    	
	    	String title = lessonData.getTitle();
	    	String description = lessonData.getDescription();
	    	String topic1 = lessonData.getTopic1();
	    	String topic2 = lessonData.getTopic2();
	    	String topic3 = lessonData.getTopic3();
	    	String detail1 = lessonData.getDetail1();
	    	String detail2 = lessonData.getDetail2();
	    	String detail3 = lessonData.getDetail3();
	    	String detail4 = lessonData.getDetail4();
	    	String detail5 = lessonData.getDetail5();
	    	String detail6 = lessonData.getDetail6();
	    	String detail7 = lessonData.getDetail7();
	    	String detail8 = lessonData.getDetail8();
	    	String detail9 = lessonData.getDetail9();
	    	
	    	request.setAttribute("title", title);
	    	request.setAttribute("description", description);
	    	request.setAttribute("topic1", topic1);
	    	request.setAttribute("topic2", topic2);
	    	request.setAttribute("topic3", topic3);
	    	request.setAttribute("detail1", detail1);
	    	request.setAttribute("detail2", detail2);
	    	request.setAttribute("detail3", detail3);
	    	request.setAttribute("detail4", detail4);
	    	request.setAttribute("detail5", detail5);
	    	request.setAttribute("detail6", detail6);
	    	request.setAttribute("detail7", detail7);
	    	request.setAttribute("detail8", detail8);
	    	request.setAttribute("detail9", detail9);
	    	
	    	request.setAttribute("prefLesson", prefLesson);
	    	request.getRequestDispatcher("lessonView.jsp").forward(request, response);
	    }
	    
	    
	    private void GetlessonPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	System.out.println("Lesson View");
	    	currentUser = (String) session.getAttribute("username");
	    	int currentID = Integer.parseInt(request.getParameter("id")); 
	    
	    	lessonData lessonData = lessonDAO.getLessonData(currentID);
	    	
	    	
	    	String title = lessonData.getTitle();
	    	String description = lessonData.getDescription();
	    	String topic1 = lessonData.getTopic1();
	    	String topic2 = lessonData.getTopic2();
	    	String topic3 = lessonData.getTopic3();
	    	String detail1 = lessonData.getDetail1();
	    	String detail2 = lessonData.getDetail2();
	    	String detail3 = lessonData.getDetail3();
	    	String detail4 = lessonData.getDetail4();
	    	String detail5 = lessonData.getDetail5();
	    	String detail6 = lessonData.getDetail6();
	    	String detail7 = lessonData.getDetail7();
	    	String detail8 = lessonData.getDetail8();
	    	String detail9 = lessonData.getDetail9();
	    	
	    	request.setAttribute("title", title);
	    	request.setAttribute("description", description);
	    	request.setAttribute("topic1", topic1);
	    	request.setAttribute("topic2", topic2);
	    	request.setAttribute("topic3", topic3);
	    	request.setAttribute("detail1", detail1);
	    	request.setAttribute("detail2", detail2);
	    	request.setAttribute("detail3", detail3);
	    	request.setAttribute("detail4", detail4);
	    	request.setAttribute("detail5", detail5);
	    	request.setAttribute("detail6", detail6);
	    	request.setAttribute("detail7", detail7);
	    	request.setAttribute("detail8", detail8);
	    	request.setAttribute("detail9", detail9);
	    	
	    	request.getRequestDispatcher("lessonView.jsp").forward(request, response);
	    }
	    
	    
	    
	    private void quizPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	System.out.println("Quiz View");
	    	int lessonID = Integer.parseInt(request.getParameter("id"));
	    	currentUser = (String) session.getAttribute("username");
	    	System.out.println(currentUser);
	    	int profLVL = userDAO.getLVL(currentUser);
	    	quiz quiz = quizDAO.getQuiz(lessonID, profLVL);
	    	session.setAttribute("quizID", quiz.getQuizID());
	    	request.setAttribute("quiz", quiz);
	    	request.getRequestDispatcher("quizView.jsp").forward(request, response);
	    }
	    
	    private void resultPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
	    	System.out.println("Result View");
	    	
	    	currentUser = (String) session.getAttribute("username");
	    	int uID = userDAO.getID(currentUser);
	    	
	    	String ansrChoice = request.getParameter("ansr");
	    	
	    	int quizID = (Integer) (session.getAttribute("quizID"));
	    	String correctChoice = quizDAO.getCorrectAnsr(quizID);
	    	
	    	if (ansrChoice.equalsIgnoreCase(correctChoice)) {
	    		request.setAttribute("result", "Passed");
	    		userDAO.levelUP(uID);
	    	} else {
	    		request.setAttribute("result", "Failed");
	    	}
	    	request.getRequestDispatcher("resultView.jsp").forward(request, response);
	    }
	   
	    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	    	 String email = request.getParameter("email");
	    	 String password = request.getParameter("password");
	    	 
	    	if(userDAO.isValid(email, password)) 
	    	 {
	    		//added User user
	    		user user = userDAO.getUser(email);
	    		request.setAttribute("user", user);
	    		System.out.println("LOGIN VALID");
			 	currentUser = email;
			 	session = request.getSession();
				session.setAttribute("username", email);
				userPage(request, response);
			 			 			 			 
	    	 }
	    	 else {
	    		 request.setAttribute("loginStr","Login Failed: Please check your credentials.");
	    		 request.getRequestDispatcher("login.jsp").forward(request, response);
	    	 }
	    }
	           
	    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	    	String email = request.getParameter("email");
	    	System.out.println(email);
	   	 	String firstName = request.getParameter("firstName");
	   	 	System.out.println(firstName);
	   	 	String lastName = request.getParameter("lastName");
	   	 	System.out.println(lastName);
	   	 	String password = request.getParameter("password");
	   	 	System.out.println(password);
	   	 	String phoneNumber = request.getParameter("number");
	   	 	System.out.println(phoneNumber);
	   	 	String confirm = request.getParameter("confirmation");
	   	 	System.out.println(confirm);
	   	 	
	   	 	int prefLesson = Integer.parseInt(request.getParameter("topic"));
	   	 	System.out.println("Topic " + prefLesson);
	   	 	
	   	 	if (password.equals(confirm)) {
	   	 		if (!userDAO.checkEmail(email)) {
		   	 		System.out.println("Registration Successful! Added to database");
		            user users = new user(email,firstName, lastName, password, phoneNumber, prefLesson);
		   	 		userDAO.insert(users);
		   	 		response.sendRedirect("login.jsp");
	   	 		}
		   	 	else {
		   	 		System.out.println("Username taken, please enter new username");
		    		 request.setAttribute("errorOne","Registration failed: Username taken, please enter a new username.");
		    		 request.getRequestDispatcher("register.jsp").forward(request, response);
		   	 	}
	   	 	}
	   	 	else {
	   	 		System.out.println("Password and Password Confirmation do not match");
	   		 request.setAttribute("errorTwo","Registration failed: Password and Password Confirmation do not match.");
	   		 request.getRequestDispatcher("register.jsp").forward(request, response);
	   	 	}
	    }    
	    
	    
	    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
	    	currentUser = "";
        		response.sendRedirect("login.jsp");
        	}
	    
	    private void updateView(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException {
	    	System.out.println("UpdateProfile View");
	    	String email = (String)session.getAttribute("username");
	    	
	    	user user =userDAO.getUser(email);
	    	 
	        request.setAttribute("user", user);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("updateProfileView.jsp");
	        dispatcher.forward(request, response);
	    }
	    private void update(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException {
	    		System.out.println("Updating the database");
	   	 	String firstName = request.getParameter("firstName");
	   	 	String lastName = request.getParameter("lastName");
		    String phoneNum = request.getParameter("phoneNumber");
	   	 	String password = request.getParameter("NewPassword");
	   	 	String confirm = request.getParameter("confirmation");
	   	 	currentUser = (String)session.getAttribute("username");
		   	user existingUser = userDAO.getUser(currentUser);
		   	
	        if (existingUser != null) {
	        	existingUser.setEmail(currentUser);
	            // Update the user's information
	            existingUser.setFirstName(firstName);
	            existingUser.setLastName(lastName);
	            existingUser.setPhoneNum(phoneNum);
		    // Check if the "Change Password" button was clicked
	            if (request.getParameter("changePasswordButton") != "") {

			// If yes, check if the password and confirmation match
	            	if (password != null && !password.isBlank() && password.equals(confirm)) {
	            		existingUser.setPassword(password);
	            	}
	            
	            	else {
		    	        System.out.println("Password and Password Confirmation do not match.");
		    	        request.setAttribute("error", "Password and Password Confirmation do not match.");
		    	        updateView(request, response);
		            	return; // Stop further processing if password validation fails
	    	   	 }
		    }
			// Call the DAO method to update the user in the database
	            	userDAO.update(existingUser);
	            	System.out.println("Update Successful");
		        userPage(request, response); // Redirect to the user's profile page

	        } 
		else {
	            System.out.println("User not found.");
	            request.setAttribute("error", "User not found.");
	            request.getRequestDispatcher("updateProfileView.jsp").forward(request, response);
	        }
	    }
	  }

	    


