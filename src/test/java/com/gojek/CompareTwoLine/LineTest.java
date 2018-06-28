package com.gojek.CompareTwoLine;

import org.junit.Test;
import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void lineEqualTest(){
        Line line = new Line(1,0,2,2);
        Line secondLine = new Line(0,0,2,2);

        assertNotEquals(line,secondLine);
        assertEquals(line,line);
    }

    @Test
    public void lineDistanceTest(){
        Line line = new Line(0,0,0,0);
        Line secondLine = new Line(0,0,3,4);

        assertEquals(0, line.calculateDistance(),0);
    }

}
