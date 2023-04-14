package com.codewards.katas.day5;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDigitTest {

    SquareDigit squareDigit = new SquareDigit();

    @Test
    void squareDigits() {
        assertEquals(1111, squareDigit.squareDigits(1111));
        assertEquals(491625, squareDigit.squareDigits(2345));
        assertEquals(0, squareDigit.squareDigits(0));

    }
}