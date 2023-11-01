package com.Tecducate.decorators;

import lessons.Lesson;

public class QuizLinkDecorator implements Lesson {
    private Lesson lesson;

    public QuizLinkDecorator(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public void displayContent() {
        lesson.displayContent();
        // this will display link to quiz
        String quizLink = "<a href='quizView.jsp'>Take Quiz</a>"
        System.out.println(quizLink);
    }
}
