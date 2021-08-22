package com.home.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString

public class TextFormatterImpl implements TextFormatter {
    private String str;

    @Override
    public void wordCount(String str) {
        int number = 0;
        for (int i = 0; i < str.length(); i++) {//бежим по строке
            if (str.charAt(i) == ' ') {
                number++;
            }
        }
        System.out.println(number);
    }

    @Override
    public void wordCount1(String str) {
        String[] result = str.split(" ");
        int count = result.length;
        System.out.println(count);
    }

    @Override
    public void palindrome(String str) {
        String[] str1 = str.split("[^\\wа-яА-Я]+");
                for (int i = 0; i < str1.length; i++) {
            String reverseString = new StringBuilder(str1[i]).reverse().toString();
            if (reverseString.equalsIgnoreCase(str1[i])) {
                System.out.println(str1[i] + " - слово палиндромом" );
            }
        }
    }

    @Override
    public void palindromeString(String str) {
        String result = str.replaceAll("\\s+", "");
        StringBuffer stringBuffer = new StringBuffer(result);
        stringBuffer.reverse();
        String data = stringBuffer.toString();
        if (result.equalsIgnoreCase(data)) {
            System.out.println(str + " - строка является полиндромом");
        } else {
            System.out.println(str + "- строка не является полиндромом");
        }
    }
}



