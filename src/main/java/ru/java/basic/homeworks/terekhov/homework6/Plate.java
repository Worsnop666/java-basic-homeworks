package ru.java.basic.homeworks.terekhov.homework6;

public class Plate {
    private int maxFood;
    private int food;
    private int volume;

    public int getFood() {
        return food;
    }

    public Plate(int volume) {
        if (volume > 0) {
            this.maxFood = volume;
            this.volume = volume;
            this.food = maxFood;
        }
    }

    public void fillPlate(int food) {
        this.food += food;
        if (this.food >= maxFood){
            this.food = maxFood;
            System.out.println("Тарелка заполнена");
        } else {
            System.out.println("В тарелку добавили: " + food + " еды.");
        }
    }

    public void decreaseFood(int amount) {
        if (this.food >= 0) {
            food -= amount;
        } else {
            this.food = 0;
        }
    }

    public void plateInfo() {
        System.out.println("Обьем тарелки: " + this.volume);
        System.out.println("Еда в тарелке: " + this.food);
    }
}
