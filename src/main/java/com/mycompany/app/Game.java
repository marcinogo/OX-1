package com.mycompany.app;

import java.util.List;

/**
 * @author Wiktor Rup
 */
class Game {

    private Settings settings;
    private boolean winner = false;
    private int moveCounter;

    Game(Settings settings) {
        this.settings = settings;
    }

    void startGame() {
        Net net = settings.createNet();
        moveCounter = net.getNetSize();
        List<User> users = settings.generateUsers();

        while (!winner || moveCounter != 0) {
            startRound(net, users.get(0));
        }
    }

    private void startRound(Net net, User user) {
        Output output = new Output();
        Input input = new Input();
        Judge judge = new Judge(settings.getWinStreak());
        output.printNet(net);
        String move = output.userMove(user);
        while (!input.checkIfUserMoveIsProper(move, user.getSign(), net)) {
            output.wrongInput();
            move = output.userMove(user);
        }
        output.printNet(net);
        moveCounter--;

        if(judge.checkWinner(move, net)) {
            output.winner(user);
            winner = true;
        }

    }


}
