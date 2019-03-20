package com.mycompany.app.net;

import java.util.Objects;

/**
 * @author Wiktor Rup
 */
public class Field {

    public Sign fieldSign;

    public Field(Sign fieldSign) {
        this.fieldSign = fieldSign;
    }

    public Sign getFieldSign() {
        return fieldSign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return fieldSign == field.fieldSign;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldSign);
    }

    public Field changeState(Sign stateToChange) {
        if ((fieldSign.equals(Sign.X) || fieldSign.equals(Sign.O))&& !stateToChange.equals(Sign.EMPTY)) {
            return new Field(fieldSign);
        }
        else
            return new Field(stateToChange);
    }

    public void setFieldSign(Sign signToPut) {
        this.fieldSign = signToPut;
    }
}
