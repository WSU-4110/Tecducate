/* Maria's unittest file*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class userTest {

	private user testUser;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
        testUser = new user();
	}

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void testSetEmail() {
		testUser.setEmail("newemail@test.com");
        assertEquals("newemail@test.com", testUser.getEmail());
		//fail("Not yet implemented");
	}


	@Test
	void testSetFirstName() {
		testUser.setFirstName("John");
        assertEquals("John", testUser.getFirstName());
		//fail("Not yet implemented");
	}

	@Test
	void testSetLastName() {
		testUser.setLastName("Smith");
        assertEquals("Smith", testUser.getLastName());
        //fail("Not yet implemented");
	}

	
	@Test
	void testsetPrefLesson() {
		testUser.setPrefLesson(5);
        assertEquals(5, testUser.getPrefLesson());
	}

	@Test 
	void testSetPassword() {
		testUser.setPassword("pass123");
        assertEquals("pass123", testUser.getPassword());
	}
	
	@Test
	void testGetPrefLesson() {
        assertEquals(0, testUser.getPrefLesson());
		//fail("Not yet implemented");
	}
	
	
}
