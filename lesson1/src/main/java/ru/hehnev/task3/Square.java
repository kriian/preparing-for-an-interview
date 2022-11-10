package ru.hehnev.task3;

public class Square extends Shape {

    public Square(String color) {
        super(color);
    }

    @Override
    protected void calculateAreaShape(double value) {
        super.areaShape = value * value;
    }

    @Override
    protected void print() {
        System.out.printf("Рисуем квадрат. Площадь = %f. Цвет %s\n", super.getAreaShape(), super.getColor());
    }
}
