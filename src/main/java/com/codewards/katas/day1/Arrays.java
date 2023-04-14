package com.codewards.katas.day1;

/*
Kata:

Write a function that can return the smallest value of an array or the index of that value.
The function's 2nd parameter will tell whether it should return the value or the index.

Assume the first parameter will always be an array filled with at least 1 number and no duplicates.
Assume the second parameter will be a string holding one of two values: 'value' and 'index'.

 */


public class Arrays {

    public static int findSmallest( final int[] numbers, final String toReturn ) {
        int min = numbers[0];
        int minIndex = 0;
        int index = 0;

        for (int number: numbers) {
            if (number < min) {
                min = number;
                minIndex = index;
            }

            index++;
        }

        return toReturn.equals("value") ? min : minIndex;
    }
}