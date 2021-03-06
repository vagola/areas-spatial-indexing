package ru.vagola;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point subtract(Point other) {
        return new Point(x - other.x, y - other.y);
    }

    public Point distance(Point other) {
        return new Point((Math.abs(x - other.x)) / 2, (Math.abs(y - other.y)) / 2);
    }

    public Point center(Point other) {
        return new Point((x + other.x) / 2, (y + other.y) / 2);
    }

    public Quadrant determineQuadrant() {
        if (x >= 0 && y >= 0) {
            return Quadrant.NORTH_EAST;
        }

        if (x <= 0 && y <= 0) {
            return Quadrant.SOUTH_WEST;
        }

        if (x <= 0 && y >= 0) {
            return Quadrant.NORTH_WEST;
        }

        return Quadrant.SOUTH_EAST;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

}
