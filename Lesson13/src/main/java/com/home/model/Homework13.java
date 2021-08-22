package com.home.model;

import com.home.service.*;


public class Homework13 {
    //private static String str1;
    //  private  String str1 = "Мадам Анна шла в свой шалаш. Ее топот слышала вся округа. ";  //строка
    // private  String str2 = "Аргентина манит негра";  //строка

    public static void main(String[] args) {
        String str1 = "Мадам Анна шла в свой шалаш. Ее топот слышала вся округа. ";  //строка
        String str2 = "Аргентина манит негра";  //строка

        TextFormatter textFormatter = new TextFormatterImpl();
        textFormatter.wordCount(str1);
        textFormatter.wordCount1(str1);
        textFormatter.palindrome(str1);
        textFormatter.palindromeString(str2);
    }
}

