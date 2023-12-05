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
@WebServlet("/userDAO")
public class userDAO 
{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public userDAO(){}
	
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
    
    public List<user> listAllUsers() throws SQLException {
        List<user> listUser = new ArrayList<user>();        
        String sql = "SELECT * FROM User ORDER BY profLVL DESC";      
        connect_func();      
        statement = (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("LISTING");
         
        while (resultSet.next()) {
            String email = resultSet.getString("email");
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            String password = resultSet.getString("password");
            String phoneNum = resultSet.getString("phoneNumber");
            int prefLesson = resultSet.getInt("prefLesson");
            int profLVL = resultSet.getInt("profLVL");

             
            user users = new user(email,firstName,lastName,password,phoneNum,prefLesson, profLVL);
            listUser.add(users);
        }        
        resultSet.close();
        disconnect();        
        return listUser;
    }
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
    
    public void insert(user users) throws SQLException {
    	connect_func("root","pass1234");         
		String sql = "insert into User(email, firstName, lastName, password, phoneNumber, prefLesson) values (?, ?, ?, ?, ?, ?)";
		preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
			preparedStatement.setString(1, users.getEmail());
			preparedStatement.setString(2, users.getFirstName());
			preparedStatement.setString(3, users.getLastName());
			preparedStatement.setString(4, users.getPassword());
			preparedStatement.setString(5, users.getPhoneNum());
			preparedStatement.setInt(6, users.getPrefLesson());

		preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    
    public boolean delete(String email) throws SQLException {
        String sql = "DELETE FROM User WHERE email = ?";        
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
         
        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowDeleted;     
    }
     
    public boolean update(user users) throws SQLException {
        String sql = "update User set firstName=?, lastName =?,password = ?, phoneNumber =? where email = ?";
        connect_func();
        
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
		preparedStatement.setString(1, users.getFirstName());
		preparedStatement.setString(2, users.getLastName());
		preparedStatement.setString(3, users.getPassword());
	    	preparedStatement.setString(4, users.getPhoneNum());
	    	preparedStatement.setString(5, users.getEmail());
         
        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowUpdated;     
    }
    
    public int getLVL(String email) throws SQLException {
    	int LVL = 0;
        String sql = "SELECT profLVL FROM User WHERE email = ?;";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            LVL = resultSet.getInt("profLVL");
            
        }
         
        resultSet.close();
        statement.close();
         
        return LVL;
    }
    
    
    public int getLVL(int uID) throws SQLException {
    	System.out.println("GET LEVEL RUNNNING IN USERDAO");
    	
    	int LVL = 0;
        String sql = "SELECT profLVL FROM User WHERE userID = ?;";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, uID);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            LVL = resultSet.getInt("profLVL");
            
        }
         
        resultSet.close();
        statement.close();
        
        System.out.println("GET LEVEL TERMINATED IN USERDAO");
         
        return LVL;
    }
    
    
    public void levelUP(int uID) throws SQLException {
    	System.out.println("LEVELUP RUNNNING IN USERDAO");
    	System.out.println("USERID: " + uID);
    	
    	int currentLVL = getLVL(uID);
    	System.out.println("CURRENT LEVEL: " + currentLVL);
    	
    	if (currentLVL != 3) {
    		
    		currentLVL++;
    		System.out.println("NEW LEVEL: " + currentLVL);
    		String sql = "update User set profLVL = " + currentLVL + " where userID = " + uID;
            connect_func();
            statement =  (Statement) connect.createStatement();
            
            statement.execute(sql);   
            
            disconnect();
            
    	}
    	
    	System.out.println("LEVELUP TERMINATED IN USERDAO");
    }
    
    public int getID(String email) throws SQLException {
    	System.out.println("GET USERID RUNNNING IN USERDAO");
    	
    	int uID = 0;
        String sql = "SELECT userID FROM User WHERE email = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            uID = resultSet.getInt("userID");
        }
         
        resultSet.close();
        statement.close();
        
        System.out.println("UserID: " + uID);
        
        System.out.println("GET USERID TERMINATED IN USERDAO");
       
        return uID;
    }
    
    
    public int getLesson(String email) throws SQLException {
    	System.out.println("GET LESSON RUNNNING IN USERDAO");
    	
    	int prefLesson = 0;
        String sql = "SELECT prefLesson FROM User WHERE email = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
        	prefLesson = resultSet.getInt("prefLesson");
        }
         
        resultSet.close();
        statement.close();
        
        System.out.println("PrefLesson: " + prefLesson);
        
        System.out.println("GET LESSON TERMINATED IN USERDAO");
       
        return prefLesson;
    }
    
    public user getUser(String email) throws SQLException {
    	user user = null;
        String sql = "SELECT * FROM User WHERE email = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            String firstName = resultSet.getString("firstName");
            String lastName = resultSet.getString("lastName");
            String password = resultSet.getString("password");
	    String phoneNum = resultSet.getString("phoneNumber");
            int prefLesson = resultSet.getInt("prefLesson");
            int profLVL = resultSet.getInt("profLVL");
            
            user = new user(email, firstName, lastName, password, phoneNum, prefLesson, profLVL);
        }
         
        resultSet.close();
        statement.close();
         
        return user;
    }
    
    public boolean checkEmail(String email) throws SQLException {
    	boolean checks = false;
    	String sql = "SELECT * FROM User WHERE email = ?";
    	connect_func();
    	preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, email);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        System.out.println(checks);	
        
        if (resultSet.next()) {
        	checks = true;
        }
        
        System.out.println(checks);
    	return checks;
    }
    
    public boolean checkPassword(String password) throws SQLException {
    	boolean checks = false;
    	String sql = "SELECT * FROM User WHERE password = ?";
    	connect_func();
    	preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setString(1, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        System.out.println(checks);	
        
        if (resultSet.next()) {
        	checks = true;
        }
        
        System.out.println(checks);
       	return checks;
    }
    
    
    
    public boolean isValid(String email, String password) throws SQLException
    {
    	String sql = "SELECT * FROM User";
    	connect_func();
    	statement = (Statement) connect.createStatement();
    	ResultSet resultSet = statement.executeQuery(sql);
    	
    	resultSet.last();
    	
    	int setSize = resultSet.getRow();
    	resultSet.beforeFirst();
    	
    	for(int i = 0; i < setSize; i++)
    	{
    		resultSet.next();
    		if(resultSet.getString("email").equals(email) && resultSet.getString("password").equals(password)) {
    			return true;
    		}		
    	}
    	return false;
    }
    
    
    public void init() throws SQLException, FileNotFoundException, IOException{
    	connect_func();
        statement =  (Statement) connect.createStatement();
        
        String[] INITIAL = {"drop database if exists testdb; ",
					        "create database testdb; ",
					        "use testdb; ",
					        "drop table if exists User; ",
					        ("CREATE TABLE if not exists User( " +
					            "email VARCHAR(50) NOT NULL, " + 
					            "firstName VARCHAR(20) NOT NULL, " +
					            "lastName VARCHAR(20) NOT NULL, " +
					            "password VARCHAR(20) NOT NULL, " +
					            "creditCard CHAR(16) NOT NULL," +
					            "phoneNumber CHAR(10) NOT NULL," +
					            "clientID INT NOT NULL," +
					            "PRIMARY KEY (email) "+"); ")
        					};
        String[] TUPLES = {("insert into User(clientID, phoneNumber, email, creditCard, firstName, lastName, password)"+
        			"values ('3333', '12345678', 'susie@gmail.com', '1233216547', 'Susie ', 'Guzman', 'susie1234')," +
        			"('10', '1234567890', 'johnsmith@gmail.com', 11111111, 'John', 'Smith', '1234')," +
        			"(20, 4353536377, 'joerey@gmail.com', 22222222, 'Joe', 'Rey', '1234')," +
        			"(30, 6456478874, 'jameswhite@gmail.com', 33333333, 'James', 'White' , '1234')," +
        			"(40, 1124435677, 'aaronrodgers@gmail.com', 44444444, 'Aaron', 'Rodgers' , '1234')," +
        			"(50, 9898654463, 'johndoe@gmail.com', 55555555, 'John', 'Doe' , '1234')," +
        			"(60, 8478976444, 'barbakew@gmail.com', 66666666, 'Barb', 'Akew' , '1234')," +
        			"(70, 4645735282, 'oliveyew@gmail.com', 77777777, 'Olive', 'Yew' , '1234')," +
        			"(80, 0902848747, 'noahlyles@gmail.com', 88888888, 'Noah', 'Lyles' , '1234')," +
        			"(90, 1235134356, 'victorabu@gmail.com', 99999999, 'Victor', 'Abu', '1234')," +
        			"(100, 6546534262, 'Lukmanace@gmail.com', 00000000, 'Lukman', 'Ace', '1234')," +
        			"(110, 2345234234, 'davidSmith@gmail.com', 2142552, 'David', 'Smith', 'ds1234')," +
        			"(120, 7777888899, 'root', 00000000, 'default', 'default','pass1234');")
			    			};
        
        //for loop to put these in database
        for (int i = 0; i < INITIAL.length; i++)
        	statement.execute(INITIAL[i]);
        for (int i = 0; i < TUPLES.length; i++)	
        	statement.execute(TUPLES[i]);
        disconnect();
    }
    
    
   
    
    
    
    
    
	
	

}
