package ru.hehnev.task3;

public class Triangle extends Shape {

    public Triangle(String color) {
        super(color);
    }

    @Override
    protected void calculateAreaShape(double value) {
        super.areaShape = value * value / 2;
    }

    @Override
    protected void print() {
        System.out.printf("Рисуем треугольник. Площадь = %f. Цвет %s\n", super.getAreaShape(), super.getColor());
    }
}
