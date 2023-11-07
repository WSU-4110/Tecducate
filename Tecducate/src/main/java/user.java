import java.math.*;

public class user 
{
		protected String email;
		protected String password;
	    protected String firstName;
	    protected String lastName;

	    protected String Preferences;

	    protected int prefLesson;
	    protected int profLVL;

	 
	    //constructors
	    public user() {
	    }
	 
	    public user(String email) 
	    {
	        this.email = email;
	    }

	    
	    public user(String email,String firstName, String lastName, String password, int prefLesson, int profLVL) 
	    {
	    	this(firstName,lastName,password, prefLesson, profLVL);
	    	setEmail(email);
	    }
	 
	
	    public user(String firstName, String lastName, String password, int prefLesson, int profLVL) 
	    {
	    	setFirstName(firstName);
	    	setLastName(lastName);
	    	setPassword(password);
	    	setPrefLesson(prefLesson);
	    	setProfLVL(profLVL);
	    }
	    
	    public user(String firstName, String lastName, String password) 
	    {
	    	setFirstName(firstName);
	    	setLastName(lastName);
	    	setPassword(password);
	    }
	    
	    public user(String email,String firstName, String lastName, String password, int prefLesson) 
	    {
	    	this(firstName,lastName,password, prefLesson, 0);
	    	setEmail(email);
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
	    


	    
	    public int getProfLVL() {
	        return profLVL;
	    }
	    public void setProfLVL(int profLVL) {
	        this.profLVL = profLVL;
	    }
	    
	    public int getPrefLesson() {
	        return prefLesson;
	    }
	    public void setPrefLesson(int prefLesson) {
	        this.prefLesson = prefLesson;
	    }

	}