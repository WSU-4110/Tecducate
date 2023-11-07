import java.math.*;

public class quiz 
{
		protected quizDifficulty difficulty; 
		
		protected int quizID;
		protected int lessonID;
		protected int LVL;
		protected String directions;
	    protected String question;
	    protected String ansr1;
	    protected String ansr2;
	    protected String ansr3;
	    protected String ansr4;
	 
	    //constructors
	    public quiz() {
	    }
	
	    
	    public quiz(int quizID, String directions, String question, String ansr1, String ansr2, String ansr3, String ansr4, int lessonID, quizDifficulty difficulty) 
	    {
	    	setQuizID(quizID);
	    	setDirections(directions);
	    	setQuestion(question);
	    	setAnsr1(ansr1);
	    	setAnsr2(ansr2);
	    	setAnsr3(ansr3);
	    	setAnsr4(ansr4);
	    	setLessonID(lessonID);
	    	setDifficulty(difficulty);
	    }
	 
	   //Difficultly set and get methods
	    public void setDifficulty(quizDifficulty difficulty) {
	    	this.difficulty = difficulty;
	    	LVL = this.difficulty.quizLevel();
	    }
	    public quizDifficulty getDifficulty() {
	    	return difficulty;
	    }
	    
	    
	   //Main variable set and get methods
	    public String getDirections() {
	        return directions;
	    }
	    public void setDirections(String directions) {
	        this.directions = directions;
	    }
	    
	    
	    public String getQuestion() {
	        return question;
	    }
	    public void setQuestion(String question) {
	        this.question = question;
	    }

	    
	    public String getAnsr1() {
	        return ansr1;
	    }
	    public void setAnsr1(String ansr1) {
	        this.ansr1 = ansr1;
	    }

	    
	    public String getAnsr2() {
	        return ansr2;
	    }
	    public void setAnsr2(String ansr2) {
	        this.ansr2 = ansr2;
	    }
	    
	    
	    public String getAnsr3() {
	        return ansr3;
	    }
	    public void setAnsr3(String ansr3) {
	        this.ansr3 = ansr3;
	    }
	    
	    
	    public String getAnsr4() {
	        return ansr4;
	    }
	    public void setAnsr4(String ansr4) {
	        this.ansr4 = ansr4;
	    } 
	    
	    
	    public int getQuizID() {
	        return quizID;
	    }
	    public void setQuizID(int quizID) {
	    	this.quizID = quizID;
	    }
	    
	   
	    public int getLessonID() {
	        return lessonID;
	    }
	    public void setLessonID(int lessonID) {
	    	this.lessonID = lessonID;
	    }
	    
	    
	    public int getLVL() {
	        return LVL;
	    }
	    public void setLVL() {
	       LVL = difficulty.quizLevel();
	    }
	  
	   
	}