package com.codewards.katas.Advanced;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.runners.model.MultipleFailureException.assertEmpty;

class KataTest {

    @Test
    void findUniq() {
        assertEquals(5, Kata.findUniq(new double[]{1, 5, 1 , 1, 1}));
        assertEquals(3, Kata.findUniq(new double[]{1, 3, 1 , 1, 1}));
        assertEquals(15, Kata.findUniq(new double[]{10, 15, 10 , 10, 10}));

        assertThrows(IllegalArgumentException.class, () -> Kata.findUniq(new double[]{}));
        assertThrows(IllegalArgumentException.class, () -> Kata.findUniq(new double[]{1, 2}));
        assertThrows(IllegalArgumentException.class, () -> Kata.findUniq(new double[]{2, 2}));
        assertThrows(IllegalArgumentException.class, () -> Kata.findUniq(new double[]{1, 1, 1, 1}));
    }
}