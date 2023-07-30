package com.academy.burtsevich.task1.airline;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.aircrafts.Airplane;
import com.academy.burtsevich.task1.aircrafts.Helicopter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {

    Airline airline = new Airline("Test");

    @Test
    void getAirlinesName() {
        assertEquals(airline.getAirlinesName(), "Test");
    }

    @Test
    void setAirlinesName() {
        airline.setAirlinesName("Test123");
        assertEquals(airline.getAirlinesName(), "Test123");
    }

    @Test
    void getAirFleet() {
        Aircraft[] aircraft = new Aircraft[]{new Helicopter(
                1,
                2,
                3,
                4,
                "Test",
                7
        )};
        airline.addAircraft(new Helicopter(
                1,
                2,
                3,
                4,
                "Test",
                7));

        assertArrayEquals(airline.getAirFleet().toArray(), aircraft);
    }

    @Test
    void setAirFleet() {
        Aircraft helicopter = new Helicopter(
                2,
                3,
                4,
                5,
                "Tes helicopter",
                6
        );
        Aircraft airplane = new Airplane(
                3,
                4,
                5,
                6,
                "Test airplane",
                7
        );
        ArrayList<Aircraft> aircrafts = new ArrayList<>(Arrays.asList(helicopter, airplane));
        airline.setAirFleet(aircrafts);
        assertArrayEquals(airline.getAirFleet().toArray(), aircrafts.toArray());
    }

    @Test
    void addAircraft() {
        ArrayList<Aircraft> aircrafts = new ArrayList<>();
        Aircraft airplane = new Airplane(
                4,
                5,
                6,
                7,
                "Test airplane",
                8
        );
        airline.setAirFleet(aircrafts);
        airline.addAircraft(airplane);
        assertEquals(airline.getAirFleet().get(0), airplane);
    }
}