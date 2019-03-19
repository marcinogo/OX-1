package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class NetPrinter {

    private Net net;

    NetPrinter(Net net) {
        this.net = net;
    }

    void printNet() {
        System.out.println();
        printColumnNumbers();
        System.out.println();
        printUpperBorder();
        for (int column = 0; column < net.howManyRows(); column++) {
            System.out.println();
            System.out.print(" " + column + " |");
            for (int row = 0; row < net.howManyColumns(); row++) {
                printSign(net.getField(row, column));
            }
            System.out.println();
            System.out.print("---*");
            for (int row = 0; row < net.howManyColumns(); row++) {
                System.out.print("---*");
            }

        }
    }

    private void printColumnNumbers(){
        System.out.print("   |");
        for (int column = 0; column < net.howManyColumns(); column++) {
            System.out.print(" " + column + " |");
        }
    }

    private void printUpperBorder() {
        System.out.print("---*");
        for (int column = 0; column < net.howManyColumns(); column++) {
            System.out.print("---*");
        }
    }

    private void printSign(Field field) {
        if (field.getFieldSign().equals(Sign.X))
            System.out.print(" X |");
        else if (field.getFieldSign().equals(Sign.O))
            System.out.print(" O |");
        else
            System.out.print("   |");
    }
}
