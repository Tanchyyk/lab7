package User;

import facebook.FacebookUser;

import javax.xml.crypto.Data;

public class MyFacebookUser implements User{
    private FacebookUser user;

    public MyFacebookUser(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Data getLastActive() {
        return (Data) user.getUserActiveTime();
    }
}
