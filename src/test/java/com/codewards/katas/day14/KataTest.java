package com.codewards.katas.day14;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.codewards.katas.day14.Kata.highAndLow;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    private static Stream<Arguments> argumentsForHighAndLowTesting() {
        return Stream.of(
                Arguments.of("1 3 5", "5 1"),
                Arguments.of("5 3 1", "5 1"),
                Arguments.of("1 5 3", "5 1"),
                Arguments.of("3 5 1", "5 1"),
                Arguments.of("-1 -2 -3", "-1 -3"),
                Arguments.of("-1 -3 -2", "-1 -3")
        );
    }
    @ParameterizedTest
    @MethodSource("argumentsForHighAndLowTesting")
    void testHighAndLow(String input, String expected) {
        assertEquals(expected, highAndLow(input));
    }
}