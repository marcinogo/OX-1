package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class MoveMaker {
    private Sign signToPut;
    private int row;
    private int column;
    private Net net;
    private FieldChecker fieldChecker;

    MoveMaker(Sign signToPut, int row, int column, Net net) {
        this.signToPut = signToPut;
        this.row = row;
        this.column = column;
        this.net = net;
        this.fieldChecker = new FieldChecker(row, column, net);
    }

    void putSign() {
        if(fieldChecker.checkField()){
            net.getField(row, column).setFieldSign(signToPut);
        }
    }

    Sign getSignToPut() {
        return signToPut;
    }
}
