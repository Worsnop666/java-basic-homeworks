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

    public void fillPlate() {
        if (this.food < this.maxFood) {
            do {
                this.food++;
            } while (this.food == this.maxFood - 1);
        } else {
            System.out.println("тарелка полная");
        }
    }

    public void declineFood(int amount) {
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
