package com.gojek.CompareTwoLine;

import org.junit.Test;
import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void testTwoLineIsEqual(){
        Line line = new Line(0,0,0,0);
        Line secondLine = new Line(0,0,0,0);

        assertEquals(line, secondLine);
    }

    @Test
    public void testTwoLineIsEqualsWithNullParams(){
        Line line = new Line(0,0,0,0);

        assertNotEquals(line,line.equals(null));
    }

    @Test
    public void testLineIfSwapped() {
        Line line = new Line(0,2,0,0);
        Line secondLine = new Line(0,0,0,2);

        assertEquals(line, secondLine);
    }

    @Test
    public void testLineIfSelfIsPassed() {
        Line line = new Line(0, 2, 0, 0);
        assertEquals(line, line);
    }

    @Test
    public void testLineIsNull() {
        Line line = new Line(0,0,0,0);
        assertNotEquals(null, line);

    }

    @Test
    public void testCalculateDistance(){
        Line line = new Line(0,0,0,0);
        assertEquals(0, line.calculateDistance(),0);
    }

    @Test
    public void testCalculateDistanceNegative(){
        Line line    = new Line(0,0,-3,-4);
        assertEquals(5, line.calculateDistance(),0);
    }

}
