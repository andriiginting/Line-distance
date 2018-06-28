package com.gojek.CompareTwoLine;

public class Line {
    private int xStart, yStart, xEnd, yEnd;

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        this.xStart = xStart;
        this.yStart = yStart;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;

        if (!(obj instanceof Line)) return false;
        Line objectToCompare = (Line) obj;
        return objectToCompare.xStart == this.xStart &&
                objectToCompare.yStart == this.yStart &&
                objectToCompare.xEnd == this.xEnd &&
                objectToCompare.yEnd == this.yEnd;
    }
}
