import java.math.*;

public class user 
{
		protected String email;
		protected String password;
	    protected String firstName;
	    protected String lastName;
	    protected String Preferences;
	 
	    //constructors
	    public user() {
	    }
	 
	    public user(String email) 
	    {
	        this.email = email;
	    }

	    
	    public user(String email,String firstName, String lastName, String password) 
	    {
	    	this(firstName,lastName,password);
	    	this.email = email;
	    }
	 
	
	    public user(String firstName, String lastName, String password) 
	    {
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.password = password;
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
	    public String getPreferences() {
	        return Preferences;
	    }
	    public void setPreferences(String Preferences) {
	        this.Preferences = Preferences;
	    }
	    

	  
	   
	}