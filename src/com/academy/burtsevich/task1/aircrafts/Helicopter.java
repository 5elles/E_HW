package com.academy.burtsevich.task1.aircrafts;

public class Helicopter extends Aircraft {
    public Helicopter(int capacity,
                      int loadCapacity,
                      int range,
                      int fuelConsumption,
                      String model,
                      int registrationNumber) {
        super(
                capacity,
                loadCapacity,
                range,
                fuelConsumption,
                model,
                registrationNumber);
    }

    @Override
    public String toString() {
        return "Вертолет рег.№ " + getRegistrationNumber() + ", " + getModel();
    }
}
