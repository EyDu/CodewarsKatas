package com.codewards.katas.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryCalculatorTest {

    @Test
    void calculate() {
        assertEquals("1", BinaryCalculator.calculate("0", "1", "add"));
        assertEquals("110", BinaryCalculator.calculate("10", "100", "add"));
        assertEquals("1010", BinaryCalculator.calculate("1000", "10", "add"));

        assertEquals("-1", BinaryCalculator.calculate("0", "1", "subtract"));
        assertEquals("110", BinaryCalculator.calculate("1010", "100", "subtract"));
        assertEquals("110", BinaryCalculator.calculate("1000", "10", "subtract"));

        assertEquals("0", BinaryCalculator.calculate("0", "1", "multiply"));
        assertEquals("1000", BinaryCalculator.calculate("10", "100", "multiply"));
        assertEquals("1001011", BinaryCalculator.calculate("1111", "101", "multiply"));

        assertEquals("wrong input! String isn't binary!", BinaryCalculator.calculate("222", "something", "cake"));

        assertEquals("Operation is not supported. Check the spelling (add, subtract, multiply)", BinaryCalculator.calculate("1", "1", "Sonic the Hedgehog"));
    }
}