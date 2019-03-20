package com.mycompany.app;

public class StringParser {

    private String text;

    StringParser(String text) {
        this.text = text;
    }

    Integer parseToInt() {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    String[] splitString(String pattern) {
        return text.split(pattern);
    }

}
