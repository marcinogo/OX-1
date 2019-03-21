package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
public class OXApp {


    //TODO:: WRup - testowy main, jedynie na potrzeby wyswietlania probnej siatki gry. Pozniej przeniesc do glownej petli gry.
    public static void main(String[] args) {
        Settings settings = new Settings();
        initializeGame(settings);
        new Game(settings).startGame();
    }

    private static void initializeGame(Settings settings) {
        Output output = new Output();
        Input input = new Input();
        String whoStarts = output.chooseWhoStarts();
        while (!input.checkIfValueChoosePlayer(whoStarts)) {
            output.wrongInput();
            whoStarts = output.chooseWhoStarts();
        }
        String heightOfNet = output.setHeightOfNet();
        while (!input.checkIfNetHeightIsProper(heightOfNet)) {
            output.wrongInput();
            heightOfNet = output.setHeightOfNet();
        }
        String widthOfNet = output.setWidthOfNet();
        while (!input.checkIfNetWidthIsProper(widthOfNet)) {
            output.wrongInput();
            widthOfNet = output.setWidthOfNet();
        }
        String winStreak = output.setWinStreak();
        while (!input.checkIfWinStreakIsProper(winStreak)) {
            output.wrongInput();
            winStreak = output.setWinStreak();
        }
        settings.setStartPlayer(new StringParser(whoStarts).parseToInt());
        settings.setNetSize(new StringParser(heightOfNet).parseToInt(),new StringParser(widthOfNet).parseToInt());
        settings.setWinStreak(new StringParser(winStreak).parseToInt());
    }

}
