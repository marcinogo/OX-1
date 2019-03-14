package com.mycompany.app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */

@Test
public class NetTestClass {


    @DataProvider
    public static Object[][] netSizesGeneratorWhichAreOk(){
        return new Object[][]{
                {3,3,9},
                {5,5,25},
                {123,834,102582},
                {1,1,1}
        };
    }

    @DataProvider
    public static Object[][] checkInitialFieldIn5x5Net(){
        return new Object[][]{
                {0,0,Sign.EMPTY},
                {0,1,Sign.EMPTY},
                {0,2,Sign.EMPTY},
                {0,3,Sign.EMPTY},
                {0,4,Sign.EMPTY},
                {1,0,Sign.EMPTY},
                {1,1,Sign.EMPTY},
                {1,2,Sign.EMPTY},
                {1,3,Sign.EMPTY},
                {1,4,Sign.EMPTY},
                {2,0,Sign.EMPTY},
                {2,1,Sign.EMPTY},
                {2,2,Sign.EMPTY},
                {2,3,Sign.EMPTY},
                {2,4,Sign.EMPTY},
                {3,0,Sign.EMPTY},
                {3,1,Sign.EMPTY},
                {3,2,Sign.EMPTY},
                {3,3,Sign.EMPTY},
                {3,4,Sign.EMPTY},
                {4,0,Sign.EMPTY},
                {4,1,Sign.EMPTY},
                {4,2,Sign.EMPTY},
                {4,3,Sign.EMPTY},
                {4,4,Sign.EMPTY},

        };
    }

    @Test(dataProvider = "netSizesGeneratorWhichAreOk")
    public void TestSizeOfCreatedNet(int row, int column, int expected){
        NetCreator netCreator = new NetCreator(row, column);
        Net net = netCreator.createNet();
        assert net.getNetSize() == expected;
    }

    @Test(dataProvider = "checkInitialFieldIn5x5Net")
    public void testIfNewNetIsFulfilledWithEmptyFields(int row, int column, Sign expectedState){
        NetCreator netCreator = new NetCreator(5, 5);
        Net net = netCreator.createNet();
        assert net.getField(row, column).fieldSign.equals(expectedState);
    }
}
