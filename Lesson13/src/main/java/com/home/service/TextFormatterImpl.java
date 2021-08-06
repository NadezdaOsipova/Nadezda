package com.home.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class TextFormatterImpl implements TextFormatter {

    private String str1 = "Мадам Анна шла в свой шалаш. Ее топот слышала вся округа. ";  //строка
    private static String str2 = "Аргентина манит негра";  //строка

    public TextFormatterImpl() {

    }

    @Override
    public void wordCount() {
        int number = 0;
        for (int i = 0; i < str1.length(); i++) {//бежим по строке
            if (str1.charAt(i) == ' ') {
                number++;
            }
        }
        System.out.println(number);
    }

    @Override
    public void wordCount1() {
        String[] result = str1.split(" ");
        int count = result.length;
        System.out.println(count);
    }


    public boolean palindrome() { //не выводится на консоль
        String[] str = str1.split("\\W+");
        for (int i = 0; i < str.length; i++) {
            String reverseString = new StringBuilder(str[i]).reverse().toString();
            if (reverseString.equalsIgnoreCase(str[i])) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void palindromeWords() { //не выводится на консоль
        String[] str = str1.split("\\W+");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length - 1; j++) {
                if (palindromeWord(str[i], str[j]))
                    System.out.printf("%s (%d)<>%s (%d)\n", str[i], i, str[j], j);
            }
        }
    }

    public boolean palindromeWord(String first, String second) {//разобраться с return
        if (first.length() != second.length())
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(second.length() - 1 - i)) {
                    return false;
                }
                return true;
            }
        return false;
    }

    //    StringBuffer предоставляет метод с именем reverse(), один из способов проверки палиндрома —
//    Создайте объект StringBuffer, передав необходимую строку в качестве параметра конструктору.
//    Обратное содержимое объекта с помощью метода reverse().
//    Преобразуйте объект StringBuffer в Sting с помощью метода toString().
//    Теперь сравните String и перевернутую, если true, данная строка является палиндромом.


    public void palindromeString() {
        String result = str2.replaceAll("\\s+", "");
        StringBuffer stringBuffer = new StringBuffer(result);
        stringBuffer.reverse();
        String data = stringBuffer.toString();
        if (result.equalsIgnoreCase(data)) {
            System.out.println("Строка является полиндромом");
        } else {
            System.out.println("Строка не является полиндромом");
        }
    }

}
