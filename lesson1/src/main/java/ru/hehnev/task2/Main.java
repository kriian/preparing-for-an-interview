package ru.hehnev.task2;

public class Main {
    public static void main(String[] args) {
        /*
        Ошибки:
            класс Lorry делает множественное наследование, что не возможно,
            так-же класс Lorry не переопределяет метод (abstract void open();) супер класса,
            так-же класс Lorry есть не большая ошибка, он не использует аннотацию (@Override),
            в классе Car поле engine сделать приватным.
        Оптимизации:
            первое - имплементировать наши интерфейсы в абстрактном классе Car,
            второе - использовать паттерн Builder для построения объекта Car.
         */
    }
}
//interface Moveable {
//    void move();
//}
//interface Stopable {
//    void stop();
//}
//abstract class Car {
//    public Engine engine;
//    private String color;
//    private String name;
//    protected void start() {
//        System.out.println("Car starting");
//    }
//    abstract void open();
//    public Engine getEngine() {
//        return engine;
//    }
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//    public String getColor() {
//        return color;
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//class LightWeightCar extends Car implements Moveable {
//    @Override
//    void open() {
//        System.out.println("Car is open");
//    }
//    @Override
//    public void move() {
//        System.out.println("Car is moving");
//    }
//}
//class Lorry extends Car, Moveable, Stopable {
//    public void move() {
//        System.out.println("Car is moving");
//    }
//
//    public void stop() {
//        System.out.println("Car is stop");
//    }
//}
