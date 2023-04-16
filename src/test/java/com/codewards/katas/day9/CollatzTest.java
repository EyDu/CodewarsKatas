package com.codewards.katas.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzTest {

    @Test
    void conjecture() {
        assertEquals(1, Collatz.conjecture(1));
        assertEquals(2, Collatz.conjecture(2));
        assertEquals(8, Collatz.conjecture(3));
        assertEquals(3, Collatz.conjecture(4));
        assertEquals(6, Collatz.conjecture(5));
        assertEquals(9, Collatz.conjecture(6));
        assertEquals(17, Collatz.conjecture(7));
        assertEquals(4, Collatz.conjecture(8));
        assertEquals(20, Collatz.conjecture(9));
        assertEquals(7, Collatz.conjecture(10));
    }
}