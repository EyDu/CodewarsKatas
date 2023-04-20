package com.codewards.katas.day11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    @ParameterizedTest
    @CsvSource({"Hello, 2", "World, 1", "ParameterizedTest, 7"})
    void getCountTest(String input, String expected) {
        int expectedValue = Integer.parseInt(expected);

        assertEquals(expectedValue, Vowels.getCount(input));
    }
}