package lesson3.seminar3.tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    UserRepository userRepository;

    @BeforeEach
    void testInit() {
        userRepository = new UserRepository();
    }

    @Test
    void testAddUserTrue() {
        User user = new User("User", "Password", false);
        user.authenticate("User", "Password");
        userRepository.addUser(user);
        assertTrue(userRepository.data.contains(user));
    }

    @Test
    void testAddUserFalse() {
        User user = new User("User", "Password", false);
        user.authenticate("User1", "Password1");
        userRepository.addUser(user);
        assertFalse(userRepository.data.contains(user));
    }

    @Test
    void testLogoutAllUsersExceptAdminsTrue() {
        User user = new User("User", "Password", false);
        user.authenticate("User", "Password");
        User user1 = new User("User1", "Password", false);
        user1.authenticate("User1", "Password");
        User admin = new User("Admin", "Password1", true);
        admin.authenticate("Admin", "Password1");

        userRepository.addUser(user);
        userRepository.addUser(user1);
        userRepository.addUser(admin);
        userRepository.logoutAllUsersExceptAdmins();

        assertTrue(admin.isAuthenticate);
        assertFalse(user.isAuthenticate);
        assertFalse(user1.isAuthenticate);
    }
}
