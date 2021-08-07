package com.home.service;

public interface TextFormatter {

    void wordCount(String str);//принимает строку и возвращает количество слов

    void wordCount1(String str);//принимает строку и возвращает количество слов (2 вариант)

    void palindrome(String str); //принимает строку и возвращает слова палиндроммы

    void palindromeString(String str); //принимает строку, проверяет является ли строкой-палиндромом

}
