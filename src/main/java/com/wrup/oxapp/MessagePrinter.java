package com.wrup.oxapp;

/**
 * @author Wiktor Rup
 */
class MessagePrinter {

    void print(String rb, String... text) {
        if (text.length != 0) {
            System.out.println(String.format(rb, text));
        } else {
            System.out.println(rb);
        }
    }
}
