package com.company;

public class Triangle extends Shape {

    private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height= height;
        this.width = width;
    }

    @Override
    void getArea() {
        int answer = height * width / 2;
        System.out.println(answer);
    }
}
