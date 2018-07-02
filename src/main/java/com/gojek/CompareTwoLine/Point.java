package com.gojek.CompareTwoLine;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Point p = (Point)o;
        return p.x == this.x && p.y == this.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)x + (int)y;
        return result;
    }
}
