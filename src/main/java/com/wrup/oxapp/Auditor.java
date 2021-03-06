package com.wrup.oxapp;

import java.util.List;

/**
 * @author Wiktor Rup
 */
class Auditor {

    private List<User> users;
    private User user;

    Auditor(List<User> users) {
        this.users = users;
    }

    void addWinScore(User user) {
        this.user = user;
        user.addScore(3);
    }

    void addDrawScore() {
        for (User user : users) {
            user.addScore(1);
        }
    }

    String[] winning() {
        return new String[]{
                user.toString(),
                users.get(0).toString(),
                String.valueOf(users.get(0).getScore()),
                users.get(1).toString(),
                String.valueOf(users.get(1).getScore())
        };
    }

    String[] results() {

        return new String[]{
                users.get(0).toString(),
                String.valueOf(users.get(0).getScore()),
                users.get(1).toString(),
                String.valueOf(users.get(1).getScore())
        };
    }

}
