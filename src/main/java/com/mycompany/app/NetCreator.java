package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class NetCreator {

    private Settings settings;

    NetCreator(Settings settings) {
        this.settings = settings;
    }

    Net createNet() {
        Field[][] fields = new Field[settings.getRow()][settings.getColumn()];
        for (int i = 0; i < settings.getRow(); i++) {
            for (int j = 0; j < settings.getColumn(); j++) {
                fields[i][j] = new Field(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }
}
