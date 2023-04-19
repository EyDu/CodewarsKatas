package com.codewards.katas.day15;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static com.codewards.katas.day15.DnaStrand.complementaryDNA;
import static org.junit.jupiter.api.Assertions.*;

class DnaStrandTest {

    private static Stream<Arguments> complementaryDNATestArguments() {
        return Stream.of(
                Arguments.of("TAGC", "ATCG"),
                Arguments.of("ATCG", "TAGC"),
                Arguments.of("", ""),
                Arguments.of("AAAAAA", "TTTTTT"),
                Arguments.of("HELLO WORLD!", "Hello World!")
        );
    }
    @ParameterizedTest
    @MethodSource("complementaryDNATestArguments")
    void complementaryDNATest(String expected, String input) {
        assertEquals(expected, complementaryDNA(input));
    }
}