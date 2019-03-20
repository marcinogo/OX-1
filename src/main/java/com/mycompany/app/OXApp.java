package com.mycompany.app;

import com.mycompany.app.component.GameUserAPI;
import com.mycompany.app.generators.Settings;
import com.mycompany.app.input.Input;
import com.mycompany.app.net.GameNetAPI;
import com.mycompany.app.output.Output;

/**
 * @author Wiktor Rup
 */
public class OXApp {


    //TODO:: WRup - testowy main, jedynie na potrzeby wyswietlania probnej siatki gry. Pozniej przeniesc do glownej petli gry.
    public static void main(String[] args) {

        GameNetAPI gameNetAPI = new GameNetAPI();
        GameUserAPI gameUserAPI = new GameUserAPI();

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
        settings.chooseStartPlayer(Integer.parseInt(whoStarts));
        settings.setNetSize(Integer.parseInt(heightOfNet), Integer.parseInt(widthOfNet));
    }

}
