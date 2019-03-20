package com.mycompany.app.net;


/**
 * @author Wiktor Rup
 */
public class NetGenerator {

    private NetSettings netSettings;

    public NetGenerator(NetSettings netSettings) {
        this.netSettings = netSettings;
    }

    public Net createNet() {
        Field[][] fields = new Field[netSettings.getRow()][netSettings.getColumn()];
        for (int i = 0; i < netSettings.getRow(); i++) {
            for (int j = 0; j < netSettings.getColumn(); j++) {
                fields[i][j] = new Field(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }
}
