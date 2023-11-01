package com.Tecducate.decorators;

import lessons.Lesson;

public class ImageDecorator implements Lesson {
    private Lesson lesson;

    public ImageDecorator(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public void displayContent() {
        lesson.displayContent();
        // this would display an image  
        displayImage("path/to/your/image.jpg", "Image Description", 400, 250);

    }

	private void displayImage(String string, String string2, int i, int j) {
        System.out.println("<img src='" + src + "' alt='" + alt + "' width='" + width + "' height='" + height + "' />");
		
	}
}