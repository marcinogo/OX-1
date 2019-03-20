package com.mycompany.app.net;

/**
 * @author Wiktor Rup
 */
public class Net {

    private Field[][] fields;

    public Net(Field[][] fields) {
        this.fields = fields;
    }

    public int getNetSize() {
        int netSize = 0;
        for (Field[] field : fields) {
            netSize += field.length;
        }
        return netSize;
    }

    public Field getField(int row, int column) {
            return fields[row][column];
    }

    public Net clearNet() {
        for(Field [] row: fields){
            for(Field column : row){
                column.changeState(Sign.EMPTY);
            }
        }
        return new Net(fields);
    }

    public int howManyColumns(){
        return fields.length;
    }

    public int howManyRows(){
        return fields[0].length;
    }
}
