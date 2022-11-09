package ru.hehnev.task3;

public abstract class Shape {
    protected String color;
    protected double areaShape;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getAreaShape() {
        return areaShape;
    }

    protected abstract void calculateAreaShape(double value);
    protected abstract void print();
}
