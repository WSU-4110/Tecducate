public class Lesson 
{

	    protected int lessonID;
	    protected String details;
	    protected String sample;
	 
	    //constructors
	    public Lesson() {
	    }
	
	    
	    public Lesson(int lessonID, String details, String sample) 
	    {
	    	setLessonID(lessonID);
	    	setDetails(details);
	    	setSample(sample);
	    }
	 
	    
	    
	   //Main variable set and get methods
	    public int getLessonID() {
	        return lessonID;
	    }
	    public void setLessonID(String lessonID) {
	        this.lessonID = lessonID;
	    }
	    
	    
	    public String getDetails() {
	        return details;
	    }
	    public void setDetails(String details) {
	        this.details = details;
	    }

	    
	    public String getSample() {
	        return sample;
	    }
	    public void setSample(String sample) {
	        this.sample = sample;
	    }
	    	    
	  
	   
	}