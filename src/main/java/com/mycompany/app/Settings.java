package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class Settings {

    private final int row;
    private final int column;

    Settings(int row, int column) {
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
