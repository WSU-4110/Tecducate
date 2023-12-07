import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

class userTest_2 {
	
	static user testUser;
	
	@BeforeEach
	void setUp() throws Exception {
        testUser = new user( "user@example.com","Dave", "Jones", "123", "323", 100);
	}

    @Test
    void testGetPass() {
    	String pass = testUser.getPassword();
        assertEquals("123", pass );
    }

    @Test
    void testGetPreferredLesson() {
    	int lesson = testUser.getPrefLesson();
        assertEquals(100, lesson);
    }

    @Test
    void testGetEmail() {
    	String email = testUser.getEmail();
        assertEquals("user@example.com", email);
    }

    @Test
    void testGetFirstName() {
    	
    	String firstName = testUser.getFirstName();
        assertEquals("Dave", firstName);
    }
    
    @Test
    void testGetLastName() {
    	
    	String lastName = testUser.getLastName();
        assertEquals("Jones", lastName);
    }
    
    
    @Test
    void testGetPhoneNum() {
    	
    	String phone = testUser.getPhoneNum();
        assertEquals("323", phone);
    }

    
}
