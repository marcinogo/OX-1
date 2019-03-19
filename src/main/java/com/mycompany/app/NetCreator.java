package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class NetCreator {

    private NetSettings netSettings;

    NetCreator(NetSettings netSettings) {
        this.netSettings = netSettings;
    }

    Net createNet() {
        Field[][] fields = new Field[netSettings.getRow()][netSettings.getColumn()];
        for (int i = 0; i < netSettings.getRow(); i++) {
            for (int j = 0; j < netSettings.getColumn(); j++) {
                fields[i][j] = new Field(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }
}
