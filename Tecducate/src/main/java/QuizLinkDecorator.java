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
}
