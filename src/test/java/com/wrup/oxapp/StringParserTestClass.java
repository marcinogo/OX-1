package com.wrup.oxapp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @author Wiktor Rup
 */
@Test
public class StringParserTestClass {

    @DataProvider
    public static Object[][] stringParser(){
        return new Object[][]{
                {"dlaskj12", -1},
                {"1234", 1234},
                {";;sdl12", -1},
                {"01-0", -1},
                {"2", 2},
                {"1", 1},
                {"0", 0}
        };
    }

    @Test(dataProvider = "stringParser")
    public void checkIfParseProperly(String stringToParse, int result){
        StringParser stringParser = new StringParser(stringToParse);
        assert stringParser.parseToInt() == result;
    }

    @DataProvider
    public static Object[][] stringSplit(){
        return new Object[][]{
            { "1,2,3",",",new String[]{"1","2","3"} },
            { "1;4;6",";", new String[]{"1","4","6"} },
            { "1,2,",",", new String[]{"1","2"} }
        };
    }

    @Test(dataProvider = "stringSplit")
    public void checkIfSplitProperly(String textToSplit, String pattern, String[] result){
        StringParser stringParser = new StringParser(textToSplit);
        assert Arrays.equals(stringParser.splitString(pattern),result);
    }
}
