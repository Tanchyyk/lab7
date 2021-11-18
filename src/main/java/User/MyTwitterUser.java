package User;

import twitter.TwitterUser;

import javax.xml.crypto.Data;

public class MyTwitterUser implements User{
    public TwitterUser user;

    public MyTwitterUser(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Data getLastActive() {
        return (Data) user.getLastActiveTime();
    }
}
