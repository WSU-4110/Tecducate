import java.math.*;

public class bill 
{
		protected String smithNote;
		protected String clientNote;
		protected int billID;
		protected int quoteID;
	 
	    //constructors
	    public bill() {
	    }
	    
	    
	    public bill(String smithNote, String clientNote) 
	    {
	    	setSmithNote(smithNote);
	    	setClientNote(clientNote);
	    	setBillID( (int) (Math.random() * 100 + 1) );
	    	setQuoteID( (int) (Math.random() * 100 + 1) );
	    }
	 
	    
	    public bill(String smithNote, String clientNote, int billID, int quoteID) 
	    {
	    	setSmithNote(smithNote);
	    	setClientNote(clientNote);
	    	setBillID(billID);
	    	setQuoteID(quoteID);
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
	    
	    
	    public int getBillID() {
	        return billID;
	    }
	    public void setBillID(int billID) {
	        this.billID = billID;
	    }
	    
	    public int getQuoteID() {
	        return quoteID;
	    }
	    public void setQuoteID(int billID) {
	        this.quoteID = quoteID;
	    }
	  
	   
	}