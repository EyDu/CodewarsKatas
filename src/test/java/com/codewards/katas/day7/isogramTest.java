package com.codewards.katas.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isogramTest {

    @Test
    void isIsogram() {

        assertFalse(isogram.isIsogram("hello"));
        assertTrue(isogram.isIsogram("helo"));
        assertFalse(isogram.isIsogram("heloasdvgbgg"));

        assertTrue(isogram.isIsogram("Dermatoglyphics"));
        assertTrue(isogram.isIsogram("isogram"));
        assertFalse(isogram.isIsogram("moose"));
        assertFalse(isogram.isIsogram("isIsogram"));
        assertFalse(isogram.isIsogram("aba"));
        assertFalse(isogram.isIsogram("moOse"));
        assertTrue(isogram.isIsogram("thumbscrewjapingly"));
        assertTrue(isogram.isIsogram(""));
    }
}

/*
clever:
public class isogram {
  public static boolean  isIsogram(String str) {
    return str.length() == str.toLowerCase().chars().distinct().count();
  }
}
 */