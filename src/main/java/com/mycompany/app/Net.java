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
        if(row < 0 || row > fields.length || column < 0 || column > fields[0].length)
            return new Field(Sign.X);
        else
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
        return fields.length;
    }

    int howManyRows(){
        return fields[0].length;
    }
}
