package com.codewards.katas.day3;


/*
Task:

Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.
 */

// Note to self: Good job but way too over-engineered

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return intArrayToInt(reverseSortIntArray(intToIntArray(num)));
    }

    private static int[] intToIntArray(int num) {
        String temp = Integer.toString(num);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = Character.getNumericValue(temp.charAt(i));
        }

        return digits;
    }

    private static int[] reverseSortIntArray(int[] digits) {
        Integer[] boxedArr = Arrays.stream(digits).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, Comparator.reverseOrder());
        int[] sortedDigits = Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();

        return sortedDigits;
    }

    private static int intArrayToInt(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            stringBuilder.append(digits[i]);
        }

        return Integer.parseInt(stringBuilder.toString());
    }

}
