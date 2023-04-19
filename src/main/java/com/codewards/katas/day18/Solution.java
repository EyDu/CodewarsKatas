package com.codewards.katas.day18;

/*Write a function insert_dash(num) / insertDash(num) / InsertDash(int num) that will insert dashes ('-')
 between each two odd digits in num. For example: if num is 454793 the output should be 4547-9-3.
 Don't count zero as an odd digit.


Note that the number will always be non-negative (>= 0).

*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static String insertDash(int num) {
        String[] digits = Integer.toString(num).split("");
        return IntStream.range(0, digits.length - 1)
                .mapToObj(i -> Integer.parseInt(digits[i]) % 2 == 1 && Integer.parseInt(digits[i + 1]) % 2 == 1 ?
                        digits[i] + "-" : digits[i])
                .collect(Collectors.joining()) + digits[digits.length - 1];
    }
}


/*
Here's a crazy nice solution:

public class Solution {

  public static String insertDash(int num) {
    return (num+"").replaceAll("([13579])(?=[13579])", "$1-");
  }

}

 */