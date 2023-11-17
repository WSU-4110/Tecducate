import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    @Test
    void testGetUserID() {
        User user = new User("123", "user@example.com", "Lesson 1", "Quiz Log");
        assertEquals("123", user.getUserID());
    }

    @Test
    void testGetPreferredLesson() {
        User user = new User("123", "user@example.com", "Lesson 1", "Quiz Log");
        assertEquals("Lesson 1", user.getPreferredLesson());
    }

    @Test
    void testGetEmail() {
        User user = new User("123", "user@example.com", "Lesson 1", "Quiz Log");
        assertEquals("user@example.com", user.getEmail());
    }

    @Test
    void testGetQuizLog() {
        User user = new User("123", "user@example.com", "Lesson 1", "Quiz Log");
        assertEquals("Quiz Log", user.getQuizLog());
    }

    @Test
    void testUserConstructor() {
        User user = new User("123", "user@example.com", "Lesson 1", "Quiz Log");
        assertEquals("123", user.getUserID());
        assertEquals("user@example.com", user.getEmail());
        assertEquals("Lesson 1", user.getPreferredLesson());
        assertEquals("Quiz Log", user.getQuizLog());
    }

    @Test
    void testRegularUserProfileFactory() {
        UserProfileFactory factory = new RegularUserProfileFactory();
        User user = factory.createUserProfile("123", "user@example.com", "Lesson 1", "Quiz Log");

        assertEquals("123", user.getUserID());
        assertEquals("user@example.com", user.getEmail());
        assertEquals("Lesson 1", user.getPreferredLesson());
        assertEquals("Quiz Log", user.getQuizLog());
        assertTrue(user instanceof User, "RegularUserProfileFactory should create instances of User");
    }

    @Test
    void testAdminUserProfileFactory() {
        UserProfileFactory factory = new AdminUserProfileFactory();
        User adminUser = factory.createUserProfile("456", "admin@example.com", "Admin Lesson", "Admin Quiz Log");

        assertEquals("456", adminUser.getUserID());
        assertEquals("admin@example.com", adminUser.getEmail());
        assertEquals("Admin Lesson", adminUser.getPreferredLesson());
        assertEquals("Admin Quiz Log", adminUser.getQuizLog());
        assertTrue(adminUser instanceof AdminUser, "AdminUserProfileFactory should create instances of AdminUser");
    }
}
