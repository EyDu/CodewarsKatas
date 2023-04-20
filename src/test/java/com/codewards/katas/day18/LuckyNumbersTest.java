package com.codewards.katas.day18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LuckyNumbersTest {

    private static Stream<Arguments> isLuckyTestArguments() {
        return Stream.of(
                Arguments.of(1234, false),
                Arguments.of(1233, true),
                Arguments.of(0, true),
                Arguments.of(9, true),
                Arguments.of(123453, true)
        );
    }

    @ParameterizedTest
    @MethodSource("isLuckyTestArguments")
    void isLuckyTest(long input, boolean expected) {
        assertEquals(expected, LuckyNumbers.isLucky(input));
    }
}