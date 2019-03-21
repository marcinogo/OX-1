package com.mycompany.app;

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
        for (User user : users)
            user.addScore(1);
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

    String[] draw() {
        return new String[]{
                users.get(0).toString(),
                String.valueOf(users.get(0).getScore()),
                users.get(1).toString(),
                String.valueOf(users.get(1).getScore())
        };
    }

    String[] results() {

        String[] result = new String[6];
        result[0] = users.get(0).toString();
        result[1] = String.valueOf(users.get(0).getScore());
        result[2] = users.get(1).toString();
        result[3] = String.valueOf(users.get(1).getScore());

        return result;
    }
}
