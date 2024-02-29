package ru.java.basic.homeworks.terekhov.homework7;

public class Bike extends Transport {
    private String name;

    public Bike(int fuel, int stamina, String name) {
        super(fuel, stamina);
        this.name = name;
    }

    @Override
    public boolean drive(int distance, Locations location) {
        return !location.equals(Locations.SWAMP);
    }
}
