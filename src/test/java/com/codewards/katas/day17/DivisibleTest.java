package com.codewards.katas.day17;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleTest {


    public static Stream<Arguments> isDivisibleTestArguments() {
        return Stream.of(
                Arguments.of(new int[]{6, 1, 3}, true),
                Arguments.of(new int[]{12, 2}, true),
                Arguments.of(new int[]{100, 5, 4, 10, 25, 20}, true),
                Arguments.of(new int[]{12, 7}, false)
        );
    }


    @ParameterizedTest
    @MethodSource("isDivisibleTestArguments")
    void isDivisibleTest(int[] divisors, boolean expectedValue) {
        assertEquals(expectedValue, Divisible.isDivisible(divisors));
    }

}