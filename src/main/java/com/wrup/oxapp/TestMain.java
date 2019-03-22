package com.wrup.oxapp;

import java.util.List;
import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class TestMain {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("1\n1\n10\n10\n4\n");

        WinningConditionsGenerator generator = new WinningConditionsGenerator();
        List<String> winnninnCondition = generator.winningColumns(10,10,4);
        for (String str : winnninnCondition) {
            builder.append(str);
        }
        GameInitializer gameInitializer = new GameInitializer(new Scanner(builder.toString()));
        Settings settings =  gameInitializer.initializeGame(new Settings());
        new Game(settings).startGame(gameInitializer.getScanner());
    }
}
