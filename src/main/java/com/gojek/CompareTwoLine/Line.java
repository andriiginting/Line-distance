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
                objectToCompare.yEnd == this.yEnd ;
    }

    public double calculateDistance(){
        return Math.sqrt(Math.pow((this.xStart-this.xEnd),2) + Math.pow((this.yStart-this.yEnd),2));
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }
}
