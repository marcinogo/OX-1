package com.mycompany.app;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * @author Wiktor Rup
 */
@Test
public class InputValidatorTestClass {


    @DataProvider
    public static Object[][] negativeNumbersForInputTest() {
        Random random = new Random();
        Object[][] objects = new Object[10][1];
        for (int i = 0; i < objects.length; i++) {
            objects[i][0] = random.nextInt(1000) - 1000;
        }
        return objects;
    }

    @Test(dataProvider = "negativeNumbersForInputTest")
    public void checkIfNegativeValueIsRejected(int number){
        InputValidator inputValidator = new InputValidator();
        assert !inputValidator.checkIfValueIsNegative(number);
    }

    @Test
    public void checkIfPositiveValueIsNotRejected(){
        InputValidator inputValidator = new InputValidator();
        assert inputValidator.checkIfValueIsNegative(10);
    }

}
