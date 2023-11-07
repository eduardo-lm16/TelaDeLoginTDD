import static org.junit.jupiter.api.Assertions.*;

import org.example.LoginScreen;
import org.junit.jupiter.api.Test;

public class LoginScreenTest {
    @Test
    public void testSuccessfulLogin() {
    LoginScreen LoginScreen = new LoginScreen();
    assertTrue(LoginScreen.login("john", "password123"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen LoginScreen = new LoginScreen();
        assertFalse(LoginScreen.login("john", "wrongPassword"));
    }

    @Test
    public void testAddUser() {
        LoginScreen LoginScreen = new LoginScreen();
        LoginScreen.addUser("testuser", "testpassword");
        assertTrue(LoginScreen.login("testuser", "testpassword"));
    }
}
