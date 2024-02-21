package ru.java.basic.homeworks.terekhov.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name) {
        this.name = name;
        this.isHungry = true;
    }

    public void eat(Plate plate) {
        if (plate.getFood() > 0) {
            if (isHungry) {
                System.out.println(name + " покушал");
                plate.declineFood(1);
                isHungry = false;
            } else {
                System.out.println(name + " не голоден");
            }
        } else {
            System.out.println("тарелка пуста");
        }
    }

    public void info() {
        System.out.println("Имя: " + name);
        if (!isHungry) {
            System.out.println("Аппетит: сытый");
        } else {
            System.out.println("Аппетит: голоден");
        }
    }
}
