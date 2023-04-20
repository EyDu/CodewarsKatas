package com.codewards.katas.day17;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    private static Stream<Arguments> alternateSqSumTestArguments() {
        return Stream.of(
                Arguments.of(420, new int[]{12, 13, 14, 15}),
                Arguments.of(3, new int[]{3}),
                Arguments.of(29, new int[]{1,2,3,4,5})
        );
    }

    @ParameterizedTest
    @MethodSource("alternateSqSumTestArguments")
    void alternateSqSumTest(int expected, int[] input) {
        assertEquals(expected, Kata.alternateSqSum(input));
    }
}