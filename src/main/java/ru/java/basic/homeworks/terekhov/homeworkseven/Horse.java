package ru.java.basic.homeworks.terekhov.homeworkseven;

public class Horse extends NoFuelTransport{
    public Horse(Location location, int stamina, int staminaConsumption) {
        super(location, stamina, staminaConsumption);
    }

    @Override
    public String toString() {
        return "Лошадь";
    }
}
