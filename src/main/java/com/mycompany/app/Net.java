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

    Field getField(int row, int column) {
            return fields[row][column];
    }

    Net clearNet() {
        for(Field [] row: fields){
            for(Field column : row){
                column.changeState(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }

    int howManyColumns(){
        //System.out.println("KOLUMNY " + fields.length);
        return fields[0].length;
    }

    int howManyRows(){
        //System.out.println("RZEDY " + fields[0].length);
        return fields.length;
    }
}
