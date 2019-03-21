package com.mycompany.app;

import java.util.List;

/**
 * @author Wiktor Rup
 */
public class UserProvider {

    List<User> users;


    User startingUser(List<User> users) {
        User startUser = new User(Sign.X, true);
        for (User user : users) {
            if (user.isFirst()) {
                startUser = user;
                users.set(users.indexOf(user), user.changePriority());
            }
            else
                users.set(users.indexOf(user), user.changePriority());
        }
        return startUser;
    }


}
