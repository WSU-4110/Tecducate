public class ImageDecorator implements Lesson {
    private Lesson lesson;

    public ImageDecorator(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public void displayContent() {
        lesson.displayContent();
        // Add code to display an image for the lesson
    }
}