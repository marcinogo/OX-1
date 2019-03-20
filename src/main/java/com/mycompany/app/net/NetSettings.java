package com.mycompany.app.net;

/**
 * @author Wiktor Rup
 */
public class NetSettings {

    private final int row;
    private final int column;

    public NetSettings(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
