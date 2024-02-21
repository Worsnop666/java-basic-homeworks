package ru.java.basic.homeworks.terekhov.homework6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(5);
        Cat[] cat = new Cat[]{
                new Cat("Артас"),
                new Cat("Вася"),
                new Cat("Уголек"),
                new Cat("Дымок"),
        };
        for (Cat value : cat) {
            value.eat(plate);
            value.info();
        }
        plate.plateInfo();
    }
}
