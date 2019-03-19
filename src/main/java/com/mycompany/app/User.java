package com.mycompany.app;

import java.util.Objects;

/**
 * @author Wiktor Rup
 */
class User {

    private Sign sign;
    private int score;
    private boolean isFirst;

    User(Sign sign, boolean isFirst) {
        this.sign = sign;
        this.score = 0;
        this.isFirst = isFirst;
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

    boolean isFirst() {
        return isFirst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return score == user.score &&
                isFirst == user.isFirst &&
                sign == user.sign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sign, score, isFirst);
    }
}
