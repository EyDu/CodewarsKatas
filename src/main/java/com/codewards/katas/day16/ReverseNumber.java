package com.codewards.katas.day16;

import java.util.Objects;

public class ReverseNumber {

    public static int reverse(int number) {
        int reversed = 0;
        boolean isNegative = number < 0;
        if (isNegative) {
            number *= -1;
        }
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return isNegative ? reversed * -1 : reversed;
    }
}