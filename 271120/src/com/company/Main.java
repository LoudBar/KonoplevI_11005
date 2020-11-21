package com.company;

public class Main {

    public static void main(String[] args) {

        Shape[] figures = new Shape[5];
        figures[0] = new Rectangle(10, 20);
        figures[1] = new Circle(5);
        figures[2] = new Triangle(2, 8);
        figures[3] = new Circle(8);
        figures[4] = new Triangle(15, 6);

        for (int i = 0; i < figures.length; i++) {
           figures[i].getArea();
        }
    }
}
