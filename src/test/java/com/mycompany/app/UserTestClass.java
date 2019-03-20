package com.mycompany.app;

import com.mycompany.app.net.Sign;
import com.mycompany.app.component.User;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */
@Test
public class UserTestClass {

        @DataProvider
    public static Object[][] checkSign(){
        return new Object[][]{
            {Sign.X},
            {Sign.O}
        };
    }

    @Test(dataProvider = "checkSign")
    public void checkUserSign(Sign sign) {
        User user = new User(sign, true);

        assert user.getSign().equals(sign);
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
        User user = new User( Sign.X, true);
        user.addScore(initialScore);
        user.addScore(scoreToAdd);

        assert user.getScore() == finalScore;
    }

    @Test
    public void checkIfUserStarts(){
        User user = new User(Sign.X,true);
        assert user.isFirst();
    }

    @Test
    public void checkIfUserDoesNotStart(){
            User user = new User(Sign.O, false);
            assert !user.isFirst();
    }
}
