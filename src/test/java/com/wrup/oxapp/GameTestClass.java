package com.wrup.oxapp;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Wiktor Rup
 */

@Test
public class GameTestClass {


    @Test
    public void checkGameInitialize() throws IOException {
        String testFile = readFile("initTest", StandardCharsets.UTF_8);
        Settings settings = new Settings();
        settings = new GameInitializer(new Scanner(testFile)).initializeGame(settings);
        Game game = new Game(settings);
    }


    private static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
