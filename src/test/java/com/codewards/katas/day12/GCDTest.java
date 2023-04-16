package com.codewards.katas.day12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @ParameterizedTest
    @CsvSource({"6, 30, 12", "1, 8, 9", "1, 1, 1"})
    void compute(int expectedValue, int x, int y) {
        assertEquals(expectedValue, GCD.compute(x, y));
    }
}