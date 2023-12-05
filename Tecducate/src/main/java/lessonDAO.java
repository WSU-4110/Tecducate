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
@WebServlet("/lessonDAO")
public class lessonDAO 
{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public lessonDAO(){}
	
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
    
    
    public lessonData getLesson(int lID) throws SQLException {
    	System.out.println("GET LESSON RUNNNING IN LESSONDAO");
    	
    	lessonData lesson = null;
        String sql = "SELECT * FROM Lesson WHERE lessonID = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, lID);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
        	
        	int lessonID = resultSet.getInt("lessonID");
        	System.out.println(lessonID);
        	String title = resultSet.getString("title");
        	System.out.println(title);
        	String description = resultSet.getString("description");
        	System.out.println(description);
        	String topic1 = resultSet.getString("topic1");
        	System.out.println(topic1);
        	String topic2 = resultSet.getString("topic2");
        	System.out.println(topic2);
        	String topic3 = resultSet.getString("topic3");
        	System.out.println(topic3);
        	String detail1 = resultSet.getString("detail1");
        	System.out.println(detail1);
        	String detail2 = resultSet.getString("detail2");
        	System.out.println(detail2);
        	String detail3 = resultSet.getString("detail3");
        	System.out.println(detail3);
        	String detail4 = resultSet.getString("detail4");
        	System.out.println(detail4);
        	String detail5 = resultSet.getString("detail5");
        	System.out.println(detail5);
        	String detail6 = resultSet.getString("detail6");
        	System.out.println(detail6);
        	String detail7 = resultSet.getString("detail7");
        	System.out.println(detail7);
        	String detail8 = resultSet.getString("detail8");
        	System.out.println(detail8);
        	String detail9 = resultSet.getString("detail9");
        	System.out.println(detail9);
        	
        	lesson = new lessonData(lessonID, title, description, topic1, topic2, topic3, detail1, detail2, detail3, detail4, detail5, detail6, detail7, detail8, detail9);
        	
        }
         
        resultSet.close();
        preparedStatement.close();
        
        System.out.println("GET LESSON TERMINATED IN LESSONDAO");
       
        return lesson;
    }
    
    public lessonData indexandgetLesson(int lessonID) throws SQLException{
    	
    	String correctLesson = "";
    	lessonData lesson = null;
    	
    	String sql = "SELECT * FROM Lesson WHERE LessonID = ?;";
        	
    	connect_func();
        
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, lessonID);
        
         
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if (resultSet.next()) {
            lessonID = resultSet.getInt("lessonID");
            String details = resultSet.getString("details");
            String sample = resultSet.getString("sample");
            //lesson = new lessonData(lessonID, details, sample);          
            
        }
         
        //System.out.println(lesson.getID() + " " + lesson.getDetails() + " " + lesson.getSample());
        
        resultSet.close();
        preparedStatement.close();
         
        return lesson;     
        
    }
}