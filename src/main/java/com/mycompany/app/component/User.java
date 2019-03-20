package com.mycompany.app.component;

import com.mycompany.app.net.Sign;

import java.util.Objects;

/**
 * @author Wiktor Rup
 */
public class User {

    private Sign sign;
    private int score;
    private boolean isFirst;

    public User(Sign sign, boolean isFirst) {
        this.sign = sign;
        this.score = 0;
        this.isFirst = isFirst;
    }


    public Sign getSign() {
        return sign;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int i) {
        score+=i;
    }

    public boolean isFirst() {
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
