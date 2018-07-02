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
        if ((objectToCompare.xStart == this.xStart &&
                objectToCompare.yStart == this.yStart &&
                objectToCompare.xEnd == this.xEnd &&
                objectToCompare.yEnd == this.yEnd) ||
                (objectToCompare.xStart == this.xEnd &&
                        objectToCompare.yStart == this.yEnd &&
                        objectToCompare.xEnd == this.xStart &&
                        objectToCompare.yEnd == this.yStart)) {
            return true;
        }

        return false;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((this.xStart - this.xEnd), 2) + Math.pow((this.yStart - this.yEnd), 2));
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + xStart;
        result = 31 * result + xEnd;
        result = 31 * result + yStart;
        result = 31 * result + yEnd;

        return result;
    }
}
