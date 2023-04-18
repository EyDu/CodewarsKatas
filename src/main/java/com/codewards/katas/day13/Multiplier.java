package com.codewards.katas.day13;

/*
Multiply two ints, but take care of overflow.
If the result cannot be accurately stored in an int, throw an ArithmeticException.
*/
public class Multiplier {
    public int multiply(int a, int b) {
        if (isBiggerThanMaxRangeForInt((long) a * b)) {
            throw new ArithmeticException("Value too big!");
        } else {
            return a * b;
        }
    }

    public boolean isBiggerThanMaxRangeForInt(long sum) {
        return sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE;
    }
}