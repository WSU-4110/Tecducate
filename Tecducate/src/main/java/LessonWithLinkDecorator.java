
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class LessonWithLinkDecorator implements LessonDecorator {
    private Lesson lesson;

    public LessonWithLinkDecorator(Lesson lesson) {
        this.lesson = lesson;
    }


    @Override
    public void decorate() {
        // Additional decoration logic if needed
    }
    
}