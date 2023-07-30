package com.academy.burtsevich.task1.airline;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.service.AirlineStatisticsService;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String airlinesName;
    private List<Aircraft> airFleet = new ArrayList<>();
    AirlineStatisticsService airlineStatisticsService = new AirlineStatisticsService();


    public Airline(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public Airline(String airlinesName, ArrayList<Aircraft> airFleet) {
        this.airlinesName = airlinesName;
        this.airFleet = airFleet;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public List<Aircraft> getAirFleet() {
        return airFleet;
    }

    public void setAirFleet(ArrayList<Aircraft> airFleet) {
        this.airFleet = airFleet;
    }

    public void addAircraft(Aircraft aircraft){
        airFleet.add(aircraft);
    }

    public AirlineStatisticsService getAirlineStatistics() {
        return airlineStatisticsService;
    }

    public void setAirlineStatistics(AirlineStatisticsService airlineStatisticsService) {
        this.airlineStatisticsService = airlineStatisticsService;
    }
}
