import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;

class BasicLessonTest {
	
	static BasicLesson lesson;


	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		lesson = new BasicLesson(100, "Phshing Email", "The fake invoice scam");
		System.out.println("Testing of BasicLesson Begins");
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Testing Ends");
	}
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void setlessonID() {
		System.out.println("SetLesson Test");
		BasicLesson lesson = new BasicLesson(200, "lessonA", "Dafault");
		lesson.setlessonID(150);
		assertEquals(150, lesson.getLessonID());
	}
	@Test
	void getLessonID() {
		System.out.println("getLesson Test");
		assertEquals(100, lesson.getLessonID());
	}
	@Test
	void setDetails() {
		System.out.println("setDetails test");
		BasicLesson lesson = new BasicLesson(200, "lessonA", "");
		lesson.setDetails("Details for Lesson A");
		String Actual = lesson.getDetails();
		String Expected = "Details for Lesson A";
		
		assertEquals(Expected,Actual);
	}
	@Test
	void getDetails() {
		System.out.println("GetDetails test");
		BasicLesson lesson = new BasicLesson(111,"AccountManagement", "");
		lesson.setDetails("Making String Password");
		String Actual = lesson.getDetails();
		String Expected = "Making String Password";
		assertEquals(Expected,Actual);
		
	}
	@Test
	void setSamples() {
		System.out.println("setSamples");
		lesson.setSamples("Sample for Phshing Email");
		String Actual = lesson.getSamples();
		String Expected = "Sample for Phshing Email";
		assertEquals(Expected, Actual);
	}
	@Test
	void getSamples() {
		System.out.println("getSamples Test");
		lesson.setSamples("Sample for Phshing Email");
		String Expected = "Sample for Phshing Email";
		assertEquals(Expected, lesson.getSamples());
	}
	@Test
	void setLessonLink() {
		System.out.println("Setting lesson link");
		System.out.println("SetLessonTest");
		lesson.setLessonLink("PshishingEmail.jsp");
		assertEquals("PshishingEmail.jsp", lesson.getLessonlink());
	}
	@Test
	void getLessonlink() {
		System.out.println("Getting lesson Link");
		BasicLesson PhishingLink= new BasicLesson(101, "PhishingLink", "No sample");
		PhishingLink.setLessonLink("Pshishinglink.jsp");
		assertEquals("Pshishinglink.jsp", PhishingLink.getLessonlink());
	}
	
}