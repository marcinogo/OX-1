package com.mycompany.app.component;

import java.util.List;

/**
 * @author Wiktor Rup
 */
public class GameUserAPI {

    private UserSettings userSettings;
    private List<User> users;

    public void chooseStartPlayer(int whoStarts) {
        userSettings = new UserSettings(whoStarts);
    }


    public void generateUsers() {
        UserGenerator userGenerator = new UserGenerator(userSettings);
        users = userGenerator.generateUsers();
    }

    public User getFirstUser(){
        for(User user: users){
            if(user.isFirst())
                return user;
        }
        return null;
    }



}
