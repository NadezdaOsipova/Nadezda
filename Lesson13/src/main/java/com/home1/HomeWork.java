package com.home1;

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
            if (count >= 3 && count <= 5) {
                System.out.println(subStr[i]);
            } else if (hasPalindrom(result[i])) {
                System.out.println(subStr[i]);
            } else {
                System.out.println("Нет предложений соответствующих заданым условиям");
            }
            //!!!!!!!!!!!!!!!!!!!!!!не выводит предложение со словом палиндромом  !!!!!!!!!!!!!!!!!!!!!!!!!
            System.out.println();
        }
    }

    private static boolean hasPalindrom(String str) {
        String[] SS = str.split("\\.");//массив предложений, разделеный переменной
        for (int i = 0; i < SS.length; i++) {//бегу по массиву
            String[] w = SS[i].split(" ");//разделяю каждое предложение на слова
            String reverseString = new StringBuilder(w[i]).reverse().toString();//создается слово-реверс
            if (reverseString.equalsIgnoreCase(SS[i])) {//сравнивание изначального слова со словом-реверсом
                return true;//вывод на консоль
            }
                  }

        return false;
    }
}


//  private static boolean hasPalindroms(String str4) {
//     String[] subStr = str4.split("\\.");
//     for (String SS : subStr) {
//         if (isPalindrome(SS)) {
//            System.out.println(SS);
//       }
//   }
//   return false;
//   }

//   private static boolean isPalindrome(String str4) {
//      return str4.equalsIgnoreCase(new StringBuilder(str4).reverse().toString());
//  }










