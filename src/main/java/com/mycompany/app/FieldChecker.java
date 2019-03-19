package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class FieldChecker {

    private int row;
    private int column;
    private Net net;

    FieldChecker(int row, int column, Net net) {
        this.row = row;
        this.column = column;
        this.net = net;
    }

    boolean checkField(){
        return  net.getField(row, column).getFieldSign().equals(Sign.EMPTY);
    }
}

