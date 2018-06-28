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
    public void testCalculateDistance(){
        Line line = new Line(0,0,0,0);
        Line secondLine = new Line(-3,-4,0,0);

        assertEquals(0, line.calculateDistance(),0);
        assertEquals(5,secondLine.calculateDistance(),0);
    }

}
