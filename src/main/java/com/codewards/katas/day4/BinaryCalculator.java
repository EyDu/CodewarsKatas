package com.codewards.katas.day4;


/*
In this kata you need to write a function that will receive two strings (n1 and n2), each representing an integer as a binary number.
A third parameter will be provided (o) as a string representing one of the following operators: add, subtract, multiply.

Your task is to write the calculate function so that it will perform the arithmetic and the result returned should be a string representing the binary result.

Negative binary numbers are usually preceded by several 1's. For this kata, negative numbers can be represented with the negative symbol at the beginning of the string.

 */
public class BinaryCalculator {

    public static String calculate(final String n1, final String n2, final String o) {
        if(!isStringBinary(n1) || !isStringBinary(n2)) {
            return "wrong input! String isn't binary!";
        }

        switch (o) {
            case "add":
                int sum = binaryToInt(n1) + binaryToInt(n2);
                return Integer.toBinaryString(sum);
            case "subtract":
                int diff = binaryToInt(n1) - binaryToInt(n2);
                return (diff >= 0 ? "" : "-") + Integer.toBinaryString(Math.abs(diff));
            case "multiply":
                int product = binaryToInt(n1) * binaryToInt(n2);
                return Integer.toBinaryString(product);
            default:
                return "Operation is not supported. Check the spelling (add, subtract, multiply)";
        }
    }

    public static boolean isStringBinary(String str) {
        for (String digit: str.split("")) {
            if (digit.equals("1") || digit.equals("0")) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int binaryToInt(String str) {
        return Integer.parseInt(str, 2);
    }
}
