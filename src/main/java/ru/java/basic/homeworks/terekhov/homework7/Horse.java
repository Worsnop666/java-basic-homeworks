package ru.java.basic.homeworks.terekhov.homework7;

public class Horse extends Transport {
    private String name;

    public String getName() {
        return name;
    }


    public Horse(int fuel, int stamina, String name) {
        super(fuel, stamina);
        this.name = name;
    }

    @Override
    public boolean drive(int distance, Locations location) {
        if (location.equals(Locations.SWAMP)) {
            return false;
        }
        if (stamina >= distance) {
            stamina -= distance;
            return true;
        } else {
            return false;
        }
    }
}
