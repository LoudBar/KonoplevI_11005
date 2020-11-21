package com.company;

public class Circle extends Shape {

    private int radius;
    final double Pi = 3.14;
    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        double answer = radius * Pi;
        System.out.println(answer);
    }
}
