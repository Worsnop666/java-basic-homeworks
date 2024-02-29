package ru.java.basic.homeworks.terekhov.homework7;

public class Human {
    private String name;
    private Transport currentTransport;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    public void sitOnTransport(Transport transport) {
        if (transport instanceof Car && (transport.getCurrentLocation().equals(Locations.FOREST) || transport.getCurrentLocation().equals(Locations.SWAMP))) {
            System.out.println("Этот транспорт не проедет по данной местности");
        } else if (transport instanceof Horse && transport.getCurrentLocation().equals(Locations.SWAMP)) {
            System.out.println("Этот транспорт не проедет по данной местности");
        } else if (transport instanceof Bike && transport.getCurrentLocation().equals(Locations.SWAMP)) {
            System.out.println("Этот транспорт не проедет по данной местности");
        } else {
            currentTransport = transport;
            System.out.println(name + " залез на " + currentTransport.getClass().getSimpleName());
        }
    }

    public void standFromTransport() {
        currentTransport = null;
        System.out.println(name + " слез с транспорта");
    }

    public void move(int distance, Locations location) {
        if (currentTransport == null) {
            System.out.println(name + " идёт пешком " + distance);
        } else {
            boolean success = currentTransport.drive(distance, location);
            if (success) {
                System.out.println(name + " передвигается " + distance + " расстояние " + currentTransport.getClass().getSimpleName() + " в " + location);
            } else {
                System.out.println("не может передвигаться на " + currentTransport.getClass().getSimpleName() + " в " + location);
            }
        }
    }
}


