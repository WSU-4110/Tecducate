import java.math.*;

public class user 
{
		protected String email;
		protected String password;
	    protected String firstName;
	    protected String lastName;
	    protected String phoneNum;
	    protected int prefLesson;
	    protected int profLVL;
	    protected int userID;

	 
	    //constructors
	    public user() {
	    }
	 
	    public user(String email) 
	    {
	        this.email = email;
	    }

	    
	    public user(String email,String firstName, String lastName, String password, int prefLesson, int profLVL) 
	    {
	    	this(firstName,lastName,password, prefLesson, profLVL, 0);
	    	setEmail(email);
	    }
	 
	
	    public user(String firstName, String lastName, String password, int prefLesson, int profLVL, int userID) 
	    {
	    	setFirstName(firstName);
	    	setLastName(lastName);
	    	setPassword(password);
	    	setPrefLesson(prefLesson);
	    	setProfLVL(profLVL);
	    	setUserID(userID);
	    }
	    
	    public user(String email,String firstName, String lastName, String password, String phoneNum, int prefLesson) 
	    {
	    	this(firstName,lastName,password, prefLesson, 1, 0);
	    	setEmail(email);
	    	setPhoneNum(phoneNum);
	    }
	    
	    public user(String email,String firstName, String lastName, String password, String phoneNum) 
	    {
	    	this(email, firstName,lastName,password, phoneNum, 0);
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

	    public String getPhoneNum() {
	        return phoneNum;
	    }
	    public void setPhoneNum(String phoneNum) {
	        this.phoneNum = phoneNum;
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
	    	if (prefLesson >= 1 || prefLesson <=3)
	    		this.prefLesson = prefLesson;
	    	else 
	    		this.prefLesson = 1;
	    }

	    public int getUserID() {
	        return profLVL;
	    }
	    public void setUserID(int userID) {
	        this.userID = userID;
	    }
	    
}