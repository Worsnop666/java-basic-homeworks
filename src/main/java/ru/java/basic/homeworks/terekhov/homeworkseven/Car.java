package ru.java.basic.homeworks.terekhov.homeworkseven;

public class Car extends FuelTransport {
    public Car(Location location, int fuel, int fuelConsumption) {
        super(location, fuel, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Машина";
    }

    @Override
    public boolean move(int distance) {
        if (getLocation() == Location.FOREST || getLocation() == Location.SWAMP) {
            return false;
        }
        return super.move(distance);
    }
}
