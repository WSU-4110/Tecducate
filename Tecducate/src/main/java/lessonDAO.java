import java.sql.SQLException;
import java.lang.System;
import java.awt.datatransfer.SystemFlavorMap;
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

import javax.servlet.annotation.WebServlet;

@WebServlet("/lessonDAO")
public class lessonDAO {
    private Connection connect = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public lessonDAO() {}

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
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
    public Lesson getLesson() {
        return getLesson();
    }
    public Lesson getLesson(int lessonID, String details, String sample ) throws SQLException {
    	BaseLesson lesson = null;
    	System.out.println("GET Lesson IS RUNNING");
    	System.out.println(lessonID + " " + details + " " + sample);
        String sql = "SELECT * FROM Lesson WHERE lessonID = ? ;";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, lessonID);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            int LessonID = resultSet.getInt("lessonID");
            String Details = resultSet.getString("details");
            String Samples = resultSet.getString("samples");
            lesson = new BaseLesson(LessonID, Details, Samples);          
            
        }
        
    	if(lessonID == 100) {
    		lesson.setLessonLink("lessonView.jsp");
    	}
    	else if(lessonID == 101) {
    		lesson.setLessonLink("lessonView2.jsp");
    	}
    	else if(lessonID == 102) {
    		lesson.setLessonLink("lessonView3.jsp");
    	}
    	else
    		System.out.println("invlid lessonID");
    	
        System.out.println(lesson.getLessonID() + " " + lesson.getLessonlink());
        
        
        resultSet.close();
        preparedStatement.close();
         
        return lesson;
    }

}