import java.io.FileNotFoundException;

import java.lang.System;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class Connect
 */
@WebServlet("/quizDAO")
public class quizDAO 
{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public quizDAO(){}
	
	/** 
	 * @see HttpServlet#HttpServlet()
     */
    protected void connect_func() throws SQLException {
    	//uses default connection to the database
        if (connect == null || connect.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/webDB?allowPublicKeyRetrieval=true&useSSL=false&user=root&password=pass1234");
            System.out.println(connect);
        }
    }
    
    public boolean database_login(String email, String password) throws SQLException{
    	try {
    		connect_func("root","pass1234");
    		String sql = "select * from user where email = ?";
    		preparedStatement = connect.prepareStatement(sql);
    		preparedStatement.setString(1, email);
    		ResultSet rs = preparedStatement.executeQuery();
    		return rs.next();
    	}
    	catch(SQLException e) {
    		System.out.println("failed login");
    		return false;
    	}
    }
	//connect to the database 
    public void connect_func(String username, String password) throws SQLException {
        if (connect == null || connect.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            connect = (Connection) DriverManager
  			      .getConnection("jdbc:mysql://127.0.0.1:3306/webDB?allowPublicKeyRetrieval=true&"
  			          + "useSSL=false&user=" + username + "&password=" + password);
            System.out.println(connect);
        }
    }
    
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }

    
    public quiz getQuiz(int lessonID, int LVL) throws SQLException {
    	quiz quiz = null;
    	quizDifficulty difficulty = null;
    	if (LVL == 1) {
    		difficulty = new beginnerDifficulty();
    	} else if (LVL == 2) {
    		difficulty = new intermediateDifficulty();
    	} else if (LVL == 3) {
    		difficulty = new advancedDifficulty();
    	} else {
    		difficulty = new beginnerDifficulty();
    	}
    	System.out.println("GET QUIZ IS RUNNING");
    	System.out.println(lessonID + " " + LVL);
        String sql = "SELECT * FROM Quiz WHERE lessonID = ? and LVL = ?  ;";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, lessonID);
        preparedStatement.setInt(2, LVL);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            int quizID = resultSet.getInt("quizID");
            String directions = resultSet.getString("directions");
            String question = resultSet.getString("question");
            String ansr1 = resultSet.getString("ansr1");
            String ansr2 = resultSet.getString("ansr2");
            String ansr3 = resultSet.getString("ansr3");
            String ansr4 = resultSet.getString("ansr4");
            quiz = new quiz(quizID, directions, question, ansr1, ansr2, ansr3, ansr4, lessonID, difficulty);          
            
        }
         
        System.out.println(quiz.getQuestion() + " " + quiz.getAnsr4());
        
        resultSet.close();
        preparedStatement.close();
         
        return quiz;
    }

      
    
	
	

}
