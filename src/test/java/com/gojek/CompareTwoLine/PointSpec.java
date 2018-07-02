package com.gojek.CompareTwoLine;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class PointSpec {
    @Test
    public void testReflexivePoint() {
        Point p1 = new Point(0, 0);

        assertEquals(p1, p1);
    }

    @Test public void testSymmetricPoint() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        assertEquals(p1,p2);
    }

    @Test public void testTransitivePoints() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Point p3 = new Point(0,0);

        assertEquals(p1,p2);
        assertEquals(p2,p3);

        assertEquals(p1,p3);
    }

    @Test public void testPointWithObject() {
        Point p1 = new Point(0, 0);

        assertNotEquals(p1, new Object());
    }

    @Test public void testNull() {
        Point p1 = new Point(0, 0);

        assertFalse(p1.equals(null));
    }

    @Test public void testNotEqual() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);

        assertNotEquals(p1,p2);
    }

    @Test public void testHashCode() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 0);

        assertEquals(p1.hashCode(),p2.hashCode());
    }
}
