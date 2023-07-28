package com.academy.burtsevich.task1.service;

import com.academy.burtsevich.task1.aircrafts.Aircraft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FleetService {
    public FleetService() {}

    public List<Aircraft> sortFleetByRangeOfFlight(List<Aircraft> airFleet) {
        return airFleet.stream()
                .sorted((o1, o2) -> (int) (o1.getRange() - o2.getRange())).collect(Collectors.toCollection(LinkedList::new));
    }
}
