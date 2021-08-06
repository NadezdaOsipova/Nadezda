package com.home.model;

import com.home.service.*;


public class Homework13 {
    private static String str1;

    public static void main(String[] args) {
        TextFormatter textFormatter = new TextFormatterImpl();
        textFormatter.wordCount();
        textFormatter.wordCount1();
        textFormatter.palindrome();//не выводится, разобраться
        textFormatter.palindromeWords();//не выводится, разобраться
        textFormatter.palindromeString();
    }
}

