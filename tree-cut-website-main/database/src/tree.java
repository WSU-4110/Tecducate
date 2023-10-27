import java.math.*;

public class tree 
{
		protected String image1;
	 	protected String image2;
	    protected String image3;
	    protected String address;
	    protected double distance;
	    protected double width;
	    protected double height;
	    protected int treeID;
	    protected int requestID;
	 
	    //constructors
	    public tree() {
	    }
	    
	    public tree(String image1, String image2, String image3, String address, double distance, double width, double height) 
	    {
	    	setImage1(image1);
	    	setImage2(image2);
	    	setImage3(image3);
	    	setAddress(address);
	    	setDistance(distance);
	    	setWidth(width);
	    	setHeight(height);
	    	setTreeID( (int) (Math.random() * 100 + 1) );
	    	setRequestID( (int) (Math.random() * 100 + 1) );
	    }
	 
	    
	    public tree(String image1, String image2, String image3, String address, double distance, double width, double height, int treeID, int requestID) 
	    {
	    	setImage1(image1);
	    	setImage2(image2);
	    	setImage3(image3);
	    	setAddress(address);
	    	setDistance(distance);
	    	setWidth(width);
	    	setHeight(height);
	    	setTreeID(treeID);
	    	setRequestID(requestID);
	    }
	 
	    
	   //getter and setter methods
	    public String getImage1() {
	        return image1;
	    }
	    public void setImage1(String image1) {
	        this.image1 = image1;
	    }
	    
	    
	    public String getImage2() {
	        return image2;
	    }
	    public void setImage2(String image2) {
	        this.image2 = image2;
	    }
	    
	    
	    public String getImage3() {
	        return image3;
	    }
	    public void setImage3(String image3) {
	        this.image3 = image3;
	    }
	    
	    
	    public String getAddress() {
	        return address;
	    }
	    public void setAddress(String address) {
	        this.address = address;
	    }
	    
	    
	    public double getDistance() {
	        return distance;
	    }
	    public void setDistance(double distance) {
	        this.distance = distance;
	    }
	    
	    
	    public double getWidth() {
	        return width;
	    }
	    public void setWidth(double width) {
	        this.width = width;
	    }
	    
	    
	    public double getHeight() {
	        return height;
	    }
	    public void setHeight(double height) {
	        this.height = height;
	    }
	    
	    
	    public int getTreeID() {
	        return treeID;
	    }
	    public void setTreeID(int treeID) {
	        this.treeID = treeID;
	    }
	  
	    
	    public int getRequestID() {
	        return requestID;
	    }
	    public void setRequestID(int requestID) {
	        this.requestID = requestID;
	    }
	   
	}