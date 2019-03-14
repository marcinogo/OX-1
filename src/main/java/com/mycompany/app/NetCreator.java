package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class NetCreator {

    private final int row;
    private final int column;

    NetCreator(int row, int column) {
        this.row = row;
        this.column = column;
    }

    Net createNet() {
        Field[][] fields = new Field[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                fields[i][j] = new Field(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }
}
