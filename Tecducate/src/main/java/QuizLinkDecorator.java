import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuizLinkDecorator implements Lesson {
    private Lesson lesson;

    public QuizLinkDecorator(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public void displayContent() {
        lesson.displayContent();
        // Add code to display a link to a quiz
    }

	@Override
	public void displayContent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
