package com.home1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String str1 = "Казак лазал по дереву. Чего же его туда занесло????.";  //строка
        String str2 = "дракадабра";  //строка
        String str3 = "жимолость";  //строка
        String str4 = "Топотала, топотала  Мадам топотиночки свои стоптала. А ещё потопочу Топотапочки стопчу. Не пойду я на попятки, Ведь остались топопятки. И пойду, пойду опять Я на пятках топотать. ";


        //вырезать подстраку из строки
        System.out.println(str2);
        System.out.println(str2.substring(str2.indexOf("а"), str2.lastIndexOf("б")));
        System.out.println("----------------------");

        //замена символов вхождения
        char f1 = str3.charAt(3);
        char f2 = str3.charAt(0);
        System.out.println(str3);
        System.out.println(str3.replace(f1, f2));
        System.out.println("----------------------");

// вывести слова палиндромы
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

//вывести предложения с 3-5 словами
        System.out.println(str4); //вывожу текст для наглядности
        System.out.println("...");//разделяю текст для наглядности
        String delimeter = "\\.";//ввожу переменную по которой будет текст разделяться на предложения
        String[] subStr = str4.split(delimeter);//массив предложений

        for (int i = 0; i < subStr.length; i++) {//бегу по массиву
            String[] result = subStr[i].split(" ");//разделяю каждое предложение на слова
            int count = result.length; //записываю в переменную количество слов в предложение
            if (count >= 3 && count <= 5) { //задаю условия, что больше 3 и меньше 5
                System.out.println(subStr[i]);

            String reverseString = new StringBuilder(result[i]).reverse().toString();
            if (reverseString.equalsIgnoreCase(result[i])) {
                System.out.println(result[i] + " является словом палиндромом");
            }
            System.out.println(subStr[i]);
        }
        }
    }
    }








