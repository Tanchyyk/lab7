package User;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {
    public TwitterUser user = new TwitterUser("email@gmail.com", "USA", new Date());

    @BeforeEach
    void setUp() {
    }

    @Test
    void getCountry() {
        assertEquals("USA", user.getCountry());
    }

    @Test
    void getEmail() {
        assertEquals(user.getUserMail(), "email@gmail.com");
    }

    @Test
    void getLastActive() {
        assertEquals(user.getLastActiveTime() != null, true);
    }
}