package com.mycompany.app.net;

import com.mycompany.app.net.Field;
import com.mycompany.app.net.Sign;

/**
 * @author Wiktor Rup
 */
public class FieldChanger {

    public Field changeState(Field field, Sign stateToChange) {
        if ((field.getFieldSign().equals(Sign.X) || field.getFieldSign().equals(Sign.O))&& !stateToChange.equals(Sign.EMPTY)) {
            return new Field(field.getFieldSign());
        }
        else
            return new Field(stateToChange);
    }
}
