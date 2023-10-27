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
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;


public class ControlServlet extends HttpServlet {
	    private static final long serialVersionUID = 1L;
	    private userDAO userDAO = new userDAO();
	    private requestDAO requestDAO = new requestDAO();
	    private quoteDAO quoteDAO = new quoteDAO();
	    private treeDAO treeDAO = new treeDAO();
	    private billDAO billDAO = new billDAO();
	    private String currentUser;
	    private HttpSession session=null;
	    
	    public ControlServlet()
	    {
	    	
	    }
	    
	    public void init()
	    {
	    	userDAO = new userDAO();
	    	requestDAO = new requestDAO();
	    	quoteDAO = new quoteDAO();
	    	treeDAO = new treeDAO();
	    	billDAO = new billDAO();
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
        	case "/initialize":
        		userDAO.init();
        		requestDAO.init();
        		quoteDAO.init();
        		treeDAO.init();
        		billDAO.init();
        		System.out.println("Database successfully initialized!");
        		rootPage(request,response,"");
        		break;
        	case "/root":
        		rootPage(request,response, "");
        		break;
        	case "/logout":
        		logout(request,response);
        		break;
        	 case "/listUser": 
                 System.out.println("The action is: listUser");
                 listUser(request, response);           	
                 break;
        	 case "/treeView":
        		 System.out.println("The action is: treeView");
                 showTrees(request, response);           	
                 break;
        	 case "/requestView":
        		 System.out.println("The action is: requestView");
                 showRequest(request, response);           	
                 break;
	    	}
	    }
	    catch(Exception ex) {
        	System.out.println(ex.getMessage());
	    	}
	    }
        	
	    private void listUser(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
	        System.out.println("listUser started: 00000000000000000000000000000000000");
	        List<user> listUser = userDAO.listAllUsers();
	        request.setAttribute("listUser", listUser);       
	        RequestDispatcher dispatcher = request.getRequestDispatcher("UserList.jsp");       
	        dispatcher.forward(request, response);
	     
	        System.out.println("listPeople finished: 111111111111111111111111111111111111");
	    }
	    
	    private void showTrees(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, ServletException, IOException {
	        System.out.println("showTrees started: 000000000000000000000000000");
	        int id = Integer.parseInt(request.getParameter("id"));
	        System.out.println("showTrees started: 222222222222222222222222222");
	        System.out.println(id);
	        List<tree> listTree = treeDAO.listTrees(id);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("treeList.jsp");
	        request.setAttribute("listTree", listTree);
	        dispatcher.forward(request, response); // The forward() method works at server side, and It sends the same request and response objects to another servlet.
	        System.out.println("Now you see the Tree List page in your browser.");
	        System.out.println("showTrees finished: 1111111111111111111111111111");
	    }
	    
	    private void showRequest(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, ServletException, IOException {
	        System.out.println("showRequest started: 000000000000000000000000000");
	        int id = Integer.parseInt(request.getParameter("id"));
	        System.out.println("showRequest started: 222222222222222222222222222");
	        System.out.println(id);
	        List<request> listRequest = requestDAO.listRequests(id);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("requestList.jsp");
	        request.setAttribute("listRequest", listRequest);
	        dispatcher.forward(request, response); // The forward() method works at server side, and It sends the same request and response objects to another servlet.
	        System.out.println("Now you see the Request List page in your browser.");
	        System.out.println("showRequest finished: 1111111111111111111111111111");
	    }
	    	        
	    private void rootPage(HttpServletRequest request, HttpServletResponse response, String view) throws ServletException, IOException, SQLException{
	    	System.out.println("root view");
			request.setAttribute("listUser", userDAO.listAllUsers());
	    	request.getRequestDispatcher("rootView.jsp").forward(request, response);
	    }
	    
	    private void smithPage(HttpServletRequest request, HttpServletResponse response, String view) throws ServletException, IOException, SQLException{
	    	System.out.println("Smith view");
			request.setAttribute("listQuote", quoteDAO.listAllQuotes());
	    	request.getRequestDispatcher("davidSmithView.jsp").forward(request, response);
	    }
	    
	    private void clientPage(HttpServletRequest request, HttpServletResponse response, String view) throws ServletException, IOException, SQLException{
	    	System.out.println("Client view");
			request.setAttribute("listRequest", requestDAO.listAllRequests());
	    	request.getRequestDispatcher("clientView.jsp").forward(request, response);
	    }
	    
	    
	    protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	    	 String email = request.getParameter("email");
	    	 String password = request.getParameter("password");
	    	 
	    	 if (email.equals("root") && password.equals("pass1234")) {
				 System.out.println("Login Successful! Redirecting to root");
				 session = request.getSession();
				 session.setAttribute("username", email);
				 rootPage(request, response, "");
	    	 }
	    	 else if(email.equals("davidSmith@gmail.com") && password.equals("ds1234")) {
	    		 System.out.println("Login Successful! Redirecting to Smith Page");
				 session = request.getSession();
				 session.setAttribute("username", email);
				 smithPage(request, response, "");
	    	 }
	    	 else if(userDAO.isValid(email, password)) 
	    	 {
			 	 
			 	 currentUser = email;
			 	session = request.getSession();
				session.setAttribute("username", email);
				clientPage(request, response, "");
			 			 			 			 
	    	 }
	    	 else {
	    		 request.setAttribute("loginStr","Login Failed: Please check your credentials.");
	    		 request.getRequestDispatcher("login.jsp").forward(request, response);
	    	 }
	    }
	           
	    private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
	    	String email = request.getParameter("email");
	   	 	String firstName = request.getParameter("firstName");
	   	 	String lastName = request.getParameter("lastName");
	   	 	String password = request.getParameter("password");
	   	 	String creditCard = request.getParameter("creditCard");
	   	 	String phoneNumber = request.getParameter("phoneNumber"); 
	   	 	String confirm = request.getParameter("confirmation");
	   	 	
	   	 	if (password.equals(confirm)) {
	   	 		if (!userDAO.checkEmail(email)) {
		   	 		System.out.println("Registration Successful! Added to database");
		            user users = new user(email,firstName, lastName, password, creditCard, phoneNumber);
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
	    
	    
	    
	    
	    
}
	        
	        
	    
	        
	        
	        
	    


