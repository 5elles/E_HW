package com.academy.burtsevich.task1;

public class Airplane extends Aircraft{
    public Airplane(int capacity, int loadCapacity, int range, int fuelConsumption, String model, int registrationNumber) {
        super(capacity, loadCapacity, range, fuelConsumption, model, registrationNumber);
    }

    @Override
    public String toString() {
        return "Самолет рег.№ " + getRegistrationNumber() + ", " + getModel();
    }
}
