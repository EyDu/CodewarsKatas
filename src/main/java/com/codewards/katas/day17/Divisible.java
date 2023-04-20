package com.codewards.katas.day17;

import java.util.Arrays;

public class Divisible {
    public static boolean isDivisible(int... values){
        return values.length <= 1 || Arrays.stream(values)
                .skip(1)
                .allMatch(i -> i != 0 && values[0] % i == 0);
    }
}
