package org.example;

public class Square implements Shape {

    private int a;

    public Square(int a) {
        setA(a);
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public double getArea() {
        return (int) Math.pow(this.a, 2);
    }
}
