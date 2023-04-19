package com.codewards.katas.day13;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplierTest {
    private final Multiplier multiplier = new Multiplier();

    private static Stream<Arguments> multiplyTestArguments() {
        return Stream.of(
                Arguments.of(0, 2, 0),
                Arguments.of(1, 2, 2),
                Arguments.of(-1, 2, -2),
                Arguments.of(100, 2, 200),
                Arguments.of(-100, 2, -200)
        );
    }


    private static Stream<Arguments> isBiggerThanMaxRangeForIntTestArguments() {
        return Stream.of(
                Arguments.of(1L, false),
                Arguments.of(Integer.MAX_VALUE + 1L, true),
                Arguments.of(Integer.MIN_VALUE - 1L, true),
                Arguments.of(Long.MAX_VALUE, true),
                Arguments.of(Long.MIN_VALUE, true)
        );
    }

    private static Stream<Arguments> multiplyWithOverflowTestArguments() {
        return Stream.of(
                Arguments.of(Integer.MAX_VALUE / 2 + 1),
                Arguments.of(Integer.MIN_VALUE / 2 - 1)
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyTestArguments")
    void testMultiply(int a, int b, Object expected) {
        if (expected instanceof Integer) {
            int result = multiplier.multiply(a, b);
            assertEquals(result, expected);
        } else if (expected instanceof Throwable) {
            assertThrows(ArithmeticException.class, () -> multiplier.multiply(a, b));
        }
    }

    @ParameterizedTest
    @MethodSource("isBiggerThanMaxRangeForIntTestArguments")
    void testIsBiggerThanMaxRangeForInt(long value, boolean expected) {
        boolean result = multiplier.isBiggerThanMaxRangeForInt(value);
        assertEquals(result, expected);
    }

    @ParameterizedTest
    @MethodSource("multiplyWithOverflowTestArguments")
    void testMultiplyWithOverflow(int value) {
        assertThrows(ArithmeticException.class, () -> multiplier.multiply(value, 2));
    }
}

