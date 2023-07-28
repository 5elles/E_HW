package com.academy.burtsevich.task1.aircrafts;

import com.academy.burtsevich.task1.aircrafts.Airplane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    Airplane airplane = new Airplane(
            1,
            2,
            3,
            4,
            "Test",
            5);

    @Test
    void testToString() {
        String s = airplane.toString();
        String s1 = "Самолет рег.№ 5, Test";
        assertEquals(s, s1);
    }
}