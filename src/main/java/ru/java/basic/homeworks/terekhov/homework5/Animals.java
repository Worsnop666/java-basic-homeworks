package ru.java.basic.homeworks.terekhov.homework5;

public class Animals {
    protected String name;
    protected float speedRun;
    protected float speedSwim;
    protected float stamina;

    public String getName() {
        return name;
    }

    public float getSpeedRun() {
        return speedRun;
    }

    public float getSpeedSwim() {
        return speedSwim;
    }

    public float getStamina() {
        return stamina;
    }

    public Animals(String name, float speedRun, float speedSwim, float stamina) {
        this.name = name;
        if (speedRun > 0 && speedSwim > 0 && stamina > 0) {
            this.speedRun = speedRun;
            this.speedSwim = speedSwim;
            this.stamina = stamina;
        } else {
            System.out.println("Ведите корректное число поля");
        }
    }

    public void run(float distance) {
        float time = 0;
        if (distance > 0 && distance <= stamina) {
            stamina -= distance;
            time = (distance /= speedRun);
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

    public void swim(float distance) {
        float time = 0;
        if (distance > 0 && distance <= stamina) {
            stamina -= distance;
            time = (distance /= speedSwim);
            System.out.println(time);
            if (stamina < 0) {
                stamina = 0;
                System.out.println("У животного " + name + " появилась усталость");
                time = -1;
                System.out.println(time);
            }
        }
    }
}
