package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class User {


    private String name;
    private Sign sign;
    private int score;

    User(String name, Sign sign, int score) {

        this.name = name;
        this.sign = sign;
        this.score = score;
    }

    String getName() {
        return name;
    }

    Sign getSign() {
        return sign;
    }

    int getScore() {
        return score;
    }

    void addScore(int i) {
        score+=i;
    }
}
