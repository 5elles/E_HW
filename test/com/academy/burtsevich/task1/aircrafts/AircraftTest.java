package com.academy.burtsevich.task1.aircrafts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.academy.burtsevich.task1.aircrafts.Aircraft;
import com.academy.burtsevich.task1.aircrafts.Airplane;
import org.junit.jupiter.api.Test;

public class AircraftTest {
    Aircraft aircraft = new Airplane(
            1,
            10,
            1,
            1,
            "test model",
            1
    );

    @Test
    public void testGetCapacity(){
        assertEquals(1, aircraft.getCapacity());
    }

    @Test
    public void testSetCapacity(){
        aircraft.setCapacity(222);
        assertEquals(aircraft.getCapacity(), 222);
    }

    @Test
    public void testSetFuelConsumption(){
        aircraft.setFuelConsumption(2);
        assertEquals(aircraft.getFuelConsumption(), 2);
    }

    @Test
    public void testGetModel(){
        assertEquals("test model", aircraft.getModel());
    }

    @Test
    public void testSetModel(){
        aircraft.setModel("TEST");
        assertEquals("TEST", aircraft.getModel());
    }

    @Test
    public void testGetRegistrationNumber(){
        assertEquals(aircraft.getRegistrationNumber(), 1);
    }

    @Test
    public void testSetRegistrationNumber(){
        aircraft.setRegistrationNumber(999);
        assertEquals(aircraft.getRegistrationNumber(), 999);
    }

    @Test
    public void testGetLoadCapacity(){
        assertEquals(aircraft.getLoadCapacity(), 10);
    }

    @Test
    public void testSetLoadCapacity(){
        aircraft.setLoadCapacity(4444444);
        assertEquals(aircraft.getLoadCapacity(), 4444444);
    }

    @Test
    public void testGetRange(){
        assertEquals(aircraft.getRange(), 1);
    }

    @Test
    public void testSetRange(){
        aircraft.setRange(5555555);
        assertEquals(aircraft.getRange(), 5555555);
    }
}
