package com.company;

public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this. width = width;
    }

    @Override
    void getArea() {
        int answer = length * width;
        System.out.println(answer);
    }
}
