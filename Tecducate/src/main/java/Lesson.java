import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Lesson interface
public interface Lesson {

	void displayContent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

	void displayContent();

}