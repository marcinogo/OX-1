package com.mycompany.app;

/**
 * @author Wiktor Rup
 */
class Net {

    private Field[][] fields;

    Net(Field[][] fields) {
        this.fields = fields;
    }

    int getNetSize() {
        int netSize = 0;
        for (Field[] field : fields) {
            netSize += field.length;
        }
        return netSize;
    }
}
