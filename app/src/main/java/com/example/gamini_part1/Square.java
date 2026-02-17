package com.example.gamini_part1;

public class Square extends Shape {
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        super(x, y);   // <-- important
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}