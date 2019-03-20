package com.mycompany.app.net;

import com.mycompany.app.net.Net;
import com.mycompany.app.net.Sign;

/**
 * @author Wiktor Rup
 */
public class FieldChecker {

    private int row;
    private int column;
    private Net net;

    FieldChecker(int row, int column, Net net) {
        this.row = row;
        this.column = column;
        this.net = net;
    }

    boolean checkField(){
        if(row < 0 || row > net.howManyRows() || column < 0 || column > net.howManyRows())
            return false;
        else
            return net.getField(row, column).getFieldSign().equals(Sign.EMPTY);
    }
}

