package com.codewards.katas.day7;


/*An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.
*/



import java.util.HashSet;
import java.util.Set;

public class isogram {
    public static boolean  isIsogram(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Set<Character> charSet = new HashSet<>();

        for (char c : charArray) {
            charSet.add(c);
        }

        return charArray.length == charSet.size();
    }
}
