package ru.java.basic.homeworks.terekhov.homework7;

public class Car extends Transport{

      public int getFuel() {
        return fuel;
    }

    public Car(int fuel, int stamina) {
        super(fuel, stamina);
    }

    @Override
    public boolean drive(int distance, Locations location) {
        if (location.equals(Locations.FOREST) || location.equals(Locations.SWAMP)) {
            return false;
        }
        if (fuel >= distance) {
            fuel -= distance;
            return true;
        } else {
            return false;
        }
    }
}
