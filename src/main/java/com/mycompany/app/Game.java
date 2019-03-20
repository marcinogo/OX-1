package com.mycompany.app;

import com.mycompany.app.net.Net;
import com.mycompany.app.component.User;
import com.mycompany.app.generators.Settings;
import com.mycompany.app.output.Output;

import java.util.List;

/**
 * @author Wiktor Rup
 */
class Game {

    private Settings settings;

    Game(Settings settings) {
        this.settings = settings;
    }

    void startGame(){
        Net net = settings.createNet();
        List<User> users = settings.generateUsers();
        Output output = new Output();
        output.printNet(net);
    }

    void startRound(List<User> users, Net net) {
        for(User user : users){

        }
    }




}
