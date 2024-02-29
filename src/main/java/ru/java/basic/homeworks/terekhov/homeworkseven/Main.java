package ru.java.basic.homeworks.terekhov.homeworkseven;

public class Main {
    public static void main(String[] args) {
        Human lexa = new Human("Лёха");
        Car car = new Car(Location.PLAIN, 1000, 2);
        OffRoadCar offRoadCar = new OffRoadCar(Location.PLAIN, 1000, 2);
        Bike bike = new Bike(Location.PLAIN, 100, 2);
        Horse horse = new Horse(Location.FOREST, 1000, 2);
        Human serega = new Human("Серёга");
        lexa.sitOnTransport(car);
        serega.sitOnTransport(horse);
        Transport[] transports = {
                car, offRoadCar, bike, horse
        };
        for (Transport transport : transports) {
            transport.move(1000);
        }
        for (Transport transport : transports) {
            transport.move(1000);
        }
    }
}
