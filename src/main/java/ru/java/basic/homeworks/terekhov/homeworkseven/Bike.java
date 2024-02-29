package ru.java.basic.homeworks.terekhov.homeworkseven;

public class Bike extends NoFuelTransport {
    public Bike(Location location, int stamina, int staminaConsumption) {
        super(location, stamina, staminaConsumption);
    }

    @Override
    public String toString() {
        return "Велосипед";
    }
}
