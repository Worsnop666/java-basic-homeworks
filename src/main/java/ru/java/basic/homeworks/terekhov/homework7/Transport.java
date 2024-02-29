package ru.java.basic.homeworks.terekhov.homework7;

public abstract class Transport {
    protected int fuel;
    protected int stamina;
    protected Locations currentLocation;

    public Transport(int fuel, int stamina) {
        this.fuel = fuel;
        this.stamina = stamina;
        this.currentLocation = Locations.PLAIN;
    }

    public abstract boolean drive(int distance, Locations location);

    public Locations getCurrentLocation() {
        return currentLocation;
    }
}
