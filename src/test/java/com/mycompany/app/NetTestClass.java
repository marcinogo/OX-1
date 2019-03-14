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



    @Test(dataProvider = "netSizesGeneratorWhichAreOk")
    public void TestSizeOfCreatedNet(int row, int column, int expected){
        NetCreator netCreator = new NetCreator(row, column);
        Net net = netCreator.createNet();
        assert net.getNetSize() == expected;
    }
}
