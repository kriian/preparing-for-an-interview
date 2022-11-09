package ru.hehnev.task1;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .addAge(25)
                .addFirstName("Bob")
                .addAddress("Russia")
                .build();

        System.out.println(person);
    }
}
