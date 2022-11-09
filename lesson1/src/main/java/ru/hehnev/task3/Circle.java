package ru.hehnev.task3;

public class Circle extends Shape {

    public Circle(String color) {
        super(color);
    }

    @Override
    protected void calculateAreaShape(double value) {
        super.areaShape = Math.PI * (value * value);
    }

    @Override
    protected void print() {
        System.out.printf("Рисуем круг. Площадь = %f. Цвет %s\n", super.getAreaShape(), super.getColor());
    }
}
