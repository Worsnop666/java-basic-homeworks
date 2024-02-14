package ru.java.basic.homeworks.terekhov.homework5;

public class Dog extends Animals {
    public Dog(String name, float speedRun, float speedSwim, float stamina) {
        super(name, speedRun, speedSwim, stamina);
    }

    public void info() {
        System.out.println("Информация о собаке: ");
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + speedRun);
        System.out.println("Скорость плавания: " + speedSwim);
        System.out.println("Выносливость: " + stamina);
        if (stamina == 0) {
            System.out.println("Собака " + name + " устала");
        }
    }

    @Override
    public void swim(float distance) {
        float time = 0;
        if (distance > 0 && (distance * 2) <= stamina) {
            stamina -= (distance *= 2);
            time = (distance /= speedSwim);
            System.out.println(time);
            if (stamina < 0) {
                stamina = 0;
                System.out.println("У животного " + name + " появилась усталость");
                time = -1;
                System.out.println(time);
            }
        } else {
            stamina = 0;
            time = -1;
            System.out.println(time);
        }
    }
}
