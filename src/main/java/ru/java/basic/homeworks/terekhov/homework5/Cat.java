package ru.java.basic.homeworks.terekhov.homework5;

public class Cat extends Animals {
    public Cat(String name, float speedRun, float speedSwim, float stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    public void info() {
        System.out.println("Информация о кошке: ");
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun);
        System.out.println("Скорость плавания: " + speedSwim);
        System.out.println("Выносливость: " + stamina);
        if (stamina == 0) {
            System.out.println("Кот " + name + " устал");
        }
    }


    @Override
    public void swim(float distance) {
        System.out.println("Кошки боятся воды");
    }
}
