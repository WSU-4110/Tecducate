
public class PhishingLinkLessonDecorator extends LessonDecorator {
    public PhishingLinkLessonDecorator(Lesson lesson) {
        super(lesson);
    }

    @Override
    public void display() {
        super.display(); // This displays the wrapped lesson
        System.out.println("Additional content and links related to Phishing Email Lesson");
    }
}