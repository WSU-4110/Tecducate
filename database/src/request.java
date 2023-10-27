import java.math.*;

public class request extends tree
{
		protected tree[] treeArr;
	 	protected String smithNote;
	    protected String clientNote;
	    protected int treeCount;
	    protected int requestID;
	 
	    //constructors
	    public request() {
	    }
	 
	    public request(String smithNote, String clientNote, int treeCount) 
	    {
	        setSmithNote(smithNote);
	        setClientNote(clientNote);
	        setTreeCount(treeCount);
	        treeArr = new tree[getTreeCount()];
	        for (int i = 0; i < getTreeCount(); i++) {
	        	treeArr[i] = new tree();
	        }
	        setRequestID( (int) (Math.random() * 100 + 1) );
	    }
	    
	    public request(String smithNote, String clientNote, int treeCount, int requestID) 
	    {
	        setSmithNote(smithNote);
	        setClientNote(clientNote);
	        setTreeCount(treeCount);
	        setRequestID(requestID);
	    }
	 
	    
	  //getter and setter methods
	    public String getSmithNote() {
	        return smithNote;
	    }
	    public void setSmithNote(String smithNote) {
	        this.smithNote = smithNote;
	    }
	    
	    
	    public String getClientNote() {
	        return clientNote;
	    }
	    public void setClientNote(String clientNote) {
	        this.clientNote = clientNote;
	    }
	    
	    
	    public int getRequestID() {
	        return requestID;
	    }
	    public void setRequestID(int requestID) {
	        this.requestID = requestID;
	    }
	  
	  
	    public int getTreeCount() {
	        return treeCount;
	    }
	    public void setTreeCount(int treeCount) {
	        this.treeCount = treeCount;
	    }
	   
	}