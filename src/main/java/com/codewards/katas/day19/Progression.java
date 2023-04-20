package com.codewards.katas.day19;

import java.util.stream.IntStream;

/*
In your class, you have started lessons about arithmetic progression.
Since you are also a programmer,
you have decided to write a function that will return the first n elements of the sequence with the given common difference d and first element a.
Note that the difference may be zero!

The result should be a string of numbers, separated by comma and space.

Example
# first element: 1, difference: 2, how many: 5
arithmetic_sequence_elements(1, 2, 5) == "1, 3, 5, 7, 9"
 */
public class Progression {
    public static String arithmeticSequenceElements(int a, int d, long n){
        StringBuilder stringBuilder = new StringBuilder();
        for (long x = 0; x < n; x++) {
            stringBuilder.append(a + (x * d));
            if (x != n - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
