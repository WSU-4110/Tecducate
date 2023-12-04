import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Lesson interface
public interface Lesson {
	default void displayContent() {
		
	}
	
    default void displayContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	
    }
}