package com.wrup.oxapp;

/**
 * @author Wiktor Rup
 */
class NetSettings {

    private final int row;
    private final int column;

    NetSettings(int row, int column) {
        this.row = row;
        this.column = column;
    }

    int getRow() {
        return row;
    }

    int getColumn() {
        return column;
    }
}
