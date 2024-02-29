package ru.java.basic.homeworks.terekhov.homeworkseven;

public abstract class NoFuelTransport extends Transport{
    private int stamina;
    private int staminaConsumption;

    public int getStaminaConsumption() {
        return staminaConsumption;
    }

    public void setStaminaConsumption(int staminaConsumption) {
        this.staminaConsumption = staminaConsumption;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public NoFuelTransport(Location location, int stamina, int staminaConsumption) {
        super(location);
        this.stamina = stamina;
        this.staminaConsumption = staminaConsumption;
    }

    @Override
    public boolean move(int distance) {
        if (getLocation() == Location.SWAMP) {
            return false;
        }
        int maxDistance = this.getStamina() * getStaminaConsumption();
        int completedDistance = maxDistance - distance;
        if (completedDistance < 0) {
            return false;
        }
        this.setStamina(completedDistance / getStaminaConsumption());
        return super.move(distance);
    }
}
