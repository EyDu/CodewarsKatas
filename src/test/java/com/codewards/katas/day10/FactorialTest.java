package com.codewards.katas.day10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FactorialTest {

    @Test
    void factorialTest() {
        Factorial factorial = new Factorial();

        assertEquals(40320, factorial.factorial(8));
        assertEquals(720, factorial.factorial(6));
        assertEquals(6, factorial.factorial(3));
        assertEquals(1, factorial.factorial(0));

    }
}