package com.mycompany.app.generators;


import com.mycompany.app.component.UserGenerator;
import com.mycompany.app.component.UserSettings;
import com.mycompany.app.net.Net;
import com.mycompany.app.component.User;
import com.mycompany.app.net.NetGenerator;
import com.mycompany.app.net.NetSettings;

import java.util.List;

/**
 * @author Wiktor Rup
 */
public class Settings {


    private UserSettings userSettings;
    private NetSettings netSettings;

    public void chooseStartPlayer(int whoStarts) {
        userSettings = new UserSettings(whoStarts);
    }


    public List<User> generateUsers() {
        UserGenerator userGenerator = new UserGenerator(userSettings);
        return userGenerator.generateUsers();
    }

    public void setNetSize(int row, int column) {
        netSettings = new NetSettings(row, column);
    }

    public Net createNet() {
        NetGenerator netGenerator = new NetGenerator(netSettings);
        return netGenerator.createNet();
    }
}
