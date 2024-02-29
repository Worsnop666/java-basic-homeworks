package ru.java.basic.homeworks.terekhov.homeworkseven;

public class Human implements Movable{
    private String name;
    private Transport transport;

    public String getName() {
        return name;
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean move(int distance) {
        if (transport != null) {
            return transport.move(distance);
        }
            return true;
    }

    public void sitOnTransport(Transport transport){
        transport.setOwner(this);
        this.transport = transport;
    }
}
