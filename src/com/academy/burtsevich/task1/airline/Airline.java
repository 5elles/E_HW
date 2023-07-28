package com.academy.burtsevich.task1.airline;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.service.AirlineStatistics;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String airlinesName;
    private List<Aircraft> airFleet = new ArrayList<>();
    AirlineStatistics airlineStatistics = new AirlineStatistics();


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

    public AirlineStatistics getAirlineStatistics() {
        return airlineStatistics;
    }

    public void setAirlineStatistics(AirlineStatistics airlineStatistics) {
        this.airlineStatistics = airlineStatistics;
    }
}
