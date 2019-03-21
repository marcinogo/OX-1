package com.wrup.oxapp;

import java.util.List;

/**
 * @author Wiktor Rup
 */
class Game {

    private Judge judge;
    private Auditor auditor;
    private Net net;
    private List<User> users;
    private Settings settings;
    private boolean winner = false;
    private int moveCounter;
    private int numberOfGames = 1;

    Game(Settings settings) {
        this.settings = settings;
        net = settings.createNet();
        users = settings.generateUsers();
        judge = new Judge(settings.getWinStreak());
        auditor = new Auditor(users);

    }

    void startGame() {
        moveCounter = net.getNetSize();
        UserProvider userProvider = new UserProvider();
        Output output = new Output();
        Input input = new Input();

        while (numberOfGames <= 3) {
            output.printGameName(numberOfGames, settings.getBundleProvider());
            while (!winner && moveCounter != 0) {
                User user = userProvider.startingUser(users);
                startRound(net, user, output, input, judge, auditor);
            }
            if(winner) {
                output.printWinnerAnnouncement(auditor.winning(), settings.getBundleProvider());
                resetGame();
            } else {
                auditor.addDrawScore();
                output.printDrawAnnouncement(auditor.results(), settings.getBundleProvider());
                resetGame();
            }
            numberOfGames++;
        }

        output.printFinalResults(auditor.results(), settings.getBundleProvider());

    }

    private void startRound(Net net, User user, Output output, Input input, Judge judge, Auditor auditor) {

        output.printNet(net);
        String move = output.userMove(settings.getBundleProvider(), user);
        while (!input.checkIfUserMoveIsProper(move, user.getSign(), net)) {
            output.wrongInput(settings.getBundleProvider());
            move = output.userMove(settings.getBundleProvider(), user);
        }
        moveCounter--;

        if(judge.checkWinner(move, net)) {
            winner = true;
            output.printNet(net);
            auditor.addWinScore(user);
        }

    }

    private void resetGame() {
        winner = false;
        moveCounter = net.getNetSize();
        net = settings.createNet();
    }


}
