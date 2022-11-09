package ru.hehnev.task3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("RED");
        Shape square = new Square("Blue");
        Shape triangle = new Triangle("Black");

        circle.calculateAreaShape(8);
        circle.print();

        square.calculateAreaShape(5);
        square.print();

        triangle.calculateAreaShape(4);
        triangle.print();
    }
}
