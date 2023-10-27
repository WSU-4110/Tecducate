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
@WebServlet("/requestDAO")
public class requestDAO 
{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public requestDAO(){}
	
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
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?allowPublicKeyRetrieval=true&useSSL=false&user=root&password=pass1234");
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
  			      .getConnection("jdbc:mysql://127.0.0.1:3306/testdb?allowPublicKeyRetrieval=true&"
  			          + "useSSL=false&user=" + username + "&password=" + password);
            System.out.println(connect);
        }
    }
    
    public List<request> listAllRequests() throws SQLException {
        List<request> listRequest = new ArrayList<request>();        
        String sql = "SELECT * FROM Request";      
        connect_func();      
        statement = (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("LISTING");
         
        while (resultSet.next()) {
            String smithNote = resultSet.getString("smithNote");
            String clientNote = resultSet.getString("clientNote");
            int treeCount = resultSet.getInt("treeCount");
            int requestID = resultSet.getInt("requestID");

             
            request requests = new request(smithNote, clientNote, treeCount, requestID);
            listRequest.add(requests);
        }        
        resultSet.close();
        disconnect();        
        return listRequest;
    }
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
    
    public List<request> listRequests(int id) throws SQLException {
        List<request> listRequest = new ArrayList<request>();        
        String sql = "SELECT * FROM Request Where Request.requestID = " + id;      
        connect_func();      
        statement = (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("LISTING REQUESTS");
         
        while (resultSet.next()) {
            String smithNote = resultSet.getString("smithNote");
            String clientNote = resultSet.getString("clientNote");
            int treeCount = resultSet.getInt("treeCount");
            int requestID = resultSet.getInt("requestID");

             
            request requests = new request(smithNote, clientNote, treeCount, requestID);
            listRequest.add(requests);
        }        
        resultSet.close();
        disconnect();        
        return listRequest;
    }
    
    
    public void insert(request requests) throws SQLException {
    	connect_func("root","pass1234");         
		String sql = "insert into User(smithNote, clientNote, treeCount, requestID) values (?, ?, ?, ?)";
		preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
		preparedStatement.setString(1, requests.getSmithNote());
		preparedStatement.setString(2, requests.getClientNote());
		preparedStatement.setInt(3, requests.getTreeCount());	
		preparedStatement.setInt(4, requests.getRequestID());	

		preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    
    public boolean delete(String requestID) throws SQLException {
        String sql = "DELETE FROM Request WHERE requestID = ?";        
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, requestID);
         
        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowDeleted;     
    }
     
    public boolean update(request requests) throws SQLException {
        String sql = "update Request set smithNote=?, clientNote =?, treeCount = ? where requestID = ?";
        connect_func();
        
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, requests.getRequestID());
        preparedStatement.setString(2, requests.getSmithNote());
		preparedStatement.setString(3, requests.getClientNote());
		preparedStatement.setInt(4, requests.getTreeCount());
         
        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowUpdated;     
    }
    
    public request getRequest(int requestID) throws SQLException {
    	request request = null;
        String sql = "SELECT * FROM Request WHERE requestID = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, requestID);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            String smithNote = resultSet.getString("smithNote");
            String clientNote = resultSet.getString("clientNote"); 
            int treeCount = resultSet.getInt("treeCount"); 
            
            request = new request(smithNote, clientNote, treeCount);
        }
         
        resultSet.close();
        statement.close();
         
        return request;
    }
    
    
    
    public void init() throws SQLException, FileNotFoundException, IOException{
    	connect_func();
        statement =  (Statement) connect.createStatement();
        
        String[] INITIAL = {"use testdb;",
					        "drop table if exists Request;",
					        ("CREATE TABLE if not exists Request( " +
					            "smithNote VARCHAR(500) NOT NULL, " + 
					            "clientNote VARCHAR(500) NOT NULL, " +
					            "treeCount INT(10) NOT NULL, " +
					            "requestID INT(20) NOT NULL, " +
					            "PRIMARY KEY (requestID) "+"); ")
        					};
        String[] TUPLES = {("insert into Request(requestID, smithNote, clientNote, treeCount)"+
        			"values  (1,'Sold!', '',  2)," +
        			"(2, 'Sold!', '', 4)," +
        			"(3, 'Sold!', '', 5)," +
        			"(4, 'Sold!', '', 4)," +
        			"(5, 'Sold!', '', 2)," +
        			"(6, 'Sold!', '', 5)," +
        			"(7, 'Sold!', '', 3)," +
        			"(8, 'Sold!', '', 2)," +
        			"(9, 'Sold!', '', 2)," +
        			"(10, 'Sold!', '', 1); ")
			    	};
        
        //for loop to put these in database
        for (int i = 0; i < INITIAL.length; i++)
        	statement.execute(INITIAL[i]);
        for (int i = 0; i < TUPLES.length; i++)	
        	statement.execute(TUPLES[i]);
        disconnect();
    }
    
    
   
    
    
    
    
    
	
	

}
