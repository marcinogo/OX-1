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

    boolean checkField() {
        System.out.println("Rzedy " + net.howManyRows() + " Podany rzad" + row);
        System.out.println("Kolumny " + net.howManyColumns() + " Podana kolumna" + column);
        if(row < 0 || row >= net.howManyRows() || column < 0 || column >= net.howManyColumns()) {
            return false;
        } else {
            return net.getField(row, column).getFieldSign().equals(Sign.EMPTY);
        }
    }
}

