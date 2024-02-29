package ru.java.basic.homeworks.terekhov.homework7;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Сергей");
        Car car = new Car(50, 0);
        Horse horse = new Horse(0, 100, "Жеребец");
        Bike bike = new Bike(0, 100, "Урал");
        OffRoadCar offRoadCar = new OffRoadCar(100, 0);

        human.sitOnTransport(car);
        human.move(10, Locations.PLAIN);
        human.move(5, Locations.FOREST);

        human.sitOnTransport(horse);
        human.move(5, Locations.PLAIN);
        human.move(5, Locations.SWAMP);

        human.sitOnTransport(bike);
        human.move(10, Locations.FOREST);
        human.move(5, Locations.SWAMP);

        human.sitOnTransport(offRoadCar);
        human.move(10, Locations.SWAMP);

    }
}
