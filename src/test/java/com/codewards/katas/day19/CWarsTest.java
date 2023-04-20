package com.codewards.katas.day19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CWarsTest {

    private static Stream<Arguments> initialsTestArguments() {
        return Stream.of(
                Arguments.of("H.World!", "Hello world!"),
                Arguments.of("N.N.I.Needed", "No Name is needed"),
                Arguments.of("J.Jackson", "Jack Jackson"),
                Arguments.of("T.R.Goose", "The resurrected Goose")
        );
    }

    @ParameterizedTest
    @MethodSource("initialsTestArguments")
    void initialsTest(String expected, String input) {
        assertEquals(expected, CWars.initials(input));
    }
}