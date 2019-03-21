package com.wrup.oxapp;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Wiktor Rup
 */
@Test
public class AuditorTestClass {

    @Test
    public void checkIfAuditorAddDrawPoints() {
        User user1 = new User(Sign.X, true);
        User user2 = new User(Sign.O, false);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Auditor auditor = new Auditor(userList);
        auditor.addDrawScore();

        assert user1.getScore() == 1;
        assert user2.getScore() == 1;
    }

    @Test
    public void checkIfAuditorAddWinnerPoints() {
        User user1 = new User(Sign.X, true);
        User user2 = new User(Sign.O, false);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Auditor auditor = new Auditor(userList);
        auditor.addWinScore(user1);
        assert user1.getScore() == 3;
    }

    @Test
    public void checkIfAuditorKeepsWinningConditions() {
        User user1 = new User(Sign.X, true);
        User user2 = new User(Sign.O, false);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Auditor auditor = new Auditor(userList);
        auditor.addWinScore(user1);

        String[] winningArray = new String[]{
                user1.toString(),
                userList.get(0).toString(),
                String.valueOf(userList.get(0).getScore()),
                userList.get(1).toString(),
                String.valueOf(userList.get(1).getScore())
        };

        assert Arrays.equals(auditor.winning(), winningArray);
    }

    @Test
    public void checkIfAuditorKeepsDrawConditions() {
        User user1 = new User(Sign.X, true);
        User user2 = new User(Sign.O, false);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Auditor auditor = new Auditor(userList);
        auditor.addDrawScore();

        String[] drawArray = new String[]{
                userList.get(0).toString(),
                String.valueOf(userList.get(0).getScore()),
                userList.get(1).toString(),
                String.valueOf(userList.get(1).getScore())
        };

        assert Arrays.equals(auditor.results(), drawArray);
    }

    @Test
    public void checkIfAuditorKeepsResults() {
        User user1 = new User(Sign.X, true);
        User user2 = new User(Sign.O, false);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        Auditor auditor = new Auditor(userList);
        auditor.addWinScore(user1);
        auditor.addDrawScore();

        String[] resultArray = new String[6];
        resultArray[0] = userList.get(0).toString();
        resultArray[1] = String.valueOf(userList.get(0).getScore());
        resultArray[2] = userList.get(1).toString();
        resultArray[3] = String.valueOf(userList.get(1).getScore());

        assert Arrays.equals(auditor.results(), resultArray);
    }
}
