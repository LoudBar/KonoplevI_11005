package com.company;

public class Vector2D {

    double x, y;

    public void add (Vector2D other) {
        this.x = x + other.x;
        this.y = y + other.y;
    }
    public void sub(Vector2D other) {
        this.x = x - other.x;
        this.y = y - other.y;
    }
    public void mult (double t) {
        this.x = x * t;
        this.y = y * t;
    }
}
