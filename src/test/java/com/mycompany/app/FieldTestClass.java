package com.mycompany.app;

import org.testng.annotations.Test;

/**
 * @author Wiktor Rup
 */

@Test
public class FieldTestClass {

    @Test
    public void testIfEmptyFieldIsEmpty(){
        Field field = new Field(Sign.EMPTY);
        assert field.fieldSign.equals(Sign.EMPTY);
    }
    @Test
    public void testIfXFieldIsX(){
        Field field = new Field(Sign.X);
        assert field.fieldSign.equals(Sign.X);
    }
    @Test
    public void testIfOFieldIsO(){
        Field field = new Field(Sign.O);
        assert field.fieldSign.equals(Sign.O);
    }
    @Test
    public void testFieldEquality(){
        Field emptyField = new Field(Sign.EMPTY);
        Field xField = new Field(Sign.X);
        Field oField = new Field(Sign.O);
        assert oField.equals(new Field(Sign.O));
        assert xField.equals(new Field(Sign.X));
        assert emptyField.equals(new Field(Sign.EMPTY));
    }
}
