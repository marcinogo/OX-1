package com.mycompany.app;

import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */

@Test
public class SettingsTestClass {

    @Test
    public void testIfSettingsCreatesProperNetGenerator(){
        Settings settings = new Settings(5, 5);
        NetCreator netCreator = new NetCreator(settings);
        Net net = netCreator.createNet();
        assert net.getNetSize() == 5*5;
    }

}
