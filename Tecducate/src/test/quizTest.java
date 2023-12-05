import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class quizTest {
	
	static quiz quiz;
	static quizDifficulty quizDifficulty;
	static quizDifficulty beginner = new beginnerDifficulty();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		quiz = new quiz(1, "Test Directions", "Test Question", "a1", "a2", "a3", "a4", 101, beginner);
		quizDifficulty = null;
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Disabled
	void testQuiz() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testQuizIntStringStringStringStringStringStringIntQuizDifficulty() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Strategy Pattern Object Creation Test")
	void testSetDifficulty() {
		quizDifficulty = new beginnerDifficulty();
		quiz.setDifficulty(quizDifficulty);
		assertNotNull(quiz.getDifficulty());
		quizDifficulty = new advancedDifficulty();
		quiz.setDifficulty(quizDifficulty);
		assertNotNull(quiz.getDifficulty());
		quizDifficulty = new intermediateDifficulty();
		quiz.setDifficulty(quizDifficulty);
		assertNotNull(quiz.getDifficulty());
	}

	@Test
	@Disabled
	void testGetDifficulty() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetDirections() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Setting Direcitons")
	void testSetDirections() {
		//Basic Text Size
		quiz.setDirections("This is a test direction");
		assertEquals("This is a test direction", quiz.getDirections());
		
		//Maximum Character Limit
		quiz.setDirections("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		assertEquals("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore", quiz.getDirections());
		
		
		//Beyond Character Limit
		quiz.setDirections("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		assertEquals("Sample Directions", quiz.getDirections());
		
		//Empty String
		quiz.setDirections("");
		assertEquals("Sample Directions", quiz.getDirections());
	}

	@Test
	@Disabled
	void testGetQuestion() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Setting Questions")
	void testSetQuestion() {
		quiz.setQuestion("This is a test question");
		assertEquals("This is a test question", quiz.getQuestion());
		
		//Maximum Character Limit
		quiz.setQuestion("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		assertEquals("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore", quiz.getQuestion());
		
		
		//Beyond Character Limit
		quiz.setQuestion("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		assertEquals("Sample Question", quiz.getQuestion());
		
		//Empty String
		quiz.setQuestion("");
		assertEquals("Sample Question", quiz.getQuestion());
	}

	@Test
	@Disabled
	void testGetAnsr1() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Setting Answer 1 Text")
	void testSetAnsr1() {
		quiz.setAnsr1("This is a test answer");
		assertEquals("This is a test answer", quiz.getAnsr1());
		
		//Maximum Character Limit
		quiz.setAnsr1("Lorem ipsum dolor sit amet, consectetuer adipiscin");
		assertEquals("Lorem ipsum dolor sit amet, consectetuer adipiscin", quiz.getAnsr1());
		
		
		//Beyond Character Limit
		quiz.setAnsr1("Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore");
		assertEquals("Sample Answer", quiz.getAnsr1());
		
		//Empty String
		quiz.setAnsr1("");
		assertEquals("Sample Answer", quiz.getAnsr1());
	}

	@Test
	@Disabled
	void testGetAnsr2() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSetAnsr2() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAnsr3() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSetAnsr3() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAnsr4() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSetAnsr4() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetQuizID() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Setting Quiz ID")
	void testSetQuizID() {
		int quizID = 134;
		quiz.setQuizID(quizID);
		assertEquals(134, quiz.getQuizID());
		
		quizID = 0;
		quiz.setQuizID(quizID);
		assertEquals(0, quiz.getQuizID());
		
		quizID = -24;
		quiz.setQuizID(quizID);
		assertEquals(0, quiz.getQuizID());
	}

	@Test
	@Disabled
	void testGetLessonID() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Setting Lesson ID")
	void testSetLessonID() {
		int lessonID = 134;
		quiz.setLessonID(lessonID);
		assertEquals(134, quiz.getLessonID());
		
		lessonID = 0;
		quiz.setLessonID(lessonID);
		assertEquals(0, quiz.getLessonID());
		
		lessonID = -24;
		quiz.setLessonID(lessonID);
		assertEquals(0, quiz.getLessonID());
	}

	@Test
	@Disabled
	void testGetLVL() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSetLVL() {
		fail("Not yet implemented");
	}

}
