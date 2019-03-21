package com.wrup.oxapp;

/**
 * @author Wiktor Rup
 */
class InputValidator {

    private int netHeight;
    private int netWidth;

    boolean checkIfNetWidthIsProper(String netWidth) {
        checkIfSomeoneWantsToQuit(netWidth);
        this.netWidth = new StringConverter(netWidth).parseToInt();
        return this.netWidth >= 3 && this.netWidth <= 100;
    }

    private void checkIfSomeoneWantsToQuit(String text) {
        if(text.equals("q")) {
            System.exit(0);
        }
    }

    boolean checkIfNetHeightIsProper(String netHeight) {
        checkIfSomeoneWantsToQuit(netHeight);
        this.netHeight = new StringConverter(netHeight).parseToInt();
        return this.netHeight >= 3 && this.netHeight <= 100;
    }

    boolean checkIfValueChoosePlayer(String playerInput) {
        checkIfSomeoneWantsToQuit(playerInput);
        int player = new StringConverter(playerInput).parseToInt();
        return player == 1 || player == 2;
    }

    boolean checkIfWinStreakIsProper(String winStreakInput) {
        checkIfSomeoneWantsToQuit(winStreakInput);
        int minValue = ((netHeight > netWidth)) ? netWidth : netHeight;
        int winStreak = new StringConverter(winStreakInput).parseToInt();
        return winStreak >= 3 && winStreak <= minValue;

    }

    boolean checkIfUserMoveIsProper(String coordinates, Sign sign, Net net) {
        checkIfSomeoneWantsToQuit(coordinates);
        String[] coords = new StringConverter(coordinates).splitString(",");
        int row;
        int column;
        if(coords.length != 2) {
            return false;
        } else {
            row = new StringConverter(coords[0]).parseToInt();
            column = new StringConverter(coords[1]).parseToInt();
            MoveMaker moveMaker = new MoveMaker(sign, row, column, net);
            return moveMaker.putSign();
        }
    }

    boolean checkIfChosenLanguageIsProper(String language) {
        checkIfSomeoneWantsToQuit(language);
        int lang = new StringConverter(language).parseToInt();
        return lang == 1 || lang == 2;
    }
}
