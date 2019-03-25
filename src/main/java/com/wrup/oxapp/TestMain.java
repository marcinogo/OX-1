package com.wrup.oxapp;

import java.util.List;
import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class TestMain {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("1\n1\n10\n3\n3\n");

        WinningConditionsGenerator generator = new WinningConditionsGenerator();

        //generator.winningRightDiagonal(5,10,3);
        List<String> winnninnCondition = generator.winningConditionDiagonalSmallTraingles(10,3,3);
        for (String str : winnninnCondition) {
            builder.append(str);
        }
        GameInitializer gameInitializer = new GameInitializer(new Scanner(builder.toString()));
        Settings settings =  gameInitializer.initializeGame(new Settings());
        new Game(settings).startGame(gameInitializer.getScanner());
    }
}
