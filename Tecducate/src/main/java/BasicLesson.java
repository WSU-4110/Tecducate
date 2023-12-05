import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public  class BasicLesson implements Lesson {
    private int lessonId;
    private String details;
    private String samples;
    private String lessonLink;
  
    public BasicLesson(int lessonId, String Details, String Samples) {
        this.lessonId = lessonId;
        this.details = Details;
        this.samples = Samples;
    }
    
    public void setlessonID(int ID){
    	this.lessonId = ID;
    }
    public int getLessonID() {
    	return lessonId;
    }
    
    private void setDetails(String Details) {
    	this.details = Details;
    }
    public String getDetails() {
    	return details;
    		
    }
    
    private void setSamples(String Samples) {
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
        // Default implementation or common behavior
    }

	@Override
	public void displayContent() {
		// TODO Auto-generated method stub
		
	}
}