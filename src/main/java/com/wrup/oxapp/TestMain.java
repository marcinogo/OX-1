package com.wrup.oxapp;

import java.util.List;
import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class TestMain {
    public static void main(String[] args) {


        int rows = 5;
        int columns = 6;
        int winStreak = 3;
        StringBuilder builder = new StringBuilder();
        builder.append("1\n1\n").append(rows).append("\n").append(columns).append("\n").append(winStreak).append("\n");

        WinningConditionsGenerator generator = new WinningConditionsGenerator();

        generator.fillMaps(rows,columns);
        List<String> winnninnCondition = generator.winningColumns(rows,columns,winStreak);
        for (String str : winnninnCondition) {
            builder.append(str);
        }
        GameInitializer gameInitializer = new GameInitializer(new Scanner(builder.toString()));
        Settings settings =  gameInitializer.initializeGame(new Settings());
        new Game(settings).startGame(gameInitializer.getScanner());
    }
}
