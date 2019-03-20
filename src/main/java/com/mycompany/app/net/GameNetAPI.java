package com.mycompany.app.net;

/**
 * @author Wiktor Rup
 */
public class GameNetAPI {

    private NetSettings netSettings;

    public void setNetSize(int row, int column) {
        netSettings = new NetSettings(row, column);
    }

    public Net createNet() {
        NetGenerator netGenerator = new NetGenerator(netSettings);
        return netGenerator.createNet();
    }
}
