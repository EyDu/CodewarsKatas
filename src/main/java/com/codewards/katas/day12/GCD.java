package com.codewards.katas.day12;

/*
Find the greatest common divisor of two positive integers. The integers can be large, so you need to find a clever solution.

The inputs x and y are always greater or equal to 1, so the greatest common divisor will always be an integer that is also greater or equal to 1.
 */

public class GCD {
    public static int compute(int x, int y) {
        if (y == 0) {
            return x;
        }

        return compute(y, x % y);    }
}