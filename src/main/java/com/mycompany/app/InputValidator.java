package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class InputValidator {

    private int netHeight;
    private int netWidth;

    boolean checkIfNetWidthIsProper(String netWidth) {
        this.netWidth = new StringParser(netWidth).parseToInt();
        return this.netWidth >= 3 && this.netWidth <= 100;
    }

    boolean checkIfNetHeightIsProper(String netHeight) {
        this.netHeight = new StringParser(netHeight).parseToInt();
        return this.netHeight >= 3 && this.netHeight <= 100;
    }

    boolean checkIfValueChoosePlayer(String playerInput) {

        int player = new StringParser(playerInput).parseToInt();
        return player == 1 || player == 2;
    }

    boolean checkIfWinStreakIsProper(String winStreakInput) {
        int minValue = ((netHeight > netWidth)) ? netWidth : netHeight;
        int winStreak = new StringParser(winStreakInput).parseToInt();
        return winStreak >= 3 && winStreak <= minValue;

    }

    boolean checkIfUserMoveIsProper(String coordinates, Sign sign, Net net) {
        String[] coords = new StringParser(coordinates).splitString(",");
        int row;
        int column;
        if(coords.length != 2) {
            return false;
        } else {
            row = new StringParser(coords[0]).parseToInt();
            column = new StringParser(coords[1]).parseToInt();
            MoveMaker moveMaker = new MoveMaker(sign, row, column, net);
            return moveMaker.putSign();
        }
    }
}
