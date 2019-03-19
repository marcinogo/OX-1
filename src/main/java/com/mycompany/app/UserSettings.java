package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class UserSettings {

    private boolean player1Starts;
    private Sign startSign;

    UserSettings(boolean player1Starts, Sign startSign) {
        this.player1Starts = player1Starts;
        this.startSign = startSign;
    }

    boolean isPlayer1Starts() {
        return player1Starts;
    }

    Sign getStartSign() {
        return startSign;
    }
}
