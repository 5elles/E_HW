package com.academy.burtsevich.task1;

import java.util.ArrayList;
import java.util.List;

public record AirlineStatistics(Airline airline) {
    public int getTotalCapacity() {
        ArrayList<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .mapToInt(Aircraft::getCapacity).sum();
    }

    public double getTotalLoadCapacity() {
        ArrayList<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .mapToDouble(Aircraft::getLoadCapacity).sum();
    }

    public List<Aircraft> getAircraftByFuelCnsmptnRange(int min, int max) {
        ArrayList<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .filter(aircraft -> aircraft.getFuelConsumption() >= min)
                .filter(aircraft -> aircraft.getFuelConsumption() <= max)
                .toList();
    }
}
