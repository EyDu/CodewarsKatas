package com.codewards.katas.day6;

/*
The objective is to write a method that takes two integer parameters and
returns a single integer equal to the number of 1s in the binary representation of the greatest common divisor of the parameters.

Taken from Wikipedia: "In mathematics, the greatest common divisor (gcd) of two or more integers,
when at least one of them is not zero, is the largest positive integer that divides the numbers without a remainder. For example, the GCD of 8 and 12 is 4."

For example: the greatest common divisor of 300 and 45 is 15. The binary representation of 15 is 1111, so the correct output would be 4.

If both parameters are 0, the method should return 0. The function must be able to handle negative input.
*/

// Since I will probably forget about this solution in the future:
// A way to find the GCD of 2 Numbers is the usage of the Euclidean Algorithm(look it up, if you forgot what it is)
// It's nature welcomes a recursive function or a while loop to figure out the GCD
// After that transform the result in a BinaryString and then simply count the 1's

public class BinaryGCD {
    public static int gcdBinary(int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }

        x = Math.abs(x);
        y = Math.abs(y);

        int gcd = euclideanGCD(x, y);

        return Integer.bitCount(gcd);
    }

    //Recursive
    private static int euclideanGCD(int x, int y) {
        if (y == 0) {
            return x;
        }

        return euclideanGCD(y, x % y);
    }

}




/*
//Also i wanna point out that this genius solutions exists for this task:

import java.math.BigInteger;
public class BinaryGCD {
  public static int gcdBinary(int x, int y) {
    return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).bitCount();
  }
}

//amazing
 */