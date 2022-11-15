package ru.hehnev;

public class Main {
    public static void main(String[] args) {
//        MyArrayList<String> list = new MyArrayList<>();
//        list.add("Hello");
//        list.add("Good morning");
//        list.add("How are you?");
//
//        forech(list);
//
//        list.insert("Bob", 2);
//        forech(list);
//
//        list.delete(1);
//        forech(list);

        MyList<String> strings = new MyLinkedList<>();
        strings.add("Hello");
        strings.add("Coffee, please");
        strings.add("Thank you!!!");

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("---------------");

        strings.insert("Bob", 1);

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("---------------");

        strings.delete(1);
        for (String s : strings) {
            System.out.println(s);
        }


    }

    private static void forech(MyArrayList<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("size " + list.getSize());
        System.out.println("length " + list.getArray().length);
        System.out.println("capacity " + list.getCapacity());

        System.out.println("------------------------------");
    }

}
