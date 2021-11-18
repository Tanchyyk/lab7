package User;

import facebook.FacebookUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    public FacebookUser user = new FacebookUser("lalala@gmail.com", "Ukraine", new Date());

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getCountry() {
        assertEquals(user.getUserCountry(), "Ukraine");
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals(user.getEmail(), "lalala@gmail.com");
    }

}