package ru.java.basic.homeworks.terekhov.homework5;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat("Arthas", 10, 10, 150);
        Dog dog = new Dog("Snezhok", 10, 10, 300);
        Horse horse = new Horse("Zakat", 25, 10, 900);
        dog.run(10);
        dog.swim(5);
        dog.info();
        cat.run(10);
        cat.swim(150);
        cat.info();
        horse.run(250);
        horse.swim(200);
        horse.info();
    }
}
