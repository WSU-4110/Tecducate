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
@WebServlet("/quoteDAO")
public class quoteDAO 
{
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public quoteDAO(){}
	
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
    
    public List<quote> listAllQuotes() throws SQLException {
        List<quote> listQuote = new ArrayList<quote>();        
        String sql = "SELECT * FROM Quote";      
        connect_func();      
        statement = (Statement) connect.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("LISTING");
         
        while (resultSet.next()) {
            String time = resultSet.getString("times");
            String smithNote = resultSet.getString("smithNote");
            String clientNote = resultSet.getString("clientNote");
            double price = resultSet.getDouble("price");
            int quoteID = resultSet.getInt("quoteID"); 
            int requestID = resultSet.getInt("requestID"); 

             
            quote quotes = new quote(time, smithNote, clientNote, price, quoteID, requestID);
            listQuote.add(quotes);
        }        
        resultSet.close();
        disconnect();        
        return listQuote;
    }
    
    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }
    
    public void insert(quote quotes) throws SQLException {
    	connect_func("root","pass1234");         
		String sql = "insert into Quote(times, smithNote, clientNote, price, quoteID) values (?, ?, ?, ?, ?)";
		preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
			preparedStatement.setString(1, quotes.getTime());
			preparedStatement.setString(2, quotes.getSmithNote());
			preparedStatement.setString(3, quotes.getClientNote());
			preparedStatement.setDouble(4, quotes.getPrice());		
			preparedStatement.setInt(5, quotes.getQuoteID());	

		preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    
     
    public boolean update(quote quotes) throws SQLException {
        String sql = "update Quote set time=?, smithNote =?, clientNote = ?, price = ? where quoteID = ?";
        connect_func();
        
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, quotes.getQuoteID());
        preparedStatement.setString(2, quotes.getTime());
        preparedStatement.setString(3, quotes.getSmithNote());
		preparedStatement.setString(4, quotes.getClientNote());
		preparedStatement.setDouble(5, quotes.getPrice());
         
        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        return rowUpdated;     
    }
    
    public quote getQuote(int quoteID) throws SQLException {
    	quote quote = null;
        String sql = "SELECT * FROM User WHERE email = ?";
         
        connect_func();
         
        preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
        preparedStatement.setInt(1, quoteID);
         
        ResultSet resultSet = preparedStatement.executeQuery();
         
        if (resultSet.next()) {
            String time = resultSet.getString("time");
            String smithNote = resultSet.getString("smithNote");
            String clientNote = resultSet.getString("clientNote");
            double price = resultSet.getDouble("price");
            int requestID = resultSet.getInt("requestID");
            quote = new quote(time, smithNote, clientNote, price, quoteID, requestID);
        }
         
        resultSet.close();
        statement.close();
         
        return quote;
    }
    
    
    public void init() throws SQLException, FileNotFoundException, IOException{
    	connect_func();
        statement =  (Statement) connect.createStatement();
        
        String[] INITIAL = {"use testdb",
        					"drop table if exists Quote;",
					        ("CREATE TABLE if not exists Quote( " +
					            "quoteID int, "+
					            "clientNote varchar(30),"+ 
					            "smithNote varchar(30),"+ 
					            "times time,"+ 
					            "price int,"+
					            "requestID int,"+
					            "PRIMARY KEY (QuoteID),"+
					            "Foreign key (requestID) references Request(requestID));")
        					};
        String[] TUPLES = {"SET FOREIGN_KEY_CHECKS = 0;",
        					("INSERT INTO Quote(quoteID, clientNote , smithNote, times, price, requestID)"+
        					"VALUES (00001, 'Sold!', '', '1:00:00', 4500, 1),"+
        					"(00002, 'Sold!', '', '2:00:00', 5500, 2),"+
        					"(00003, 'Sold!', '', '3:00:00', 6500, 3),"+
        					"(00004, 'Sold!', '', '4:00:00', 7500, 2),"+
        					"(00005, 'Sold!', '', '5:00:00', 8500, 3),"+
        					"(00006, 'Sold!', '', '6:00:00', 9500, 4),"+
        					"(00007, 'Sold!', '', '7:00:00', 10500, 3),"+
        					"(00008, 'Sold!', '', '8:00:00', 11500, 2),"+
        					"(00009, 'Sold!', '', '9:00:00', 12500, 4),"+
        					"(00010, 'Sold!', '', '10:00:00', 13500, 2);"),
        					"SET FOREIGN_KEY_CHECKS = 1;"
			    			};
        
        //for loop to put these in database
        for (int i = 0; i < INITIAL.length; i++)
        	statement.execute(INITIAL[i]);
        for (int i = 0; i < TUPLES.length; i++)	
        	statement.execute(TUPLES[i]);
        disconnect();
    }
    
    
   
    
    
    
    
    
	
	

}
