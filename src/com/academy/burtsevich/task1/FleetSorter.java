package com.academy.burtsevich.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FleetSorter {
    public FleetSorter() {}

    public LinkedList<Aircraft> sortFleetByRangeOfFlight(ArrayList<Aircraft> airFleet) {
        return airFleet.stream()
                .sorted((o1, o2) -> (int) (o1.getRange() - o2.getRange())).collect(Collectors.toCollection(LinkedList::new));
    }
}
