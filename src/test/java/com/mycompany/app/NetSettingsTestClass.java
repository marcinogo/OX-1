package com.mycompany.app;

import com.mycompany.app.net.Net;
import com.mycompany.app.net.NetGenerator;
import com.mycompany.app.net.NetSettings;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */

@Test
public class NetSettingsTestClass {


    @DataProvider
    public static Object[][] checkNetRowsAndColumns(){
        return new Object[][]{
                { 1, 1},
                { 2, 2},
                { 3, 3},
                { 4, 9},
                {12,55},
                {342,23},
                {222,44},
                {123,22},
                {1, 100},
        };
    }

    @Test(dataProvider = "checkNetRowsAndColumns")
    public void testIfSettingsCreatesProperNetGenerator(int row, int column){
        NetSettings netSettings = new NetSettings(row, column);
        NetGenerator netGenerator = new NetGenerator(netSettings);
        Net net = netGenerator.createNet();
        assert net.getNetSize() == row*column;
    }

    @Test
    public void checkIfPassedRowParameterEqualsProperOne(){
        NetSettings netSettings = new NetSettings(1, 2);
        assert netSettings.getRow() == 1;
    }

    @Test
    public void checkIFPassedColumnParameterEqualsProperOne(){
        NetSettings netSettings = new NetSettings(3, 4);
        assert netSettings.getColumn() == 4;
    }



}
