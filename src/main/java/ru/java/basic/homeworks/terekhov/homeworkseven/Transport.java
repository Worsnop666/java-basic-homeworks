package ru.java.basic.homeworks.terekhov.homeworkseven;

public abstract class Transport implements Movable {
    private Location location;
    private Human owner;

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public boolean move(int distance) {
        if (owner == null) {
            return false;
        }
        System.out.println(owner.getName() + " едет на " + this + " по " + location);
        return true;
    }

    public Transport(Location location) {
        this.location = location;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }
}
