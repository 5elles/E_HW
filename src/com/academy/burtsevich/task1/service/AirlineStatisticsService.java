package com.academy.burtsevich.task1.service;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.airline.Airline;

import java.util.List;

public class AirlineStatisticsService {
    public int getTotalCapacity(Airline airline) {
        List<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .mapToInt(Aircraft::getCapacity).sum();
    }

    public double getTotalLoadCapacity(Airline airline) {
        List<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .mapToDouble(Aircraft::getLoadCapacity).sum();
    }

    public List<Aircraft> getAircraftByFuelConsumptionRange(Airline airline, int min, int max) {
        List<Aircraft> airFleet = airline.getAirFleet();
        return airFleet.stream()
                .filter(aircraft -> aircraft.getFuelConsumption() >= min)
                .filter(aircraft -> aircraft.getFuelConsumption() <= max)
                .toList();
    }
}
