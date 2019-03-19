package com.mycompany.app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */
@Test
public class UserTestClass {


    @DataProvider
    public static Object[][] randomNames() {
        return new Object[][]{
                {"Jacek"},
                {"Michal"},
                {"cokolwiek"},
                {"players"},
                {"sadjklajglsd"},
                {"***12312309!!!@3salfdsklj"},
                {"78987"},
                {"NAzwa gracza numer jeden"}

        };
    }

    @Test(dataProvider = "randomNames")
    public void checkUserName(String name) {
        User user = new User(name, Sign.X, 3);

        assert user.getName().equals(name);

    }

    @DataProvider
    public static Object[][] checkSign(){
        return new Object[][]{
            {Sign.X},
            {Sign.O}
        };
    }

    @Test(dataProvider = "checkSign")
    public void checkUserSign(Sign sign) {
        User user = new User("Michal", sign, 12);

        assert user.getSign().equals(sign);
    }

    @DataProvider
    public static Object[][] userScore(){
        Object[][] objects = new Object[10][1];
        for(int i=0; i<10;i++){
            objects[i][0] = i;
            }
        return objects;
        }

    @Test(dataProvider = "userScore")
    public void checkUserScore(int score) {
        User user = new User("Beata", Sign.X, score);
        assert user.getScore() == score;
    }

    @DataProvider
    public static Object[][] userScoreAddition(){

        Object[][] objects = new Object[28][3];
        int counter2 = 0;
        for(int i = 0; i<7; i++){
            for(int j=0; j<4; j++){
                objects[counter2][0]=i;
                objects[counter2][1]=j;
                objects[counter2][2]=i+j;
                counter2++;
            }

        }
        return objects;
    }

    @Test(dataProvider = "userScoreAddition")
    public void checkUserScoreAddition(int initialScore, int scoreToAdd, int finalScore){
        User user = new User("Ktos", Sign.X, initialScore);
        user.addScore(scoreToAdd);

        assert user.getScore() == finalScore;
    }
}
