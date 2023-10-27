import java.math.*;

public class user 
{
		protected String email;
		protected String password;
	    protected String firstName;
	    protected String lastName;
	    protected String creditCard;
	    protected String phoneNumber;
	    protected int clientID;
	 
	    //constructors
	    public user() {
	    }
	 
	    public user(String email) 
	    {
	        this.email = email;
	    }
	    
	    public user(String email,String firstName, String lastName, String password, String creditCard, String phoneNumber) 
	    {
	    	this(firstName,lastName,password,creditCard,phoneNumber);
	    	this.email = email;
	    	setClientID( (int) (Math.random() * 100 + 1) );
	    }
	    
	    public user(String email,String firstName, String lastName, String password, String creditCard, String phoneNumber, int clientID) 
	    {
	    	this(firstName,lastName,password,creditCard,phoneNumber);
	    	this.email = email;
	    	this.clientID = clientID;
	    }
	 
	
	    public user(String firstName, String lastName, String password, String creditCard, String phoneNumber) 
	    {
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.password = password;
	        this.creditCard = creditCard;
	        this.phoneNumber = phoneNumber;
	    }
	    
	   //getter and setter methods
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    
	    public String getCreditCard() {
	        return creditCard;
	    }
	    public void setCreditCard(String creditCard) {
	        this.creditCard = creditCard;
	    }
	    
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }
	    
	    public int getClientID() {
	        return clientID;
	    }
	    public void setClientID(int clientID) {
	        this.clientID = clientID;
	    }
	  
	   
	}