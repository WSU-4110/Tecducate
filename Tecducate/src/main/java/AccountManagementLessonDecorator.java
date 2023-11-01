
public class AccountManagementLessonDecorator extends LessonDecorator {
    public AccountManagementLessonDecorator(Lesson lesson) {
        super(lesson);
    }

    @Override
    public void display() {
        super.display(); // This displays the wrapped lesson
        System.out.println("Additional content and links related to Phishing Email Lesson");
    }
}
