package com.codewards.katas.day19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ProgressionTest {

    private static Stream<Arguments> arithmeticSequenceElementsTestArguments() {
        return Stream.of(
                Arguments.of("1, 3, 5", 1, 2, 3),
                Arguments.of("", 20, 100, 0),
                Arguments.of("5, 15, 25", 5, 10, 3),
                Arguments.of("100, 200, 300, 400, 500", 100, 100, 5),
                Arguments.of("1, -2, -5, -8, -11, -14, -17, -20, -23, -26", 1, -3, 10)

        );
    }

    @ParameterizedTest
    @MethodSource("arithmeticSequenceElementsTestArguments")
    void arithmeticSequenceElementsTest(String expected, int a, int d, long n) {
        assertEquals(expected, Progression.arithmeticSequenceElements(a, d, n));
    }
}