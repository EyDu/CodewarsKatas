package com.codewards.katas.day18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private static Stream<Arguments> insertDashTestArguments() {
        return Stream.of(
                Arguments.of("123", 123),
                Arguments.of("0", 0),
                Arguments.of("1-1-1-1",1111),
                Arguments.of("2222", 2222),
                Arguments.of("3-522", 3522),
                Arguments.of("5-5-5", 555)
        );
    }

    @ParameterizedTest
    @MethodSource("insertDashTestArguments")
    void insertDashTest(String expected, int input) {
        assertEquals(expected, Solution.insertDash(input));
    }
}