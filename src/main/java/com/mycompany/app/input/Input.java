package com.mycompany.app.input;

/**
 * @author Wiktor Rup
 */
public class Input {

    private InputValidator inputValidator = new InputValidator();

    public boolean checkIfNetHeightIsProper(String netHeight) {
        return inputValidator.checkIfNetHeightIsProper(netHeight);
    }

    public boolean checkIfNetWidthIsProper(String netWidth) {
        return inputValidator.checkIfNetWidthIsProper(netWidth);
    }

    public boolean checkIfValueChoosePlayer(String player) {
        return inputValidator.checkIfValueChoosePlayer(player);
    }

    public boolean checkIfWinStreakIsProper(String winStreak) {
        return inputValidator.checkIfWinStreakIsProper(winStreak);

    }

}
