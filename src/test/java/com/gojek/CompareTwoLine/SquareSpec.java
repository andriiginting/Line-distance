package com.gojek.CompareTwoLine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareSpec {
    @Test
    public void specCreateSquare() {
        Square square = new Square(0, 0, 5);

        assertEquals(20.0, square.getPerimeter(), 0.0);
    }

    @Test
    public void specCreateSquareWithZeroLength() {
        Square square = new Square(0, 0, 0);

        assertEquals(0, square.getPerimeter(), 0.0);
        assertEquals(0, square.getArea(), 0.0);
    }

    @Test
    public void specCreateSquareWithNegativeValues() {
        Square square = new Square(0, 0, -10);

        assertEquals(40, square.getPerimeter(), 0.0);
        assertEquals(100, square.getArea(), 0.0);
    }
}
