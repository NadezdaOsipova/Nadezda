package com.home1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String str1 = "Казак лазал по дереву. Чего же его туда занесло????.";  //строка
        String str2 = "дракадабра";  //строка
        String str3 = "жимолость";  //строка
        String str4 = "Топотала, топотала  Мадам топотиночки свои стоптала. А ещё потопочу Топотапочки стопчу. Не пойду я на попятки, Ведь остались топопятки. И пойду, пойду опять Я на пятках топотать.";


        //вырезать подстраку из строки
        System.out.println(str2);
        System.out.println(str2.substring(str2.indexOf("а"), str2.lastIndexOf("б") + 1));
        System.out.println("----------------------");

        //замена символов вхождения
        char f1 = str3.charAt(3);//переменная для 3 индекса
        char f2 = str3.charAt(0);//переменная для 0 индекса
        System.out.println(str3);//вывожу текст для наглядности
        System.out.println(str3.replace(f1, f2));//замена индекса 3 на 0 индекс
        System.out.println("----------------------");

        // вывести слова палиндромы
        System.out.println(str1);//вывожу текст для наглядности
        System.out.println("...");//разделяю текст для наглядности
        String[] str = str1.split(" ");//разделяю строку на слова, записывая в массив
        for (int i = 0; i < str.length; i++) {//бегу по массиву
            String reverseString = new StringBuilder(str[i]).reverse().toString();//создается строчка-реверс
            if (reverseString.equalsIgnoreCase(str[i])) {//сравнивание изначальной строки со строкой-реверсом
                System.out.println(str[i] + " является словом палиндромом");//вывод на консоль
            }
        }
        System.out.println("----------------------");

        //вывести предложения с 3-5 словами либо словом палиндромом
        System.out.println(str4); //вывожу текст для наглядности
        System.out.println("...");//разделяю текст для наглядности
        String delimeter = "\\.";//ввожу переменную по которой будет текст разделяться на предложения
        String[] subStr = str4.split(delimeter);//массив предложений, разделеный переменной

        for (int i = 0; i < subStr.length; i++) {//бегу по массиву предложений
            String[] result = subStr[i].split(" ");//разделяю каждое предложение на слова
            int count = result.length; //записываю в переменную количество слов в предложение
            if (count >= 3 && count <= 5 && hasPalindrom(result[i])) {
                System.out.println(subStr[i]);
            }

            //!!!!!!!!!!!!!!!!!!!!!!не выводит нужное предложение !!!!!!!!!!!!!!!!!!!!!!!!!
            System.out.println();
        }
    }

    private static boolean hasPalindrom(String str4) {
        String reverseString = new StringBuilder(str4).reverse().toString();
        if (reverseString.equalsIgnoreCase(str4)) {
            return true;
        }
        return false;
    }
}


//  if (count >= 3 && count <= 5) { //задаю условия, что больше 3 и меньше 5
//      System.out.println(subStr[i]);//?? как вывести строку в которой палиндром????

//   String reverseString = new StringBuilder(result[i]).reverse().toString();
//   if (reverseString.equalsIgnoreCase(result[i])) {
//       System.out.println(result[i] + " является словом палиндромом");
//  }
//  System.out.println(subStr[i]);






