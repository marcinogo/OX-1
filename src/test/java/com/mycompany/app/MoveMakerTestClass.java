package com.mycompany.app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author Wiktor Rup
 */
@Test
public class MoveMakerTestClass {

    @DataProvider
    public static Object[][] checkInitialFieldsIn5x5Net(){
        return new Object[][]{
                {0,0},
                {0,1},
                {0,2},
                {0,3},
                {0,4},
                {1,0},
                {1,1},
                {1,2},
                {1,3},
                {1,4},
                {2,0},
                {2,1},
                {2,2},
                {2,3},
                {2,4},
                {3,0},
                {3,1},
                {3,2},
                {3,3},
                {3,4},
                {4,0},
                {4,1},
                {4,2},
                {4,3},
                {4,4}

        };
    }

    @DataProvider
    public static Object[][] wrongCoordinatesFor5x5Net(){
        Object[][] objects = new Object[300][2];
        for(int i=0;i<300;i++){
            objects[i][0] = new Random().nextInt(1006)+5;
            objects[i][1] = new Random().nextInt(1006)+5;
        }
        return objects;
    }

    @Test(dataProvider = "checkInitialFieldsIn5x5Net")
    public void checkIfMoveIsPossible(int row, int column){
        NetSettings netSettings = new NetSettings(5, 5);
        NetCreator netCreator = new NetCreator(netSettings);
        Net net = netCreator.createNet();
        FieldChecker fieldChecker = new FieldChecker(row, column, net);
        assert fieldChecker.checkField();
    }

    @Test(dataProvider = "wrongCoordinatesFor5x5Net")
    public void checkIfMoveIsImpossibleWhenWrongCoordinates(int row, int column){
        NetSettings netSettings = new NetSettings(5, 5);
        NetCreator netCreator = new NetCreator(netSettings);
        Net net = netCreator.createNet();
        FieldChecker fieldChecker = new FieldChecker(row, column, net);
        assert !fieldChecker.checkField();
    }

    @Test(dataProvider = "checkInitialFieldsIn5x5Net")
    public void checkIfXHasBeenPut(int row, int column){
        NetSettings netSettings = new NetSettings(5, 5);
        NetCreator netCreator = new NetCreator(netSettings);
        Net net = netCreator.createNet();
        MoveMaker moveMaker = new MoveMaker(Sign.O, row,column,net);
        moveMaker.putSign();
        assert net.getField(row,column).getFieldSign().equals(moveMaker.getSignToPut());
    }

    @Test(dataProvider = "checkInitialFieldsIn5x5Net")
    public void checkIfOHasBeenPut(int row, int column){
        NetSettings netSettings = new NetSettings(5, 5);
        NetCreator netCreator = new NetCreator(netSettings);
        Net net = netCreator.createNet();
        MoveMaker moveMaker = new MoveMaker(Sign.X, row,column,net);
        moveMaker.putSign();
        assert net.getField(row,column).getFieldSign().equals(moveMaker.getSignToPut());
    }




}
