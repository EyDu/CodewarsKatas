package com.codewards.katas.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescendingOrderTest {

    @Test
    void sortDesc() {
        assertEquals(54321, DescendingOrder.sortDesc(12345));
        assertEquals(987654, DescendingOrder.sortDesc(456789));
        assertEquals(65543211, DescendingOrder.sortDesc(12565413));
    }
}