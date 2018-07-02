package com.gojek.CompareTwoLine;

public class Rectangle {
    double xOffset;
    double yOffset;
    double length;
    double width;

    public Rectangle(double xOffset, double yOffset, double length, double width) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.length = length;
        this.width = width;
    }

    public double getPerimeter() {
        if (length == 0 || width == 0) {
            return 0;
        }
        return Math.abs(length * 2) + Math.abs(width * 2);
    }

    public double getArea() {
        return Math.abs(length * width);
    }

}
