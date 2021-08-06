package com.home1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String str1 = "Казак лазал по дереву. Чего же его туда занесло????.";  //строка
        String str2 = "дракадабра";  //строка
        String str3 = "жимолость";  //строка
        String str4 = "Топотала, топотала  Мадам топотиночки свои стоптала. А ещё потопочу Топотапочки стопчу. Не пойду я на попятки, Ведь остались топопятки. И пойду, пойду опять Я на пятках топотать. ";

        System.out.println(str2);
        System.out.println(str2.substring(str2.indexOf("а"), str2.lastIndexOf("б")));
        System.out.println("----------------------");

        char f1 = str3.charAt(3);
        char f2 = str3.charAt(0);
        System.out.println(str3);
        System.out.println(str3.replace(f1, f2));
        System.out.println("----------------------");


        System.out.println(str1);
        System.out.println("...");
        String[] str = str1.split(" ");
        for (int i = 0; i < str.length; i++) {
            String reverseString = new StringBuilder(str[i]).reverse().toString();
            if (reverseString.equalsIgnoreCase(str[i])) {
                System.out.println(str[i] + " является словом палиндромом");
            }
        }
        System.out.println("----------------------");


        System.out.println(str4);
        System.out.println("...");
        String delimeter = "\\.";
        String[] subStr = str4.split(delimeter);
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
            int i1 = subStr.length;
           // System.out.println(i1);
        }
    }


}





