package com.example.gamini_part1;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
