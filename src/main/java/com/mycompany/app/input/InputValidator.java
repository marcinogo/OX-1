package com.mycompany.app.input;

/**
 * @author Wiktor Rup
 */
class InputValidator {

    private int netHeight;
    private int netWidth;

    boolean checkIfNetWidthIsProper(String netWidth) {
        try {
            this.netWidth = Integer.parseInt(netWidth);
        } catch (NumberFormatException e) {
            return false;
        }
        return this.netWidth >= 3 && this.netWidth <= 100;
    }

    boolean checkIfNetHeightIsProper(String netHeight) {
        try {
            this.netHeight = Integer.parseInt(netHeight);
        } catch (NumberFormatException e) {
            return false;
        }
        return this.netHeight >= 3 && this.netHeight <= 100;
    }

    boolean checkIfValueChoosePlayer(String playerInput) {
        int player;
        try {
            player = Integer.parseInt(playerInput);
        } catch (NumberFormatException e) {
            return false;
        }
        return player == 1 || player == 2;
    }

    boolean checkIfWinStreakIsProper(String winStreakInput) {
        int winStreak;
        int minValue = ((netHeight > netWidth)) ? netWidth : netHeight;
        try {
            winStreak = Integer.parseInt(winStreakInput);
        } catch (NumberFormatException e) {
            return false;
        }
        return winStreak >= 3 && winStreak <= minValue;

    }
}
