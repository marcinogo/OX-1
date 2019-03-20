package com.mycompany.app;

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
        NetPrinter netPrinter = new NetPrinter(net);
        netPrinter.printNet();
    }




}
