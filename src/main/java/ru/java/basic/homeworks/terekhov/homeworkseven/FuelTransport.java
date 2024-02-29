package ru.java.basic.homeworks.terekhov.homeworkseven;

public abstract class FuelTransport extends Transport {
    private int fuel;
    private int fuelConsumption;

    public int getFuel() {
        return fuel;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(int distance) {
        if (this.getFuel() <= 0) {
            return false;
        }
        int maxDistance = this.getFuel() * getFuelConsumption();
        int completedDistance = maxDistance - distance;
        if (completedDistance < 0) {
            return false;
        }
        this.setFuel(completedDistance / getFuelConsumption());
        return super.move(distance);
    }

    public FuelTransport(Location location, int fuel, int fuelConsumption) {
        super(location);
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }
}
