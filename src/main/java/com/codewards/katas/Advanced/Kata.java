package com.codewards.katas.Advanced;

/*
There is an array with some numbers. All numbers are equal except for one. Try to find it!

Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains at least 3 numbers.

The tests contain some very huge arrays, so think about performance.

This is the first kata in series:

Find the unique number (this kata)
Find the unique string
Find The Unique
*/

import java.util.Arrays;

public class Kata {
    public static double findUniq(double[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("All the numbers are unique! :) ");
        }
        double comparisonNum = arr[0] == arr[1] ? arr[0] : arr[1] == arr[2] ? arr[1] : arr[2];

        return Arrays.stream(arr)
                .filter(num -> num != comparisonNum).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There is no unique number!"));
    }
}