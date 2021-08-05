package com.home1;

public class HomeWork {
    public static void main(String[] args) {
         String str1 = "Казак лазал по дереву.Чего же его туда занесло????.";  //строка
         String str2 = "дракадабра";  //строка
         String str3 = "жимолость";  //строка

        System.out.println(str2.substring(str2.indexOf("а"),str2.lastIndexOf("б")));
        System.out.println("----------------------");

        char f1 = str3.charAt(3);
        char f2 = str3.charAt(0);
        System.out.println(str3);
        System.out.println(str3.replace(f1,f2));
        System.out.println("----------------------");

        String[] result = str1.split(" ");//доделать метод по нахождению слов палиндромов
        System.out.println(result);
        System.out.println("----------------------");
    }
}
