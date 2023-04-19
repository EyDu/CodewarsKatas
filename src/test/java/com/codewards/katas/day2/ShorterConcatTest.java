package com.codewards.katas.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShorterConcatTest {

    @Test
    void shorterReverseLonger() {
        assertEquals("abcdetsrifabcde", ShorterConcat.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau", ShorterConcat.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi", ShorterConcat.shorterReverseLonger("abcde", "fghi"));
    }
}