package com.academy.burtsevich.task1;

import java.util.ArrayList;

public class Airline {
    private String airlinesName;
    private ArrayList<Aircraft> airFleet = new ArrayList<>();

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

    public ArrayList<Aircraft> getAirFleet() {
        return airFleet;
    }

    public void setAirFleet(ArrayList<Aircraft> airFleet) {
        this.airFleet = airFleet;
    }

    public void addAircraft(Aircraft aircraft){
        airFleet.add(aircraft);
    }
}
