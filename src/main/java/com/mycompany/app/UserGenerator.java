package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wiktor Rup
 */
class UserGenerator {

    private UserSettings userSettings;

    UserGenerator(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    List<User> generateUsers(){
        ArrayList<User> users = new ArrayList<>();
        if(userSettings.isPlayer1Starts())
        {
            User user1 = new User(userSettings.getStartSign(),  true);
            users.add(user1);
            if(userSettings.getStartSign().equals(Sign.X))
            {
                User user2 = new User(Sign.O,false);
                users.add(user2);
            }

            else{
                User user2 = new User(Sign.X,false);
                users.add(user2);
            }
        }
        else {
            User user2 = new User(userSettings.getStartSign(), true);
            users.add(user2);
            if(userSettings.getStartSign().equals(Sign.X))
            {
                User user1 = new User(Sign.O, false);
                users.add(user1);
            }
            else{
                User user1 = new User(Sign.X, false);
                users.add(user1);
            }
        }
        return users;

    }
}
