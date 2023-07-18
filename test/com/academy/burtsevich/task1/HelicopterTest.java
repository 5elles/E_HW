package com.academy.burtsevich.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelicopterTest {
    Aircraft helicopter = new Helicopter(
            1,
            2,
            3,
            4,
            "Test",
            5);

    @Test
    void testToString() {
        String s = helicopter.toString();
        String control = "Вертолет рег.№ 5, Test";
        assertEquals(s, control);
    }
}