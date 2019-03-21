package com.mycompany.app;

import java.util.Scanner;

/**
 * @author Wiktor Rup
 */
public class OXApp {

    public static void main(String[] args) {
        Settings settings =  new GameInitializer(new Scanner(System.in)).initializeGame(new Settings());
        new Game(settings).startGame();
    }
}
