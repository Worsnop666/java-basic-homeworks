package ru.java.basic.homeworks.terekhov.homeworkseven;

public class OffRoadCar extends FuelTransport{
    public OffRoadCar(Location location, int fuel, int fuelConsumption) {
        super(location, fuel, fuelConsumption);
    }

    @Override
    public String toString() {
        return "Нива";
    }

    @Override
    public boolean move(int distance) {
        return super.move(distance);
    }
}
