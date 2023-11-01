package com.Tecducate.decorators; 

import lessons.Lesson;

public class LessonDecorator implements Lesson {
    protected Lesson lesson; 

    public LessonDecorator(Lesson lesson) {
        this.lesson = lesson; 
    }

    @Override
    public void displayContent() {
        lesson.displayContent();
    }
}

