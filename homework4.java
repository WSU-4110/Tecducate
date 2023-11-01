// Using factory method
public class User {
    private String userID;
    private String email;
    private String preferredLesson;
    private String quizLog;

    // Constructor
    public User(String userID, String email, String preferredLesson, String quizLog) {
        this.userID = userID;
        this.email = email;
        this.preferredLesson = preferredLesson;
        this.quizLog = quizLog;
    }

    // Getters
    public String getUserID() {
        return userID;
    }

    public String getPreferredLesson() {
        return preferredLesson;
    }

    public String getEmail() {
        return email;
    }

    public String getQuizLog() {
        return quizLog;
    }
}

// UserProfileFactory.java - Factory Interface
interface UserProfileFactory {
    User createUserProfile(String userID, String email, String preferredLesson, String quizLog);
}

// RegularUserProfileFactory.java - Factory Implementation for Regular User Profiles
class RegularUserProfileFactory implements UserProfileFactory {
    @Override
    public User createUserProfile(String userID, String email, String preferredLesson, String quizLog) {
        // Create a regular user profile
        return new User(userID, email, preferredLesson, quizLog);
    }
}

// AdminUserProfileFactory.java - Factory Implementation for Admin User Profiles
class AdminUserProfileFactory implements UserProfileFactory {
    @Override
    public User createUserProfile(String userID, String email, String preferredLesson, String quizLog) {
        // Create an admin user profile
        return new AdminUser(userID, email, preferredLesson, quizLog);
    }
}

// AdminUser.java - Model for Admin User Profiles
class AdminUser extends User {
    public AdminUser(String userID, String email, String preferredLesson, String quizLog) {
        super(userID, email, preferredLesson, quizLog);
    }
}

// Usage
class UserProfileController {
    public static void main(String[] args) {
        UserProfileFactory factory = new RegularUserProfileFactory(); // or AdminUserProfileFactory
        User user = factory.createUserProfile("123", "user@example.com", "Lesson 1", "Quiz Log");

        // Access user profile information
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Preferred Lesson: " + user.getPreferredLesson());
        System.out.println("Quiz Log: " + user.getQuizLog());

        // To access an admin profile, switch the factory to AdminUserProfileFactory
        factory = new AdminUserProfileFactory();
        User adminUser = factory.createUserProfile("456", "admin@example.com", "Admin Lesson", "Admin Quiz Log");

        // Access admin user profile information
        System.out.println("\nAdmin User ID: " + adminUser.getUserID());
        System.out.println("Admin Email: " + adminUser.getEmail());
    }
}
