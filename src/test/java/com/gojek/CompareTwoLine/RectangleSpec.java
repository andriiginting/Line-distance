package com.gojek.CompareTwoLine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleSpec {

    @Test
    public void specCreateRectangle() {
        Rectangle rectangle = new Rectangle(0, 0, 5, 10);

        assertEquals(30.0, rectangle.getPerimeter(), 0.0);
    }

    @Test
    public void specCreateRectangleWithZeroLength() {
        Rectangle rectangle = new Rectangle(0, 0, 0, 10);

        assertEquals(0, rectangle.getPerimeter(), 0.0);
        assertEquals(0, rectangle.getArea(), 0.0);
    }

    @Test
    public void specCreateRectangleWithZeroWidth() {
        Rectangle rectangle = new Rectangle(0, 0, 10, 0);

        assertEquals(0, rectangle.getPerimeter(), 0.0);
        assertEquals(0, rectangle.getArea(), 0.0);
    }

    @Test
    public void specCreateRectangleWithNegativeWidthLength() {
        Rectangle rectangle = new Rectangle(0, 0, -10, -5);

        assertEquals(30, rectangle.getPerimeter(), 0.0);
        assertEquals(50, rectangle.getArea(), 0.0);
    }

    @Test
    public void specCreateRectangleWithZeroWidthLength() {
        Rectangle rectangle = new Rectangle(0, 0, 0, 0);

        assertEquals(0, rectangle.getPerimeter(), 0.0);
        assertEquals(0, rectangle.getArea(), 0.0);
    }
}
