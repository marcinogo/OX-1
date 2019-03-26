package com.wrup.oxapp;

import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class OXApp {

    public static void main(String[] args) {
        GameInitializer gameInitializer = new GameInitializer(new Scanner(System.in));
        Settings settings =  gameInitializer.initializeGame(new Settings());
        new Game(settings).startGame(gameInitializer.getScanner());
    }
}
