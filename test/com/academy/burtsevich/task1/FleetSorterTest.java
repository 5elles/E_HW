package com.academy.burtsevich.task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FleetSorterTest {
    FleetSorter fleetSorter = new FleetSorter();

    ArrayList<Aircraft> airFleet = new ArrayList<>(Arrays.asList(
            new Airplane(1, 2, 3, 4, "a1", 1),
            new Airplane(2, 3, 1, 5, "a2", 2),
            new Airplane(3, 4, 10, 6, "a3", 3),
            new Helicopter(4, 5, 5, 7, "h1", 4),
            new Helicopter(5, 6, 2, 8, "h2", 5)
    ));

    @Test
    void sortFleetByRangeOfFlight() {
        Aircraft[] controlArray = {
                new Airplane(2, 3, 1, 5, "a2", 2),
                new Helicopter(5, 6, 2, 8, "h2", 5),
                new Airplane(1, 2, 3, 4, "a1", 1),
                new Helicopter(4, 5, 5, 7, "h1", 4),
                new Airplane(3, 4, 10, 6, "a3", 3),
        };
        assertArrayEquals(fleetSorter.sortFleetByRangeOfFlight(airFleet).toArray(),controlArray);
    }
}