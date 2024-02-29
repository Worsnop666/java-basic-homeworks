package ru.java.basic.homeworks.terekhov.homework7;

public class OffRoadCar extends Transport {

    public OffRoadCar(int fuel, int stamina) {
        super(fuel, stamina);
    }

    @Override
    public boolean drive(int distance, Locations location){
        if (fuel >= distance) {
            fuel -= distance;
            return true;
        } else {
            return false;
        }
    }

}
