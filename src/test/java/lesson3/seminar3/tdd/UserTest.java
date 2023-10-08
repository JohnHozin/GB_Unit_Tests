package lesson3.seminar3.tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class UserTest {

    @Test
    void testUserAccess() {
        User user = new User("User", "Password", false);
        assertTrue(user.authenticate("User", "Password"));
    }

    @Test
    void testUserDenied() {
        User user = new User("User1", "Password1", false);
        assertFalse(user.authenticate("User", "Password"));
    }
}