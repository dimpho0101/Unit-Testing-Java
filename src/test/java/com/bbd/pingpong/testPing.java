package com.bbd.pingpong;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPing {

    @ParameterizedTest
    @CsvSource({"I, 1",
            "V, 5",
            "II, 2",
            "IV, 4",
            "IX, 9",
            "X, 10",
            "XvI, 16",
            "L, 50",
            "C, 100",
            "D, 500",
            "M, 1000",
            "vii, 7"
    })
    public void testNumber1(String roman, int expected) {
//        System.out.print('I');
        assertEquals(expected,RomanConverter.Convert(roman));
    }
}