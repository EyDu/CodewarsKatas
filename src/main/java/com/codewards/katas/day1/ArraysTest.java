package com.codewards.katas.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    @Test
    void findSmallest() {
        assertEquals(Arrays.findSmallest(new int[] {1, 2, 3}, "value"), 1);
        assertEquals(Arrays.findSmallest(new int[] {22, 2, 33}, "value"), 2);
    }
}