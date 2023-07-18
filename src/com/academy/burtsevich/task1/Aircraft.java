package com.academy.burtsevich.task1;

import java.util.Objects;

public abstract class Aircraft {
    private int capacity, loadCapacity, range, fuelConsumption;
    private String model;
    private int registrationNumber;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Aircraft(int capacity, int loadCapacity, int range, int fuelConsumption, String model, int registrationNumber) {
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Воздушное судно рег.№ " + getRegistrationNumber() + ", " + getModel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return registrationNumber == aircraft.registrationNumber && Objects.equals(model, aircraft.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, registrationNumber);
    }
}
