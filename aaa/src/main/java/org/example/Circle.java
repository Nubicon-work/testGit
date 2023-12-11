package org.example;

public class Circle implements Shape {

    private int r;

    public Circle(int r) {
        setR(r);
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return this.r;
    }

    public double getArea() {
        return Math.pow(this.r, 2) * 2 * Math.PI;
    }
}


