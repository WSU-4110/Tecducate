import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public  class BasicLesson implements Lesson {
    protected int lessonId;
    protected String details;
    protected String samples;
    protected String lessonLink;
  
    public BasicLesson(int lessonId, String Details, String Samples) {
    	setlessonID(lessonId);
        setDetails(Details);
        setSamples(Samples);
    }
    
    public void setlessonID(int ID){
    	this.lessonId = ID;
    }
    public int getLessonID() {
    	return lessonId;
    }
    
    public void setDetails(String Details) {
    	this.details = Details;
    }
    public String getDetails() {
    	return details;
    		
    }
    
    public void setSamples(String Samples) {
    	this.samples = Samples;
    }
    public String getSamples() {
    	return samples;
    }
    
    public void setLessonLink(String link) {
    	this.lessonLink = link;
    }
    
    public String getLessonlink() {
    	return lessonLink;
    }
    
    
	@Override
	public void displayContent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayContent() {
		// TODO Auto-generated method stub
		
	}

}