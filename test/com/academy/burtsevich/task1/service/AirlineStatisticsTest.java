package com.academy.burtsevich.task1.service;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.aircrafts.Airplane;
import com.academy.burtsevich.task1.aircrafts.Helicopter;
import com.academy.burtsevich.task1.airline.Airline;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirlineStatisticsTest {
    Airline airline = new Airline("Test airline");
    ArrayList<Aircraft> airFleet = new ArrayList<>(Arrays.asList(
            new Airplane(1, 2, 3, 4, "a1", 1),
            new Airplane(2, 3, 4, 5, "a2", 2),
            new Airplane(3, 4, 5, 6, "a3", 3),
            new Helicopter(4, 5, 6, 7, "h1", 4),
            new Helicopter(5, 6, 7, 8, "h2", 5)
    ));

    AirlineStatistics statistics = new AirlineStatistics();

    @Test
    void getTotalCapacity() {
        airline.setAirFleet(airFleet);
        assertEquals(statistics.getTotalCapacity(airline), 15);
    }

    @Test
    void getTotalLoadCapacity() {
        airline.setAirFleet(airFleet);
        assertEquals(statistics.getTotalLoadCapacity(airline), 20);
    }

    @Test
    void getAircraftByFuelCnsmptnRange() {
        airline.setAirFleet(airFleet);
        Aircraft[] controlArray = {
                new Airplane(1, 2, 3, 4, "a1", 1),
                new Airplane(2, 3, 4, 5, "a2", 2),
                new Airplane(3, 4, 5, 6, "a3", 3)
        };
        assertArrayEquals(statistics.getAircraftByFuelConsumptionRange(airline,4, 6).toArray(), controlArray);
    }
}