package sender;

import User.User;

public class MessageSender {

    public void send(String text, User user, String country){
        if (user.getCountry().equals(country) & user.getLastActive() != null) {
            System.out.println(text);
            System.out.println("Message is sent!");
        }

        else {
            System.out.println("This message is not sent");
        }
    }
}
