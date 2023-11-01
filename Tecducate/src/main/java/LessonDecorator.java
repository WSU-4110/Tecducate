
	public abstract class LessonDecorator implements Lesson {
	    protected Lesson lesson;

	    public LessonDecorator(Lesson lesson) {
	        this.lesson = lesson;
	    }

	    public void display() {
	        lesson.display();
	    }
}