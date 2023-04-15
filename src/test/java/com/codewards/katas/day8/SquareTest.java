package com.codewards.katas.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void isSquare() {

        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
        assertTrue(Square.isSquare(81));

        assertFalse(Square.isSquare(3));
        assertFalse(Square.isSquare(33125));
        assertFalse(Square.isSquare(35123));

    }
}